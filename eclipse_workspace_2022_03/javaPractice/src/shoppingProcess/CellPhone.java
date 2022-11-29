package shoppingProcess;

// product : 추상클래스
public class CellPhone extends Product {
	String carrier; // 통신사
	String company; // 제조사
	
	public CellPhone(String pname, int price, int code, String carrier, String company) {
		this.pname = pname;
		this.price = price;
		this.code = code;
		this.carrier = carrier;
		this.company = company;
	}

	@Override
	public void printExtra() {
		System.out.print("통신사: " + carrier + " , ");
		System.out.println("제조사: " + company);
	}
}
