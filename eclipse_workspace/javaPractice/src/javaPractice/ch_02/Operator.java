package javaPractice.ch_02;

public class Operator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 증감연산자
		int i = 5;
//		i++;
		System.out.println(i++);
		
		int j = 5;
//		++j;
		System.out.println(++j);
		
		System.out.println("i : " + i + ", j : " + j);
		
		int a = 5;
		int b = 0;
		b = a++;
		System.out.println("a의 값 : " + a + ", b의 값 : " + b); // a = 6, b = 5
		
		a = 5;
		b = 0;
		b = ++a;
		System.out.println("a의 값 : " + a + ", b의 값 : " + b); // a = 6, b = 6
	}

}
