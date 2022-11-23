package javaPractice.ch_14;
class Student2 {
	void learn() {
		System.out.println("배우기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("선생님 안녕하세요!");
	}
}
class Leader extends Student2 {
	void lead() {}
	@Override
	void say() {
		System.out.println("선생님께 인사"); // 오버라이딩
		super.say(); // 부모클래스의 메서드 실행
	}
}

public class LoadStudent {
	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.eat();
		leader.say();
	}

}
