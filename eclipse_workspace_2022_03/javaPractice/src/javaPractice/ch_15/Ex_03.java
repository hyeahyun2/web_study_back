package javaPractice.ch_15;
/* ������ ��Ÿ���� Animal Ŭ������ ��ӹ޾Ƽ� ���� ��Ÿ���� bird Ŭ���� �ۼ�
 * */
class Animal {
	void walk() {
		System.out.println("���� �� ����");
	}
}
class Bird extends Animal {
	void fly() {
		System.out.println("���� �� ����");
	}
	void sing() {
		System.out.println("�뷡 �θ� �� ����");
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
