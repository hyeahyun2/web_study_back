package mvc_Account_connDB;

import java.util.ArrayList;
import java.util.Scanner;

// toString ����, ������ ���̴� ���� �޼ҵ�or������ ���������
public class AccountManager {
	private Scanner stdIn;
	private AccountDAO accountDAO;
	
	private final String INFO_LIST = "���¹�ȣ\t����\t�ܾ�";
	private final String ERROR_NOT_FIND_ID = "�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.";
	
	public AccountManager() {
		accountDAO = new AccountDAO();
		stdIn = new Scanner(System.in);
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
		
		if(accountDAO.insertAccount(account)) {
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
		
		
		if(accountDAO.isAccount(id)) { // �ߺ��� id ���� �ִ��� Ȯ��
			accountDAO.updateBalance(id, money, true); // ���� ó��, ó�� ���������� �Ϸ� -> true
		}
		else {
			System.out.println(ERROR_NOT_FIND_ID);
		}
	}
	
	// 3. ���
	public void withdraw() { 
		System.out.print("���¹�ȣ : ");
		int id = stdIn.nextInt();
		
		System.out.print("��ݾ� : ");
		long money = stdIn.nextLong();
		
		
		if(accountDAO.isAccount(id)) { // �ߺ��� id ���� �ִ��� Ȯ��
			AccountDTO account = accountDAO.selectOne(id);
			if(account.getBalance() < money) { // �� ����
				System.out.println("�ܾ��� �����մϴ�.");
			}
			else {
				accountDAO.updateBalance(id, money, false); // ���� ó��, ó�� ���������� �Ϸ� -> true
			}
		}
		else {
			System.out.println(ERROR_NOT_FIND_ID);
		}
	}
	
	// 4. �ܾ� ��ȸ
	public void inquire() { 
		System.out.print("���¹�ȣ : ");
		int id = stdIn.nextInt();
		
		AccountDTO account = accountDAO.selectOne(id);
		if(account != null) { // ������ ���� ����
			System.out.println(INFO_LIST);
			System.out.println(account.toString());
			return;
		}
	}
	
	// 5. ���
	public void display() { 
		ArrayList<AccountDTO> list = accountDAO.selectAll();
		System.out.println(INFO_LIST);
		for(AccountDTO account : list) {
			System.out.println(account.toString());
		}
	}
	
	// 6. ���α׷� ����
	public void exitProgram() {
		System.out.println("���α׷��� �����մϴ�.");
		accountDAO.disConnect();
	}
}
