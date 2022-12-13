package mvc_Account_connDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


// toString ����, ������ ���̴� ���� �޼ҵ�or������ ���������
public class AccountManager {
	private Scanner stdIn;
	private Connection conn = null;
	
	private final String ERROR_NOT_FIND_ID = "�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.";
	private final String INFO_LIST = "���¹�ȣ\t����\t�ܾ�";
	
	public AccountManager() {
		getConnection();
		stdIn = new Scanner(System.in);
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
	private boolean isAccount(int id) {
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
//	private AccountDTO existID(int id) { // ������ ���� ���� �˻�
//		for(AccountDTO account : list) {
//			if(account.getId() == id) {
//				return account;
//			}
//		}
//		return null;
//	}
	
//	private AccountDTO findAccount(int id) { // ���� ���� ã��
//		AccountDTO account = existID(id);
//		if(account == null) { // ���� ���°� �������� ���� �� ���� �޼��� ���
//			System.out.println(ERROR_NOT_FIND_ID);
//		}
//		return account;
//	}
	
	// id �Է¹޾� �ش��ϴ� account ���� ��ȯ (�� ����)
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
	
	// ��� ���� ���� ����Ʈ�� ��� (��� ����)
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
	
	// ���� DB�� ����
	private boolean insertAccount(AccountDTO account) {
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
	
	// 1. ���� ����
	public void makeAccount() { 
		AccountDTO account = new AccountDTO();
		
		System.out.print("���� ��ȣ : ");
		int id = stdIn.nextInt();
		account.setId(id);

		System.out.print("�̸� : ");
		account.setName(stdIn.next());
		
		System.out.print("�Աݾ� : ");
		account.setBalance(stdIn.nextLong());
		
		if(insertAccount(account)) {
			System.out.println("���°� �����Ǿ����ϴ�.");
		}
		else {
			System.out.println("���� ������ �����߽��ϴ�.");
		}
		
	}
	
	// 2. �Ա�
	public void deposit() {
		System.out.print("���¹�ȣ : ");
		int id = stdIn.nextInt();
		
		System.out.print("�Աݾ� : ");
		long money = stdIn.nextLong();
		
		AccountDTO account = selectOne(id);// �ش� ���� ã�Ƽ� ����
		if(account != null) { // ������ ���� ����
			account.setBalance(account.getBalance() + money);
			System.out.println("�ԱݿϷ� �Ǿ����ϴ�.");
		}
	}
	
	// 3. ���
	public void withdraw() { 
		System.out.print("���¹�ȣ : ");
		int id = stdIn.nextInt();
		
		System.out.print("��ݾ� : ");
		long money = stdIn.nextLong();
		
		AccountDTO account = selectOne(id);
		if(account != null) { // ������ ���� ����
			if(account.getBalance() < money) {
				System.out.println("�ܾ��� �����մϴ�.");
			}
			else { // ������ ���� ����x
				account.setBalance(account.getBalance() - money);
				System.out.println("��ݿϷ� �Ǿ����ϴ�.");
			}
			return;
		}
	}
	
	// 4. �ܾ� ��ȸ
	public void inquire() { 
		System.out.print("���¹�ȣ : ");
		int id = stdIn.nextInt();
		
		AccountDTO account = selectOne(id);
		if(account != null) { // ������ ���� ����
			System.out.println(INFO_LIST);
			System.out.println(account.toString());
			return;
		}
	}
	
	// 5. ���
	public void display() { 
		ArrayList<AccountDTO> list = selectAll();
		System.out.println(INFO_LIST);
		for(AccountDTO account : list) {
			System.out.println(account.toString());
		}
	}
}
