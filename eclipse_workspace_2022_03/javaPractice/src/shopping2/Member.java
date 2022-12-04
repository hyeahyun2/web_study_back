package shopping2;

public class Member {
	private final String memberID; // 아이디
	private String password; // 비밀번호
	private String name; // 이름
	private String address; // 주소
	private String email; // 이메일
	
	public Member(String memberID, String password, String name) {
		this.memberID = memberID;
		this.password = password;
		this.name = name;
	}
	
	public String getMemberID() {
		return memberID;
	}
	
	public String getPassword() {
		return password;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		System.out.println("회원가입정보는 아래와 같습니다.");
		return "아이디: " + memberID + ", 이름: " + name + 
				", 주소: " + address + ", 이메일: " + email;
	}
	
}
