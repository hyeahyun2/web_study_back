package mvc_Account_connDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


// toString 수정, 여러번 쓰이는 로직 메소드or변수로 묶어버리기
public class AccountManager {
	private Scanner stdIn;
	private Connection conn = null;
	
	private final String ERROR_NOT_FIND_ID = "해당 계좌번호가 존재하지 않습니다.";
	private final String INFO_LIST = "계좌번호\t성명\t잔액";
	
	public AccountManager() {
		getConnection();
		stdIn = new Scanner(System.in);
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
	private boolean isAccount(int id) {
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
//	private AccountDTO existID(int id) { // 동일한 계좌 유무 검색
//		for(AccountDTO account : list) {
//			if(account.getId() == id) {
//				return account;
//			}
//		}
//		return null;
//	}
	
//	private AccountDTO findAccount(int id) { // 동일 계좌 찾기
//		AccountDTO account = existID(id);
//		if(account == null) { // 동일 계좌가 존재하지 않을 때 에러 메세지 출력
//			System.out.println(ERROR_NOT_FIND_ID);
//		}
//		return account;
//	}
	
	// id 입력받아 해당하는 account 계정 반환 (한 계정)
	private AccountDTO selectOne(int id) {
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
	private ArrayList<AccountDTO> selectAll(){
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
	
	// 계좌 DB에 저장
	private boolean insertAccount(AccountDTO account) {
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
	
	// 1. 계좌 개설
	public void makeAccount() { 
		AccountDTO account = new AccountDTO();
		
		System.out.print("계좌 번호 : ");
		int id = stdIn.nextInt();
		account.setId(id);

		System.out.print("이름 : ");
		account.setName(stdIn.next());
		
		System.out.print("입금액 : ");
		account.setBalance(stdIn.nextLong());
		
		if(insertAccount(account)) {
			System.out.println("계좌가 개설되었습니다.");
		}
		else {
			System.out.println("계좌 생성에 실패했습니다.");
		}
		
	}
	
	// 2. 입금
	public void deposit() {
		System.out.print("계좌번호 : ");
		int id = stdIn.nextInt();
		
		System.out.print("입금액 : ");
		long money = stdIn.nextLong();
		
		AccountDTO account = selectOne(id);// 해당 계좌 찾아서 저장
		if(account != null) { // 동일한 계좌 존재
			account.setBalance(account.getBalance() + money);
			System.out.println("입금완료 되었습니다.");
		}
	}
	
	// 3. 출금
	public void withdraw() { 
		System.out.print("계좌번호 : ");
		int id = stdIn.nextInt();
		
		System.out.print("출금액 : ");
		long money = stdIn.nextLong();
		
		AccountDTO account = selectOne(id);
		if(account != null) { // 동일한 계좌 존재
			if(account.getBalance() < money) {
				System.out.println("잔액이 부족합니다.");
			}
			else { // 동일한 계좌 존재x
				account.setBalance(account.getBalance() - money);
				System.out.println("출금완료 되었습니다.");
			}
			return;
		}
	}
	
	// 4. 잔액 조회
	public void inquire() { 
		System.out.print("계좌번호 : ");
		int id = stdIn.nextInt();
		
		AccountDTO account = selectOne(id);
		if(account != null) { // 동일한 계좌 존재
			System.out.println(INFO_LIST);
			System.out.println(account.toString());
			return;
		}
	}
	
	// 5. 출력
	public void display() { 
		ArrayList<AccountDTO> list = selectAll();
		System.out.println(INFO_LIST);
		for(AccountDTO account : list) {
			System.out.println(account.toString());
		}
	}
}
