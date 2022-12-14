package mvc_Library_connDB;

import java.util.Scanner;

public class LibraryView {
	public static void main(String[] args) {
		LibraryManager library = new LibraryManager();
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			printMenu();
			System.out.print("����: ");
			int choice = Integer.parseInt(stdIn.nextLine());
			switch(choice) {
			case 1:
				library.register();
				break;
			case 2: 
				library.search();
				break;
			case 3:
				library.rent();
				break;
			case 4:
				library.returnBook();
				break;
			case 5:
				library.printAll();
				break;
			case 6:
				library.exitProgram();
				stdIn.close();
				return;
			default:
				System.out.println("�߸������̽��ϴ�.\n�ٽü������ּ���.");
				break;
			}
		}
	}
	
	static void printMenu() {
		System.out.println("========== Menu ==========");
		System.out.println("1. å ���");
		System.out.println("2. å �˻�");
		System.out.println("3. å �뿩");
		System.out.println("4. å �ݳ�");
		System.out.println("5. å ��ü���");
		System.out.println("6. å ����");
	}
}
