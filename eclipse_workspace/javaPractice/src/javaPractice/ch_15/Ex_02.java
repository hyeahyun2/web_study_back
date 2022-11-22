package javaPractice.ch_15;
/* ���� ��Ÿ���� Circle Ŭ������ ��ӹ޾Ƽ� ���ڸ� ��Ÿ���� Pizza Ŭ���� �ۼ�
 * */
class Circle {
	protected int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
}
class Pizza extends Circle {
	protected String pName;
	protected int pSize; // ������ * 2
	public Pizza(String pName, int radius) {
		super(radius);
		this.pSize = radius * 2;
		this.pName = pName;
	}
	void print() {
		System.out.println("������ ���� : " + pName + ", ������ ũ�� : " + pSize);
	}
}
public class Ex_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza = new Pizza("Pepperoni", 10);
		pizza.print(); // ���� ����, ���� ũ��(����) ����
	}
}
