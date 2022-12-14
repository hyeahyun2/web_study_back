package mvc_Library_connDB;

import java.util.Scanner;

public class LibraryView {
	public static void main(String[] args) {
		LibraryManager library = new LibraryManager();
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			printMenu();
			System.out.print("선택: ");
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
				System.out.println("잘못누르셨습니다.\n다시선택해주세요.");
				break;
			}
		}
	}
	
	static void printMenu() {
		System.out.println("========== Menu ==========");
		System.out.println("1. 책 등록");
		System.out.println("2. 책 검색");
		System.out.println("3. 책 대여");
		System.out.println("4. 책 반납");
		System.out.println("5. 책 전체출력");
		System.out.println("6. 책 종료");
	}
}
