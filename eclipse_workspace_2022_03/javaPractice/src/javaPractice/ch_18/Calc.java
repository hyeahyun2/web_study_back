package javaPractice.ch_18;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substact(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// 디폴트 메소드
	default void descroption() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	// 정적 메소드
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메서드 입니다.");
	}
	// private 메서드는 코드를 모두 구현해야 하므로 추상메서드에는 private 예약어를 사용할 수 없음
	// satatic 예약어는 함께 사용 가능
	private static void myStaticMethod() {
		System.out.println("private static 메서드입니다.");
	}
}

abstract class Calculator implements Calc {
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	@Override
	public int substact(int num1, int num2) {
		return num1 - num2;
	}
	
}
class CompleteCalc extends Calculator {
	
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}
	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1/num2;
		}
		else {
			return Calc.ERROR;
		}
	}
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
	
}