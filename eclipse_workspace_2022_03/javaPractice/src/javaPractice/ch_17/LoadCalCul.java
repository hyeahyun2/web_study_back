package javaPractice.ch_17;
abstract class Calculator {
	public int num1;
	public int num2;
	abstract int calc();
	void printResult() {
		System.out.println("calc() 연산의 결과는 " + calc() + "입니다.");
	}
}
class MyCalculator extends Calculator {
	int calc() {
		return num1 + num2;
	}
}

public class LoadCalCul {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator myCalcul = new MyCalculator();
		myCalcul.num1 = 10;
		myCalcul.num2 = 20;
		myCalcul.printResult();
	}
}
