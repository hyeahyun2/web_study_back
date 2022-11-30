package javaPractice.ch_20;
/* static ���� Ŭ������ ����
 * ���� Ŭ������ static���� ġ���� Ŭ����
 * ���� Ŭ������ ����� static���� �����Ǿ����� ���� Ŭ������ �ݵ�� static���� �����ؾ� ��.
 * */
/* MyOuter3.Inner.getUserInfo()�� ȣ���ؼ� �Ʒ� ������ ��µǵ��� main() �޼��� �ۼ�
 * ������ >> �ּ�: ������ ������, ��ȭ��ȣ: 010-1111-2222
 * */
class MyOuter3 {
	private String name;
	private int age;
	
	public MyOuter3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	static class Inner {
		private String address;
		static String tel = "010-1111-2222";
		
		public Inner(String address) {
			this.address = address;
		}
		public String getUserInfo() {
			//static ���� Ŭ�������� �ܺ� Ŭ������ ��� ������ ������ �Ұ���
			// return name + " " + age;
			return "�ּ�: " + address + ", ��ȭ��ȣ: " + tel;
		}
	} // end Inner Class
} // end Outer Class

public class Ex_Static {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOuter3.Inner staticInner = new MyOuter3.Inner("������ ������");
		System.out.println("������ >> " + staticInner.getUserInfo());
	}
}
