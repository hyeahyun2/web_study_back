package javaPractice.ch_23;

public class StringConstruct {
	public static void main(String[] args) {
		/* String Ŭ����
		 * String�� �����ϴ� �� ���� ���
		 * 1. �������� �Ű������� ���ڿ� ����
		 * String str1 = new String("abc");
		 * new ���� ����ؼ� ��ü�� �����ϴ� ���� 
		 * "abc" ���ڿ��� ���� �޸𸮰� �Ҵ�ǰ� ���ο� ��ü�� ����
		 * 
		 * 2. ���ڿ� ����� ����Ű�� ���.
		 * String str2 = "abc";
		 * �����ڸ� �̿����� �ʰ� �ٷ� ���ڿ� ����� ����Ű�� ��쿡��
		 * ������ ������� �ִ� ���ڿ� ����� �޸� ���� ����Ű�� ��.
		 * ���α׷����� ���Ǵ� ��� ���� �����ϴ� ������ ��� Ǯ constant pool �̶�� ��.
		 * */
		
		String str1 = new String("abc"); // �������� �Ű������� ���ڿ� ����
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // false.
		System.out.println(str1.equals(str2)); // true
		
		String str3 = "abc";
		String str4 = "abc";

		// ���ڿ� abc�� ��� Ǯ�� ����Ǿ� �����Ƿ� str3�� str4�� ����Ű�� �ּ� ���� ����.
		System.out.println(str3 == str4); // true
		System.out.println(str3.equals(str4)); // true
	}
}
