package mvc_Account_connDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// DAO : 데이터베이스 관련 메소드
public class AccountDAO {
	private Connection conn = null;
	
	private final String ERROR_NOT_FIND_ID = "해당 계좌번호가 존재하지 않습니다.";
	
	public AccountDAO() {
		getConnection();
	}
	
	// 디비 연결 시작
	private void getConnection() {
		try {
			String url = "jdbc:mariadb://localhost:3306/StudyJDBC";
			String user = "root";
			String password = "6995";
			
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			} catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			this.conn = DriverManager.getConnection(url,user, password);
			System.out.println("데이터베이스 연결 성공!");
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	// 디비 연결 해제 (서비스 종료시에 사용)
	public void disConnect() {
		try {
			if(conn != null) conn.close();
			System.out.println("데이터 베이스 연결 해제!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 중복 계좌 여부 확인
	public boolean isAccount(int id) {
		int res = 0;
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM Account WHERE id = '" + id + "'";
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.next(); // 한칸 뒤로 옮겨주기
			res = resultSet.getInt("cnt");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return res != 0 ? true : false;
	}
	
	// id 입력받아 해당하는 account 계정 반환 (한 계정)
	public AccountDTO selectOne(int id) {
		Statement statement = null;
		AccountDTO account = null;
		try {
			String sql = "SELECT * FROM Account WHERE id='" + id + "'";
			statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			if(resultSet.next()) {
				account = new AccountDTO(resultSet.getInt("id"), resultSet.getString("name"),
						resultSet.getInt("balance"));
			}
			else {
				System.out.println(ERROR_NOT_FIND_ID);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(statement != null) statement.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return account;
	}
	
	// 모든 계좌 정보 리스트에 담기 (모든 계정)
	public ArrayList<AccountDTO> selectAll(){
		Statement statement = null;
		ArrayList<AccountDTO> list = new ArrayList<>();
		try {
			String sql = "SELECT * FROM Account";
			statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				AccountDTO account = new AccountDTO(resultSet.getInt("id"), resultSet.getString("name"),
						resultSet.getInt("balance"));
				list.add(account);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(statement != null) statement.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	// 입금, 출금
	public boolean updateBalance(int id, long money, boolean flag) {
		// flag true: 입금 / false : 출금
		Statement statement = null;
		
		int upd = 0;
		try {
			String sql;
			if(flag) {
				sql = String.format("UPDATE Account SET balance = balance + %d WHERE (id = %d)",
						money, id);	
				System.out.println("입금이 완료되었습니다.");
			}
			else {
				sql = String.format("UPDATE Account SET balance = balance - %d WHERE (id = %d)",
						money, id);		
				System.out.println("출금이 완료되었습니다.");
			}
			statement = conn.createStatement();
			upd = statement.executeUpdate(sql); // 영향받은 행 갯수 반환
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(statement != null) statement.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return (upd != 0);
	}
	
	// 계좌 DB에 저장
	public boolean insertAccount(AccountDTO account) {
		// 계좌 생성전에 동일한 계좌 번호가 존재하는지 확인
		Statement statement = null;
		if(isAccount(account.getId())) { // 중복검사 메소드 호출 -> 중복값 있을 때
			System.out.println(account.getId() + "계좌가 존재합니다.");
			return false;
		}
		
		int upd = 0;
		
		try {
			String sql = String.format("INSERT INTO Account VALUES (%d, '%s', %d)"
					, account.getId(), account.getName(), account.getBalance());
			System.out.println(sql);
			statement = conn.createStatement();
			upd = statement.executeUpdate(sql); // 영향받은 행 갯수 반환
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(statement != null) statement.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return upd != 0 ? true : false;
	}
}
