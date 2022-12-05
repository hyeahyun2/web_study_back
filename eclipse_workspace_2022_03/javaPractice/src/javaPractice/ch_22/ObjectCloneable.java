package javaPractice.ch_22;
/* ������ �������� �����ϸ� ���� ���簡 �Ǳ� ������ ���� ����� ����Ŵ.
 * �������� �纻�� ���� ���� clone() �޼��带 ���.
 * ������ �纻�� ����� ���纻�� ����
 * */
class Point { // ������ �ǹ��ϴ� Point Ŭ����
	int x;
	int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
}
//��ü�� �����ص� �ȴٴ� �ǹ̷� Cloneable �������̽��� �Բ� ����
class Circle implements Cloneable { 
	// Cloneable�� �����ؾ� ���� ����
	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "������ " + point + "�̰�, �������� " + radius + "�Դϴ�.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// clone() �޼��带 ����� �� �߻��� �� �ִ� ������ ����ó�� ��.
		return super.clone();
	}
}
public class ObjectCloneable {
	public static void main(String[] args) throws CloneNotSupportedException {
		/* Object clone() : ��ü�� �����Ͽ� ������ ��� ������ ���� �ν��Ͻ��� ����.
		 * ��ü�� ������ �� �ٸ� ��ü�� ��ȯ.
		 * ��ü ������ ������ ���� ���纻�� ����Ѵٰų�, �⺻ ��(prototype)�� ���纻�� �����
		 * ������ �ν��Ͻ��� ����� ������ ���������� ������ �Ϸ��� ��� ���.
		 * */
		// clone() �޼���� �ν��Ͻ� �����ϱ�
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle)circle.clone();
		
		// ���� ����
		System.out.println(circle);
		System.out.println(copyCircle);
		
		// �ּ� ���� �ٸ�.
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}
}
