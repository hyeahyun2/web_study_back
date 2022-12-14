package mvc_Library_connDB;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager extends BookDAO {
	
	Scanner scanner = new Scanner(System.in);
	
	private final String INPUT_BOOK_INFO = "등록할 책의 정보를 입력해 주세요.";
	protected final String ERROR_DUPLICATE_BOOK_CODE = "중복되는 책 코드가 이미 존재합니다.";
	
	// 1. 책 등록
	public void register() {
		
		System.out.println(INPUT_BOOK_INFO);
		System.out.print("코드 : ");
		int id = Integer.parseInt(scanner.nextLine());
		if(isBook(id)) {
			System.out.println(ERROR_DUPLICATE_BOOK_CODE);
			return;
		}
		System.out.print("제목 : ");
		String title = scanner.nextLine();
		System.out.print("작가 : ");
		String writer = scanner.nextLine();
		System.out.print("재고 숫자 : ");
		int bookNum = Integer.parseInt(scanner.nextLine());
		
		BookDTO book = new BookDTO(id, title, writer, bookNum, bookNum);
		
		if(insertBook(book)) {
			System.out.println("책 등록이 완료되었습니다.");
		}
	}
	
	// 2. 책 검색
	public void search() {
		System.out.println("검색할 책의 제목을 입력해 주세요.");
		System.out.print("제목 : ");
		String title = scanner.nextLine();
		
		System.out.println("검색한 책의 정보는 아래와 같습니다.");
		ArrayList<BookDTO> includeTitle = selectTitle(title);
		for(BookDTO book : includeTitle) {
			System.out.println(book.toString());
		}
	}
	// 3. 책 대여
	public void rent() {
		System.out.println("대여할 책의 코드를 입력해 주세요.");
		System.out.print("코드 : ");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.print("대여 권수 : ");
		int bookNum = Integer.parseInt(scanner.nextLine());
		
		if(updateRentInfo(id, bookNum, false)) {
			System.out.println(bookNum + "권이 대여되었습니다.");
		}
		else {
			System.out.println("대여 등록이 실패했습니다 ..");
		}
	}
	
	// 4. 책 반납
	public void returnBook() {
		System.out.println("반납할 책의 코드를 입력해 주세요.");
		System.out.print("코드 : ");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.print("반납 권수 : ");
		int bookNum = Integer.parseInt(scanner.nextLine());
		
		if(updateRentInfo(id, bookNum, true)) {
			System.out.println(bookNum + "권이 반납되었습니다.");
		}
		else {
			System.out.println("반납 등록이 실패했습니다 ..");
		}
	}
	
	// 5. 책 전체 출력
	public void printAll() {
		System.out.println("등록된 책의 정보는 아래와 같습니다.");
		for(BookDTO book : selectAll()) {
			System.out.println(book.toString());
		}
	}
	// 6. 프로그램 종료
	public void exitProgram() {
		System.out.println("프로그램을 종료합니다.");
		disConnect();
	}
}
