package mvc_Library_connDB;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager extends BookDAO {
	
	Scanner scanner = new Scanner(System.in);
	
	private final String INPUT_BOOK_INFO = "����� å�� ������ �Է��� �ּ���.";
	protected final String ERROR_DUPLICATE_BOOK_CODE = "�ߺ��Ǵ� å �ڵ尡 �̹� �����մϴ�.";
	
	// 1. å ���
	public void register() {
		
		System.out.println(INPUT_BOOK_INFO);
		System.out.print("�ڵ� : ");
		int id = Integer.parseInt(scanner.nextLine());
		if(isBook(id)) {
			System.out.println(ERROR_DUPLICATE_BOOK_CODE);
			return;
		}
		System.out.print("���� : ");
		String title = scanner.nextLine();
		System.out.print("�۰� : ");
		String writer = scanner.nextLine();
		System.out.print("��� ���� : ");
		int bookNum = Integer.parseInt(scanner.nextLine());
		
		BookDTO book = new BookDTO(id, title, writer, bookNum, bookNum);
		
		if(insertBook(book)) {
			System.out.println("å ����� �Ϸ�Ǿ����ϴ�.");
		}
	}
	
	// 2. å �˻�
	public void search() {
		System.out.println("�˻��� å�� ������ �Է��� �ּ���.");
		System.out.print("���� : ");
		String title = scanner.nextLine();
		
		System.out.println("�˻��� å�� ������ �Ʒ��� �����ϴ�.");
		ArrayList<BookDTO> includeTitle = selectTitle(title);
		for(BookDTO book : includeTitle) {
			System.out.println(book.toString());
		}
	}
	// 3. å �뿩
	public void rent() {
		System.out.println("�뿩�� å�� �ڵ带 �Է��� �ּ���.");
		System.out.print("�ڵ� : ");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.print("�뿩 �Ǽ� : ");
		int bookNum = Integer.parseInt(scanner.nextLine());
		
		if(updateRentInfo(id, bookNum, false)) {
			System.out.println(bookNum + "���� �뿩�Ǿ����ϴ�.");
		}
		else {
			System.out.println("�뿩 ����� �����߽��ϴ� ..");
		}
	}
	
	// 4. å �ݳ�
	public void returnBook() {
		System.out.println("�ݳ��� å�� �ڵ带 �Է��� �ּ���.");
		System.out.print("�ڵ� : ");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.print("�ݳ� �Ǽ� : ");
		int bookNum = Integer.parseInt(scanner.nextLine());
		
		if(updateRentInfo(id, bookNum, true)) {
			System.out.println(bookNum + "���� �ݳ��Ǿ����ϴ�.");
		}
		else {
			System.out.println("�ݳ� ����� �����߽��ϴ� ..");
		}
	}
	
	// 5. å ��ü ���
	public void printAll() {
		System.out.println("��ϵ� å�� ������ �Ʒ��� �����ϴ�.");
		for(BookDTO book : selectAll()) {
			System.out.println(book.toString());
		}
	}
	// 6. ���α׷� ����
	public void exitProgram() {
		System.out.println("���α׷��� �����մϴ�.");
		disConnect();
	}
}
