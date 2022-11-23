package javaPractice.ch_08;

public class MethodParameter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printGreet(); // [1번] 실행
		printGreet("안녕~!"); // [2번] 실행
		printGreet("한수", "잘 지내셨나요?"); // [3번] 실행
		printGreet(3); // [4번] 실행
	}
	public static void printGreet() { // [1번]
		System.out.println("printGreet() 메서드가 실행됩니다.");
		System.out.println("안녕하세요");
	}
	public static void printGreet(String greeting) { // [2번]
		System.out.println("printGreet(String greeting) 메서드가 실행됩니다.");
		System.out.println(greeting);
	}
	public static void printGreet(String name, String greeting) { // [3번]
		System.out.println("printGreet(String name, String greeting) 메서드가 실행됩니다.");
		System.out.println(name + "님! " + greeting);
	}
	public static void printGreet(int cnt) { // [4번]
		System.out.println("printGreet(int cnt) 메서드가 실행됩니다.");
		System.out.println("안녕하세요. " + cnt + "번째 보는거네요.");
	}
}
