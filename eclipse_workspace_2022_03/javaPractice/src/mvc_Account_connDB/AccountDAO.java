package mvc_Account_connDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// DAO : �����ͺ��̽� ���� �޼ҵ�
public class AccountDAO {
	private Connection conn = null;
	
	private final String ERROR_NOT_FIND_ID = "�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.";
	
	public AccountDAO() {
		getConnection();
	}
	
	// ��� ���� ����
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
			System.out.println("�����ͺ��̽� ���� ����!");
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	// ��� ���� ���� (���� ����ÿ� ���)
	public void disConnect() {
		try {
			if(conn != null) conn.close();
			System.out.println("������ ���̽� ���� ����!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// �ߺ� ���� ���� Ȯ��
	public boolean isAccount(int id) {
		int res = 0;
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM Account WHERE id = '" + id + "'";
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.next(); // ��ĭ �ڷ� �Ű��ֱ�
			res = resultSet.getInt("cnt");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return res != 0 ? true : false;
	}
	
	// id �Է¹޾� �ش��ϴ� account ���� ��ȯ (�� ����)
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
	
	// ��� ���� ���� ����Ʈ�� ��� (��� ����)
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
	// �Ա�, ���
	public boolean updateBalance(int id, long money, boolean flag) {
		// flag true: �Ա� / false : ���
		Statement statement = null;
		
		int upd = 0;
		try {
			String sql;
			if(flag) {
				sql = String.format("UPDATE Account SET balance = balance + %d WHERE (id = %d)",
						money, id);	
				System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
			}
			else {
				sql = String.format("UPDATE Account SET balance = balance - %d WHERE (id = %d)",
						money, id);		
				System.out.println("����� �Ϸ�Ǿ����ϴ�.");
			}
			statement = conn.createStatement();
			upd = statement.executeUpdate(sql); // ������� �� ���� ��ȯ
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
	
	// ���� DB�� ����
	public boolean insertAccount(AccountDTO account) {
		// ���� �������� ������ ���� ��ȣ�� �����ϴ��� Ȯ��
		Statement statement = null;
		if(isAccount(account.getId())) { // �ߺ��˻� �޼ҵ� ȣ�� -> �ߺ��� ���� ��
			System.out.println(account.getId() + "���°� �����մϴ�.");
			return false;
		}
		
		int upd = 0;
		
		try {
			String sql = String.format("INSERT INTO Account VALUES (%d, '%s', %d)"
					, account.getId(), account.getName(), account.getBalance());
			System.out.println(sql);
			statement = conn.createStatement();
			upd = statement.executeUpdate(sql); // ������� �� ���� ��ȯ
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
