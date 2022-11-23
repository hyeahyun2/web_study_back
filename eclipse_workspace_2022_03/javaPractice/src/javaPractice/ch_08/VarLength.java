package javaPractice.ch_08;

public class VarLength {
	static void test(int... v) {
		System.out.print(v.length + " : ");
		for(int x : v) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(1);
		test(1, 2);
		test(1, 2, 3);
	}
}
