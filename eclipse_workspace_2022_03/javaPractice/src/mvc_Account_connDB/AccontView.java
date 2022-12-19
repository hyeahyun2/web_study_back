package mvc_Account_connDB;

import java.util.Scanner;

public class AccontView {
	public static void main(String[] args) {
		AccountManager manager = new AccountManager();
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			printMenu();
			System.out.print("����: ");
			int choice = stdIn.nextInt();
			switch(choice) {
			case 1:
				manager.makeAccount();
				break;
			case 2: 
				manager.deposit();
				break;
			case 3:
				manager.withdraw();
				break;
			case 4:
				manager.inquire();
				break;
			case 5:
				manager.display();
				break;
			case 6:
				manager.exitProgram();
				stdIn.close();
				return;
			default:
				System.out.println("�߸������̽��ϴ�.\n�ٽü������ּ���.");
				break;
			}
		}
	}
	public static void printMenu() {
		System.out.println("========== Menu ===========");
		System.out.println("1. ���°���");
		System.out.println("2. �Ա�");
		System.out.println("3. ���");
		System.out.println("4. �ܾ���ȸ");
		System.out.println("5. ��ü���");
		System.out.println("6. ���α׷� ����");
		System.out.println();
	}
	
}