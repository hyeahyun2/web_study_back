package javaPractice.ch_10;

public class LoadTv2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv(); 
		Tv t2 = new Tv();
		System.out.println("t1.toString()���� " + t1.toString() + "�Դϴ�.");
		System.out.println("t2.toString()���� " + t2.toString() + "�Դϴ�.");
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		System.out.println();

		t1.channel = 7;
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		System.out.println();
		
		t1 = t2; // t2�� ������ �ּҰ��� t1�� ���� (t1�� �ּҰ��� �ٲ�)
		System.out.println("t1.toString()���� " + t1.toString() + "�Դϴ�.");
		System.out.println("t2.toString()���� " + t2.toString() + "�Դϴ�.");
		t1.channel = 27;
		System.out.println("t1�� channel���� 27�� �����Ͽ����ϴ�.");
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}
}
