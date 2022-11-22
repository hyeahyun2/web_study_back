package javaPractice.ch_15;

import java.util.ArrayList;

public class Buyer { // 고객, 물건을 사는 사람
	int money = 1000; // 소유금액
	int bonusPoint = 0; // 보너스점수 (해당고객의)
	
//	Product[] item = new Product[10]; // 구입한 제품 저장하기 위한 배열
//	int i = 0; // 카운팅 변수 (물건산 개수)
	
	ArrayList item = new ArrayList();
	
	void buy(Product p) { // 매개변수 타입 = 부모 클래스 타입 -> 다형성 이용
						// 입력받는 변수는 'new 자식클래스'로 정의된 변수
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
//		item[i++] = p; // 인덱스번호 i번째에 산 물건명 저장
		item.add(p);
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	void refund(Product p) { // 구입한 제품 환불
		if(item.remove(p)) { // 제품을 ArrayList에서 제거 
			// (리스트에 없는 경우 false반환)
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		}
		else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		// this.i : 카운팅 변수 들고오기 => item.length보다 효율적!
		//	===> break할 필요 없음!
//		for(int j=0; j<this.i; j++) { 
////			if(item[j] == null) break;
//			sum += item[i].price;
//			itemList += (item[j].toString() + " ");
//		}
		
		// ArrayList
		if(item.isEmpty()) { // Vector가 비어있는지 확인
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		for(int i=0; i<item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i == 0)? "" + p : ", " + p;
		}
		
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}
