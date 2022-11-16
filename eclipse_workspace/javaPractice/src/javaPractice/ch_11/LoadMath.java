package javaPractice.ch_11;
class MyMath {
	int add(int a, int b) {
		return a + b;
	}
	int subtract(int a, int b) {
		return a - b;
	}
	int multiply(int a, int b) {
		return a * b;
	}
	double divide(int a, int b) {
		return (double)a / b;
	}
}

public class LoadMath {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath nm = new MyMath();
		int result1 = nm.add(5, 3);
		int result2 = nm.subtract(5, 3);
		int result3 = nm.multiply(5, 3);
		double result4 = nm.divide(5, 3);
		
		System.out.println("add(5, 3) = " + result1);
		System.out.println("subtract(5, 3) = " + result2);
		System.out.println("multiply(5, 3) = " + result3);
		System.out.println("divide(5, 3) = " + result4);
	}
}
