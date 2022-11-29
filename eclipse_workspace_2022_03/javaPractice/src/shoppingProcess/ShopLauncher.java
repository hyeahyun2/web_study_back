package shoppingProcess;

// 쇼핑몰을 실행하기 위한 런처 프로그램
public class ShopLauncher {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IShop shop = new MyShop();
		shop.setTitle("MyShop");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}
}
