package shopping2;

public class Cart {
	int productID, cnt;

	public Cart(int productID, int cnt) {
		this.productID = productID; // 상품 코드
		this.cnt = cnt; // 구매 개수
	}

	@Override
	public String toString() {
		return "상품번호: " + productID + ", 갯수: " + cnt;
	}
	
}
