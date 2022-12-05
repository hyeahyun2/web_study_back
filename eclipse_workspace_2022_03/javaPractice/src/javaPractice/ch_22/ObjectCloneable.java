package javaPractice.ch_22;
/* 참조형 변수끼리 대입하면 참조 복사가 되기 때문에 같은 대상을 가르킴.
 * 독립적인 사본을 만들 때는 clone() 메서드를 사용.
 * 완전한 사본을 만들어 복사본을 리턴
 * */
class Point { // 원점을 의미하는 Point 클래스
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
//개체를 복제해도 된다는 의미로 Cloneable 인터페이스를 함께 선언
class Circle implements Cloneable { 
	// Cloneable을 구현해야 복제 가능
	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "원점은 " + point + "이고, 반지름은 " + radius + "입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// clone() 메서드를 사용할 때 발생할 수 있는 오류를 예외처리 함.
		return super.clone();
	}
}
public class ObjectCloneable {
	public static void main(String[] args) throws CloneNotSupportedException {
		/* Object clone() : 객체를 복제하여 통일한 멤버 변수를 가진 인스턴스를 생성.
		 * 객체를 복제해 또 다른 객체를 반환.
		 * 객체 원본을 유지해 놓고 복사본을 사용한다거나, 기본 툴(prototype)의 복사본을 사용해
		 * 동일한 인스턴스를 만들어 복잡한 생성과정을 간단히 하려는 경우 사용.
		 * */
		// clone() 메서드로 인스턴스 복제하기
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle)circle.clone();
		
		// 값은 동일
		System.out.println(circle);
		System.out.println(copyCircle);
		
		// 주소 값은 다름.
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}
}
