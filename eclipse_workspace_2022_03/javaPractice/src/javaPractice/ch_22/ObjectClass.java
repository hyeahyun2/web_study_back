package javaPractice.ch_22;
class Book {
	int bookNumber; // 책 번호
	String bookTitle; // 제목
	
	public Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	// toString() 메서드를 직접 재정의하면 객체의 참조 변수를 이용해 원하는 문자열을 표현
	@Override
	public String toString() {
		return bookTitle + ", " + bookNumber;
	}
	
}
public class ObjectClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Object 클래스의 toString() 메서드 이용하기 */
		Book book1 = new Book(200, "개미");
		
		// String toString() : 객체를 문자열로 표현하여 반환.
				// -> 재정의하여 객체에 대한 설명이나 특정 멤버 변수를 반환
		System.out.println(book1); // 인스턴스 정보(클래스 이름, 주소 값)
		System.out.println(book1.toString()); // toString 메서드로 인스턴스 정보를 보여줌
	}

}
