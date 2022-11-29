package shoppingProcess;

// 쇼핑몰 상품 정의를 위한 추상클래스,
// 다양항 상품 종류를 지원하기 위해 기본 정보 설정 및 출력만 추상클래스에서 지정하고
// 추가 정보는 서브 클래스에서 구현하도록 유도함
public abstract class Product {
	String pname; // 상품명
	int price; // 가격
	int code; // 제품코드
	
	// 상품명과 가격을 출력하는 기본정보 출력 메서드
	// 상품의 기본 정보인 상품 이름과 가격을 출력
	// 상세 정보를 출력하려고 printExtra() 메서드를 호출
	public void printDetail() {
		System.out.print("상품명: " + pname + " , ");
		System.out.print("가격: " + price + " , ");
		System.out.print("제품코드: " + code + " , ");
		printExtra();
	}
	
	// 상품의 상세 정보 출력 메서드
	// 추상 메서드. 실제 구현은 서브 클래스에서 함.
	// printDetail()에서 자동으로 호출하므로, printDetail()에서 구현된 내용도 자동으로 함께 출력
	public abstract void printExtra();
}
