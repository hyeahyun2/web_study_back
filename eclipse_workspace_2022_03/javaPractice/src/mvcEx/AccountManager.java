package mvcEx;

import java.util.ArrayList;
import java.util.Scanner;

// toString ����, ������ ���̴� ���� �޼ҵ�or������ ���������
public class AccountManager {
	private ArrayList<Account> list;
	private Scanner stdIn;
	
	private final String ERROR_NOT_FIND_ID = "�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.";
	private final String INFO_LIST = "���¹�ȣ\t����\t�ܾ�";
	
	public AccountManager() {
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
	}
	
	private Account existID(int id) { // ������ ���� ���� �˻�
		for(Account account : list) {
			if(account.getId() == id) {
				return account;
			}
		}
		return null;
	}
	
	private Account findAccount(int id) { // ���� ���� ã��
		Account account = existID(id);
		if(account == null) { // ���� ���°� �������� ���� �� ���� �޼��� ���
			System.out.println(ERROR_NOT_FIND_ID);
		}
		return account;
	}
	
	public void makeAccount() { // ���� ����
		Account account = new Account();
		
		System.out.print("���� ��ȣ : ");
		int id = stdIn.nextInt();
		if(existID(id) != null) { // ���� �ߺ� �˻�
			System.out.println("�ߺ��� ���°� �����մϴ�.");
			makeAccount();
			return;
		}
		account.setId(id);

		System.out.print("�̸� : ");
		account.setName(stdIn.next());
		
		System.out.print("�Աݾ� : ");
		account.setBalance(stdIn.nextLong());
		
		list.add(account);
		
		System.out.println("���°� �����Ǿ����ϴ�.");
		System.out.println(list.toString() + "\t");
	}
	
	public void deposit() { // �Ա�
		System.out.print("���¹�ȣ : ");
		int id = stdIn.nextInt();
		
		System.out.print("�Աݾ� : ");
		long money = stdIn.nextLong();
		
		Account account = findAccount(id);// �ش� ���� ã�Ƽ� ����
		if(account != null) { // ������ ���� ����
			account.setBalance(account.getBalance() + money);
			System.out.println("�ԱݿϷ� �Ǿ����ϴ�.");
		}
	}
	
	public void withdraw() { // ���
		System.out.print("���¹�ȣ : ");
		int id = stdIn.nextInt();
		
		System.out.print("��ݾ� : ");
		long money = stdIn.nextLong();
		
		
		Account account = findAccount(id);// �ش� ���� ã�Ƽ� ����
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
	
	public void inquire() { // �ܾ� ��ȸ
		System.out.print("���¹�ȣ : ");
		int id = stdIn.nextInt();
		Account account = findAccount(id);// �ش� ���� ã�Ƽ� ����
		
		if(account != null) { // ������ ���� ����
			System.out.println(INFO_LIST);
			System.out.println(account.toString());
			return;
		}
	}
	
	public void display() { //���
		System.out.println(INFO_LIST);
		for(Account account : list) {
			System.out.println(account.toString());
		}
	}
}
