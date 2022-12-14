package mvc_Library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager extends BookDAO {
	
	Scanner scanner = new Scanner(System.in);
	
	private final String INPUT_BOOK_INFO = "����� å�� ������ �Է��� �ּ���.";
	private final String ERROR_DUPLICATE_BOOK_CODE = "�ߺ��Ǵ� å �ڵ尡 �̹� �����մϴ�.";
	
	// 1. å ���
	public void register() {
		
		System.out.println(INPUT_BOOK_INFO);
		System.out.print("�ڵ� : ");
		int id = Integer.parseInt(scanner.nextLine());
		if(idCheck(id)) {
			System.out.println(ERROR_DUPLICATE_BOOK_CODE);
			return;
		}
		System.out.print("���� : ");
		String title = scanner.nextLine();
		System.out.print("�۰� : ");
		String writer = scanner.nextLine();
		System.out.print("��� ���� : ");
		int number = Integer.parseInt(scanner.nextLine());
		
		BookDTO book = new BookDTO(id, title, writer, number, number);
		
		bookList.add(book);
		System.out.println("å ����� �Ϸ�Ǿ����ϴ�.");
	}
	
	// 2. å �˻�
	public void Search() {
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
		int number = Integer.parseInt(scanner.nextLine());
		
		BookDTO book = selectOne(id);
		if(book.getNumber() < number) {
			System.out.println("��� " + book.getNumber() + "�̿��� �뿩�� �� �����ϴ�.");
		}
		else {
			book.setNumber(book.getNumber() - number);
			System.out.println(number + "���� �뿩�Ǿ����ϴ�.");
		}
	}
	
	// 4. å �ݳ�
	public void returnBook() {
		System.out.println("�ݳ��� å�� �ڵ带 �Է��� �ּ���.");
		System.out.print("�ڵ� : ");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.print("�ݳ� �Ǽ� : ");
		int number = Integer.parseInt(scanner.nextLine());
		
		BookDTO book = selectOne(id);
		if(book.getTotalNum() < book.getNumber() + number) { // å�� �� �Ǽ� < �ݳ� �Ǽ�
			System.out.println("�뿩�� ������ ���� �ݳ��� �� �����ϴ�.");
			System.out.println("�ݳ� �Ǽ��� �ٽ� Ȯ�����ּ���.");
			return;
		}
		book.setNumber(book.getNumber() + number);
		System.out.println(number + "���� �ݳ��Ǿ����ϴ�.");
	}
	
	// 5. å ��ü ���
	public void printAll() {
		System.out.println("��ϵ� å�� ������ �Ʒ��� �����ϴ�.");
		for(BookDTO book : bookList) {
			System.out.println(book.toString());
		}
	}
	// 6. 
}
