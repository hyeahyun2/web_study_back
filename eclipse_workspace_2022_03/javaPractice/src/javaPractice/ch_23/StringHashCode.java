package javaPractice.ch_23;

public class StringHashCode {
	public static void main(String[] args) {
		/* �ٸ� ���α׷��� ���� ���ڿ��� ������ �� char[] �迭�� ���.
		 * �ڹٴ� String Ŭ������ ������ char[] �迭�� ���� �������� �ʾƵ� ���ڿ��� ����� �� ����.
		 * 
		 * String Ŭ������ ���� ������ ���� private final char value[]��� ����� char �迭�� ����.
		 * ���α׷����� String s = new String("abc")��� ���� 
		 * abc�� String Ŭ������ value ������ ������ ��.
		 * value ���� final�� ������ �Ǿ� �־ ���� ������ �� ����. �̸� �Һ� immutable �̶�� ��.
		 * 
		 * ���α׷����� �� ���� ���ڿ��� �����ϸ�,
		 * �� �� �ϳ��� ���ڿ��� ����Ǵ°� �ƴ϶� �� ���ڿ��� ����� ���ο� ���ڿ��� ����.
		 * */
		
		 String javaStr = new String("java");
		 String androidStr = new String("android");
		 System.out.println(javaStr);
		 System.out.println("ó�� ���ڿ� �ּ� ��: " + System.identityHashCode(javaStr));
//		 System.out.println("androidStr ���ڿ� �ּ� ��: " + System.identityHashCode(androidStr));
		 
		 javaStr = javaStr.concat(androidStr); // java�� android ���ڿ� ���� -> javaStr�� ����
		 
		 System.out.println(javaStr);
		 System.out.println("����� ���ڿ� �ּ� ��: " + System.identityHashCode(javaStr));
	}

}
