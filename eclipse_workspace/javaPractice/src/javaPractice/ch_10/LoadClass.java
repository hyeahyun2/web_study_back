package javaPractice.ch_10;

public class LoadClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar;// Ŭ������ ��ü�� ������ �� �ִ� �������� ����
		// ������ Ÿ�� : Car
		// new Ŭ������() : Ŭ������ ��ü�� ����
		mycar = new Car(); // ���������� ������ ��ü�� �ּҸ� ����
		
		System.out.println("�õ� ó�� �ʱ�ȭ : " + mycar.powerOn);
		System.out.println("�õ� ���� �ʱ�ȭ : " + mycar.color);
		System.out.println("������ �� �ʱ�ȭ : " + mycar.wheel);
		System.out.println("�ӷ� �ʱ�ȭ : " + mycar.speed);
		System.out.println("������ �۵� �ʱ�ȭ : " + mycar.wiperOn);
		
		mycar.power(); // �õ� �޼��� ����
		System.out.println("�õ� �޼��� ���� : " + mycar.powerOn);
		mycar.power(); // �õ� �޼��� ����
		System.out.println("�õ� �޼��� �絿�� : " + mycar.powerOn);
		
		mycar.color = "black";
		System.out.println("���� ���� ����" + mycar.color);
	}
}
