package javaPractice.ch_08;

public class MethodEx3 {
	public void print(int a, int b) {
		int c = a + b;
		System.out.println("결과값 : " + c);
	}
	public void print1(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 11;
		int num2 = 22;
		int result = 0;
		
		MethodEx3 method = new MethodEx3();
		
		method.print(10, 20);
		method.print(num1, num2);
		
		method.print1("안녕하세요.");
	}
}
