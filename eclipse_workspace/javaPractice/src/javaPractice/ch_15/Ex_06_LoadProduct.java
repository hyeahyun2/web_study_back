package javaPractice.ch_15;

public class Ex_06_LoadProduct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer buyer = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		buyer.buy(tv);
		buyer.buy(com);
		
		System.out.println("���� ���� ���� " + buyer.money + "���� �Դϴ�.");
		System.out.println("���� ���ʽ������� " + buyer.bonusPoint + "�� �Դϴ�.");
	}
}
