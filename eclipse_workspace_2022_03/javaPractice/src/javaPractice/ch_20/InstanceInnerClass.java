package javaPractice.ch_20;
/* �ν��Ͻ� ���� Ŭ������ ���ǿ� ����
 * �ܺ� Ŭ������ ���ó�� ���ǵ� Ŭ����
 * ���� Ŭ������ ����Ϸ��� ���� �ܺ� Ŭ������ �ν��Ͻ��� ������ �Ŀ� �����ؾ� ��
 * */
/* Inner.getCustomerInfo()�� ȣ���ؼ� �Ʒ� ������ �������� main() �޼��� �ۼ�.
 * '������ >> �̸� : ȫ�浿, ����: 20, �ּ�: ������ ������'
 * */
class MyOuter1 {
	private String name;
	private int age;
	
	public MyOuter1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	// ���� Ŭ������ �����Ѵ�.
	public class Inner{
		private String address;
		public Inner(String address) {
			this.address = address;
		}
		public String getCustomerInfo() {
			return "�̸�: " + name + ", ����: " + age + ", �ּ�: " + address;
		}
	}
}
public class InstanceInnerClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOuter1 oc = new MyOuter1("ȫ�浿", 20);
		MyOuter1.Inner ic = oc.new Inner("������ ������");
		System.out.println("������ >> " + ic.getCustomerInfo());
	}

}
