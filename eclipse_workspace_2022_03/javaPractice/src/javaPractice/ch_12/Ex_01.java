package javaPractice.ch_12;
class Rocket {
	int x;
	int y;
	Rocket(int x, int y){
		this.x = x;
		this.y = y;
	}
	String printInfo() {
		return "x: " + x + ", y: " + y;
	}
	void moveUp() {
		y++;
	}
}
public class Ex_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ������ ��Ÿ���� Rocket Ŭ���� �ۼ�
		 * Rocket Ŭ������ �ʵ�� �޼���
		 * # �ʵ�
		 * x, y : ���� ������ ��ġ
		 * # �޼���
		 * Rocket(x, y) : ���� ������ ��ġ
		 * printInfo() : ���� ������ ���ڿ��� ��ȯ�ϴ� �޼���
		 * moveUp() : ������ y��ǥ�� 1��ŭ ����
		 * */
		Rocket rocket = new Rocket(10,20);
		System.out.println(rocket.printInfo()); // x: 10, y: 20
		rocket.moveUp();
		rocket.moveUp();
		System.out.println(rocket.printInfo()); // x: 10, y: 22
	}

}
