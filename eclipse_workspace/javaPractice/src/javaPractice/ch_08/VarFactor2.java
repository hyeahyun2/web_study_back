package javaPractice.ch_08;

public class VarFactor2 {
	static void test(String name, int... v) {
		System.out.print(name + " : ");
		for(int x : v) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test("김성호", 98, 85, 88);
		test("이준호", 90, 95, 92);
		test("박태석", 80, 98, 95);
	}

}
