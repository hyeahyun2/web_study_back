package javaPractice.ch_27;

class Company {
	// 1. 생성자를 private으로 구현하기.
	// 생성자의 접근제어자가 private이므로 외부 클래스에서 마음대로 Company 인스턴스를 생성할 수 없음.
	// 즉 Company 클래스 내부에서만 이 클래스의 생성을 제어할 수 있음.
	private Company() {}
	
	// 2. 클래스 내부에 static으로 유일한 인스턴스 생성하기
	// private으로 선언하여 외부에서 이 인스턴스로 접근하지 못하도록 제한해야 인스턴스 오류를 방지할 수 있음.
	private static Company instance = new Company();
	
	// 3. 외부에서 참조할 수 있는 public 메서드 만들기
	// 인스턴스를 반환하는 메서드는 반드시 static으로 선언해야 함.
	// getInstatnce() 메서드는 인스턴스 생성과 상관없이 호출할 수 있어야 하기 때문
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance; // 유일하게 생성한 인스턴스 반환
	}
}

public class singletonPattern {
	public static void main(String[] args) {
		// 4. 외부에서 사용하는 코드 만들기.
		// 외부 클래스에서 Company를 생성할 수 없으므로 static으로 제공되는 getInstance()메서드를 호출.
		// (클래스명으로 getInstatce() 호출하여 참조변수에 대입)
		 Company company1 = Company.getInstance(); 
		 Company company2 = Company.getInstance();
		 
		 System.out.println(company1 == company2); // 같은 주소인지 확인 = true
		 System.out.println(company1);
		 System.out.println(company2);
	}
	

}
