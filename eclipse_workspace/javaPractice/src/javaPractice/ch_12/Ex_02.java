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
		/* Person Ŭ���� �ۼ�
		 * # �ʵ�
		 * name : �̸� (private)
		 * mobile : �ڵ��� ��ȣ (private)
		 * office : ���� ��ȭ��ȣ (private)
		 * email : �̸��� �ּ� (private) 
		 * # �޼���
		 * Person(n, m, oi, e) : ������ �޼���
		 * toString() : �ﰢ���� ������ ���ڿ��� ��ȯ�ϴ� �޼���
		 * setName(), getName() ... : �� �Ӽ��� ���� �����ڿ� ������ �޼���
		 * public String toString() : �ش� ��ü�� ������ ��ȯ
		 * ȣ�� ��� : person
		 * */
		Person person = new Person("�ڽ���", "010-1234-5678", "053-123-4567", "test@naver.com");
		System.out.println(person);
		person.setEmail("test@kakao.com");
		person.setMobile("010-5678-1234");
		System.out.println(person);
	}

}
