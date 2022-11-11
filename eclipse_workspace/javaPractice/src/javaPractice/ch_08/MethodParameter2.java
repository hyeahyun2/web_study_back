package javaPractice.ch_08;

public class MethodParameter2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a + ", " + b + ", " + c + " 중에 제일 큰 수 : " + max(a,b,c));
		System.out.println(a + ", " + b + " 중에 제일 큰 수 : " + max(a,b));
	}
	static int max(int a, int b, int c) {
		if(a > b && a > c) return a;
		else if(b > c) return b;
		else return c;
	}
	static int max(int a, int b) {
		if(a > b) return a;
		else return b;
	}
}
