package javaPractice.ch_02;

public class ComparisonOperator2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 3.14;
		double b = 5.14;
		System.out.println(a == b);
		System.out.println(a != b);
		
		// ���ڿ��� ��� equals() �޼��带 �̿��ؼ� �� ��
		String c1 = "Hello JAVA!";
		System.out.println(c1.equals("Hello java!")); // false
		System.out.println(c1.equals("Hello JAVA!")); // true
		
		// == �� ��ü�� �ּҰ��� ��
		System.out.println(c1 == "Hello java!"); // false 
		System.out.println(c1 == "Hello JAVA!"); // true
		
		String str = "A";
		int num = 65;
		String num1 = String.valueOf((char)num);
//		System.out.println(num1);
		System.out.println(str == num1);
		System.out.println(str.equals(num1));
	}
}
