package javaPractice.ch_08;

public class MethodDouble {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main 시작!");
		firstMethod();
		System.out.println("main 종료!");
		
	}
	static void firstMethod() {
		System.out.println("firstMethod 시작!");
		secondMethod();
		System.out.println("firstMethod 종료!");
	}
	static void secondMethod() {
		System.out.println("secondMethod 시작!");
		System.out.println("secondMethod 종료!");
	}

}
