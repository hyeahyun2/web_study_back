package shoppingProcess;

// DTO 에 해당
public class User {
	/* 쇼핑몰 사용자의 기본적인 정보를 설정하고 제공하는 기능.
	 * 실제로 User 클래스는 다양한 회원 정보로 구성되어야 하지만,
	 * 여기서는 이름과 결제 정보만을 멤버로 가지도록 설정함 (샘플이니까~)
	 * */
	private String name;
	private PayType payType; // 결제 유형 - enum
	
	// 이름과 결재 정보를 파라미터로 가지는 생성자
	// 생성자로 이름과 결제 정보를 받아 실행
	public User(String name, PayType payType) {
		this.name = name;
		this.payType = payType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PayType getPayType() {
		return payType;
	}

	public void setPayType(PayType payType) {
		this.payType = payType;
	}
	
}
