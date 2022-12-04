package shopping2;

import java.util.ArrayList;
import java.util.Scanner;

// 장바구니에 상품을 저장하고 출력하는 기능
public class ShopCart extends ShopProduct {
	Scanner sc = new Scanner(System.in);
	ArrayList<Cart> mycart = new ArrayList<Cart>();
	
	// 상품 선택
	void selectProduct() {
		while(true) {
			System.out.print("구매할 상품의 번호를 입력해 주십시요.>> ");
			int proID = sc.nextInt();
			if(proID < 1 || proID > 3) {
				System.out.println("상품의 번호는 1부터 3까지 입력 가능합니다.");
				selectProduct();
				break;
			}
			System.out.print("상품의 구매 갯수를 입력해 주십시요.>> ");
			int proNum = sc.nextInt();
			if(proNum > 10) {
				System.out.println("장바구니에 저장 가능한 최대 개수는 10개입니다. ");
				continue;
			}
			Cart cart = new Cart(proID, proNum);
			
			boolean sameID = false; // 동일한 상품 번호 있는 경우 -> true
			for(Cart c : mycart) {
				if(proID == c.productID) {
					sameID = true;
					if((c.cnt + proNum) > 10) {
						System.out.println("장바구니에 저장 가능한 최대 개수는 10개입니다.");
						System.out.println("해당 물품의 개수가 10개를 초과했으므로 최대 갯수인 10개만 저장됩니다.");
						c.cnt = 10;
					}
					else {
						c.cnt += proNum; // 동일한 상품 번호 있으면 상품 갯수만 추가
					}
				}
			}
			if(!sameID) { // 동일한 상품 번호가 없으면 mycart 리스트에 새로 추가
				mycart.add(cart);
			}
			
			System.out.println("상점에서 상품을 더 구매 하시겠습니까?");
			System.out.print("더 구매를 원하시면 Y, 그만 쇼핑하실려면 N을 입력해 주십시요.>>> ");
			String state = sc.next();
			if(state.equals("N") || state.equals("n")) {
				break;
			}
			else if(state.equals("Y") || state.equals("y")) {
				continue;
			}
		}
	}
	// 장바구니에 담은 상품 출력
	void printCart() {
		int sumPrice = 0;
		for(Cart c : mycart) {
			for(Product p : product) { // in ShopProduct
				if(c.productID == p.getProductID()) { // productID 같은 상품
					int itemPrice = c.cnt * p.getPrice();
					System.out.println(c.toString() + 
							", 상품이름: " + p.getProductName() + 
							", 합계금액: " + itemPrice);
					sumPrice += itemPrice;
				}
			}
		}
		System.out.println("전체 결제 금액: " + sumPrice);
	}
}
