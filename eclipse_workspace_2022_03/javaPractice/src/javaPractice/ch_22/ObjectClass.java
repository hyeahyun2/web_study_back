package javaPractice.ch_22;
class Book {
	int bookNumber; // å ��ȣ
	String bookTitle; // ����
	
	public Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	// toString() �޼��带 ���� �������ϸ� ��ü�� ���� ������ �̿��� ���ϴ� ���ڿ��� ǥ��
	@Override
	public String toString() {
		return bookTitle + ", " + bookNumber;
	}
	
}
public class ObjectClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Object Ŭ������ toString() �޼��� �̿��ϱ� */
		Book book1 = new Book(200, "����");
		
		// String toString() : ��ü�� ���ڿ��� ǥ���Ͽ� ��ȯ.
				// -> �������Ͽ� ��ü�� ���� �����̳� Ư�� ��� ������ ��ȯ
		System.out.println(book1); // �ν��Ͻ� ����(Ŭ���� �̸�, �ּ� ��)
		System.out.println(book1.toString()); // toString �޼���� �ν��Ͻ� ������ ������
	}

}
