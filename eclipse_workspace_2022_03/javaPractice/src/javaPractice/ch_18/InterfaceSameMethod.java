package javaPractice.ch_18;
interface Buy {
	void buy();
	void info();
	default void order() {
		System.out.println("구매 주문");
	}
}
interface Sell {
	void sell();
	void info();
	default void order() {
		System.out.println("판매 주문");
	}
}
class Customer implements Buy, Sell {
	@Override
	public void sell() {
		System.out.println("판매하기");
	}
	@Override
	public void buy() {
		System.out.println("구매하기");
	}
	@Override 
	public void info() {}
	
	// 중복된 메서드 오버라이딩 하기
	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("고객 판매 주문");
	}
	
}

public class InterfaceSameMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = (Sell)customer;
		seller.sell();
		
		if(seller instanceof Customer) {
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
		}
		customer.order();
	}

}
