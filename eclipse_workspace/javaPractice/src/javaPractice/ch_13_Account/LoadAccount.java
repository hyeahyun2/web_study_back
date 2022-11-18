package javaPractice.ch_13_Account;

import java.util.Scanner;

public class LoadAccount {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("------------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			} else {
				System.out.println("1���� 5������ ���ڷ� �Է����ּ���.");
			}
			
		}
		System.out.println("���α׷� ����");
	}
	
	// ���� ����
	private static void createAccount() {
		System.out.println("-------------");
		System.out.println("���»���");
		System.out.println("-------------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		
		System.out.print("������: ");
		String owner = scanner.next();
		
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();
		
		accountArray[idx] = new Account(ano, owner, balance);
		idx ++;
	}
	// ���¸�� ����
	private static void accountList() {
		System.out.println("-------------");
		System.out.println("���¸��");
		System.out.println("-------------");
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				break;
			}
			System.out.println(accountArray[i].getAno() + "  " + 
					accountArray[i].getOwner() + "  " + accountArray[i].getBalance());
		}
	}
	// �����ϱ�
	private static void deposit() {
		System.out.println("-------------");
		System.out.println("����");
		System.out.println("-------------");
		
		System.out.print("���¹�ȣ: ");
		String userAno = scanner.next();
		
		System.out.print("���ݾ�: ");
		int inputBalance = scanner.nextInt();
		
		System.out.print("���: ");
		Account userAcc = findAccount(userAno);
		if(userAcc == null) {
			System.out.println("���°� �����ϴ�.");
		}
		else {
			userAcc.setBalance(inputBalance);
			System.out.println("������ �����Ǿ����ϴ�.");
		}
	}
	// ����ϱ�
	private static void withdraw() {
		System.out.println("-------------");
		System.out.println("���");
		System.out.println("-------------");
		
		System.out.print("���¹�ȣ: ");
		String userAno = scanner.next();
		
		System.out.print("��ݾ�: ");
		int outputBalance = scanner.nextInt();
		
		System.out.print("���: ");
		Account userAcc = findAccount(userAno);
		if(userAcc == null) {
			System.out.println("���°� �����ϴ�.");
		}
		else if(outputBalance > userAcc.getBalance()) {
			System.out.println("�ܾ׺��� ��ݾ��� Ŀ�� ��ݿ� �����߽��ϴ�.");
		}
		else {
			userAcc.setBalance(-outputBalance);
			System.out.println("����� �����Ǿ����ϴ�.");
		}
	}

	// ���¹�ȣ �Է¹޾� ������ ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}
