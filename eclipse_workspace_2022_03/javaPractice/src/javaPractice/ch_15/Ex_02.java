package javaPractice.ch_15;
/* 원을 나타내는 Circle 클래스를 상속받아서 피자를 나타내는 Pizza 클래스 작성
 * */
class Circle {
	protected int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
}
class Pizza extends Circle {
	protected String pName;
	protected int pSize; // 반지름 * 2
	public Pizza(String pName, int radius) {
		super(radius);
		this.pSize = radius * 2;
		this.pName = pName;
	}
	void print() {
		System.out.println("피자의 종류 : " + pName + ", 피자의 크기 : " + pSize);
	}
}
public class Ex_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza = new Pizza("Pepperoni", 10);
		pizza.print(); // 피자 종류, 피자 크기(지름) 나열
	}
}
