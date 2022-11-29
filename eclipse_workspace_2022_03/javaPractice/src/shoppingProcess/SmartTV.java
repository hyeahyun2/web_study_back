package shoppingProcess;

// Product : 추상클래스
public class SmartTV extends Product {
	String resolution; // 해상도
	String inches; // 인치수
	
	public SmartTV(String pname, int price, int code, String resolution, String inches) {
		this.pname = pname;
		this.price = price;
		this.code = code;
		this.resolution = resolution;
		this.inches = inches;
	}

	@Override
	public void printExtra() {
		// 추상클래스에 정의된 추상 메서드를 오버라이딩
		// 추가 정보인 해상도 출력
		System.out.print("해상도: " + resolution + " , ");
		System.out.println("인치수: " + inches);
	}
}
