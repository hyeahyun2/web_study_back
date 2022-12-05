package javaPractice.ch_22;
/* book1 ��ü�� book2�� ������ �� �ְ� clone() �޼��带 �������̵� �ϱ�!
 * */
class MyBook implements Cloneable {
	String title;

	public MyBook(String title) {
		this.title = title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class Ex_02_Clone {
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		MyBook book1 = new MyBook("�ڹ�");
		MyBook book2 = (MyBook)book1.clone();
		System.out.println(book2.title);
	}

}
