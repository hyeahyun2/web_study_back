package javaPractice.ch_15;

public class Product {
	int price; // 제품 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스 점수
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0); // 보너스 점수는 제품가격의 10%
	}
}
