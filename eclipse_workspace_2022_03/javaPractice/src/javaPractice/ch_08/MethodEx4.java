package javaPractice.ch_08;

public class MethodEx4 {
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		int result = 0;
		
		MethodEx4 method = new MethodEx4();
		result = method.add(num1, num2);
		
		System.out.println("�� ���� ���� " + result);
		System.out.println("�� ���� ���� " + method.add(num1, num2));
	}

}
