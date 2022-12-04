package shopping2;

public class Product { // 상품 관련 클래스. 장바구니 사용전에 상품을 보여줌
	private final int productID; // 상품 코드
	private final String productName; // 상품 이름
	private final int price; // 가격
	
	public Product(int productID, String productName, int price) {
		this.productID = productID;
		this.productName = productName;
		this.price = price;
	}

	public int getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}
	
	
}
