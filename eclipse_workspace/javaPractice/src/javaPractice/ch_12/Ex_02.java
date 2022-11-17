package javaPractice.ch_12;
class Person {
	private String name;
	private String mobile;
	private String office;
	private String email;
	Person(String n, String m, String oi, String e){
		this.name = n;
		this.mobile = m;
		this.office = oi;
		this.email = e;
	}
	public String toString() {
		return "Person{name='" + name + "', mobile='" + mobile + "', office='" + office + "', email='"+ email + "'}";
	}
	void setEmail(String e) {
		this.email = e;
	}
	void setMobile(String m) {
		this.mobile = m;
	}
}
public class Ex_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Person 클래스 작성
		 * # 필드
		 * name : 이름 (private)
		 * mobile : 핸드폰 번호 (private)
		 * office : 직장 전화번호 (private)
		 * email : 이메일 주소 (private) 
		 * # 메서드
		 * Person(n, m, oi, e) : 생성자 메서드
		 * toString() : 삼각형의 정보를 문자열로 반환하는 메서드
		 * setName(), getName() ... : 각 속성에 대한 접근자와 설정자 메서드
		 * public String toString() : 해당 객체의 정보를 반환
		 * 호출 방법 : person
		 * */
		Person person = new Person("박승준", "010-1234-5678", "053-123-4567", "test@naver.com");
		System.out.println(person);
		person.setEmail("test@kakao.com");
		person.setMobile("010-5678-1234");
		System.out.println(person);
	}

}
