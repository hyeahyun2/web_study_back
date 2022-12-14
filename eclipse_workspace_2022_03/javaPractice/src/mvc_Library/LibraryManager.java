package mvc_Library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager extends BookDAO {
	
	Scanner scanner = new Scanner(System.in);
	
	private final String INPUT_BOOK_INFO = "등록할 책의 정보를 입력해 주세요.";
	private final String ERROR_DUPLICATE_BOOK_CODE = "중복되는 책 코드가 이미 존재합니다.";
	
	// 1. 책 등록
	public void register() {
		
		System.out.println(INPUT_BOOK_INFO);
		System.out.print("코드 : ");
		int id = Integer.parseInt(scanner.nextLine());
		if(idCheck(id)) {
			System.out.println(ERROR_DUPLICATE_BOOK_CODE);
			return;
		}
		System.out.print("제목 : ");
		String title = scanner.nextLine();
		System.out.print("작가 : ");
		String writer = scanner.nextLine();
		System.out.print("재고 숫자 : ");
		int number = Integer.parseInt(scanner.nextLine());
		
		BookDTO book = new BookDTO(id, title, writer, number, number);
		
		bookList.add(book);
		System.out.println("책 등록이 완료되었습니다.");
	}
	
	// 2. 책 검색
	public void Search() {
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
		int number = Integer.parseInt(scanner.nextLine());
		
		BookDTO book = selectOne(id);
		if(book.getNumber() < number) {
			System.out.println("재고가 " + book.getNumber() + "이여서 대여할 수 없습니다.");
		}
		else {
			book.setNumber(book.getNumber() - number);
			System.out.println(number + "권이 대여되었습니다.");
		}
	}
	
	// 4. 책 반납
	public void returnBook() {
		System.out.println("반납할 책의 코드를 입력해 주세요.");
		System.out.print("코드 : ");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.print("반납 권수 : ");
		int number = Integer.parseInt(scanner.nextLine());
		
		BookDTO book = selectOne(id);
		if(book.getTotalNum() < book.getNumber() + number) { // 책의 총 권수 < 반납 권수
			System.out.println("대여한 수보다 많이 반납할 수 없습니다.");
			System.out.println("반납 권수를 다시 확인해주세요.");
			return;
		}
		book.setNumber(book.getNumber() + number);
		System.out.println(number + "권이 반납되었습니다.");
	}
	
	// 5. 책 전체 출력
	public void printAll() {
		System.out.println("등록된 책의 정보는 아래와 같습니다.");
		for(BookDTO book : bookList) {
			System.out.println(book.toString());
		}
	}
	// 6. 
}
