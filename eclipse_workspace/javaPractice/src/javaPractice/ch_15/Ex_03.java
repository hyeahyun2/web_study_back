package javaPractice.ch_15;
/* 동물을 나타내는 Animal 클래스를 상속받아서 새를 나타내는 bird 클래스 작성
 * */
class Animal {
	void walk() {
		System.out.println("걸을 수 있음");
	}
}
class Bird extends Animal {
	void fly() {
		System.out.println("날을 수 있음");
	}
	void sing() {
		System.out.println("노래 부를 수 있음");
	}
}
public class Ex_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}

}
