package shopping2;
 
// 생성자로 상품을 저장하고 전시하는 기능
public class ShopProduct {
	Product[] product = new Product[3];
	
	public ShopProduct() {
		product[0] = new Product(1, "블랜딩 커피", 5000);
		product[1] = new Product(2, "파나마 게이샤", 15000);
		product[2] = new Product(3, "이디오피카 커피", 10000);
	}

	// 상품 진열
	void printProduct() {
		for(Product p : product) {
			System.out.println("상품코드: " + p.getProductID() + 
					", 상품이름: " + p.getProductName() + 
					", 가격: " + p.getPrice());
		}
	}
	
}
