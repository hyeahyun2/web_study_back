package javaPractice.ch_02;

public class LogicalOperator2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println(5 < a && a < 15); // true && true -> true
		System.out.println((5 < a && a < 15) && a % 2 == 0); // (true) && true -> true
		
		a = 4;
		System.out.println((5 < a && a < 15) && a % 2 == 0); // false && true -> false
		System.out.println((5 < a && a < 15) || a % 2 == 0); // false || true -> true
	}
}
