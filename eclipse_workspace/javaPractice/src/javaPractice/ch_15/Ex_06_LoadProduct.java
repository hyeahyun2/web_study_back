package javaPractice.ch_15;

public class Ex_06_LoadProduct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer buyer = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		buyer.buy(tv);
		buyer.buy(com);
		
		System.out.println("현재 남은 돈은 " + buyer.money + "만원 입니다.");
		System.out.println("현재 보너스점수는 " + buyer.bonusPoint + "점 입니다.");
	}
}
