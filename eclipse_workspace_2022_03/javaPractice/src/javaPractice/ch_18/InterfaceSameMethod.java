package javaPractice.ch_18;
interface Buy {
	void buy();
	void info();
	default void order() {
		System.out.println("���� �ֹ�");
	}
}
interface Sell {
	void sell();
	void info();
	default void order() {
		System.out.println("�Ǹ� �ֹ�");
	}
}
class Customer implements Buy, Sell {
	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
	}
	@Override
	public void buy() {
		System.out.println("�����ϱ�");
	}
	@Override 
	public void info() {}
	
	// �ߺ��� �޼��� �������̵� �ϱ�
	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("�� �Ǹ� �ֹ�");
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
