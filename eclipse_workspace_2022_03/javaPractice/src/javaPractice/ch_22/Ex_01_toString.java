package javaPractice.ch_22;
/* Member Ŭ�������� id�� �̸�, ����ó�� �����ϴ� �ʵ尡 �ִ�.
 * Member Ŭ������ �ۼ��ϵ�, Object�� toString() �޼��带 �������ؼ� �Ʒ��� ���� �������� �ۼ�
 * ���� ��� : 
 * blue: ���Ķ�
 * */
class Member {
	String id;
	String name;
	String tell;
	
	public Member(String id, String name, String tell) {
		this.id = id;
		this.name = name;
		this.tell = tell;
	}
	
	@Override
	public String toString() {
		return id + ": " + name;
	}
}

public class Ex_01_toString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member("blue", "���Ķ�", "010-1234-5678");
		System.out.println(member);
	}
}
