package javaPractice.ch_23;

public class StringConstruct {
	public static void main(String[] args) {
		/* String 클래스
		 * String을 선언하는 두 가지 방법
		 * 1. 생성자의 매개변수로 문자열 생성
		 * String str1 = new String("abc");
		 * new 예약어를 사용해서 객체를 생성하는 경우는 
		 * "abc" 문자열을 위한 메모리가 할당되고 새로운 객체가 생성
		 * 
		 * 2. 문자열 상수를 가르키는 방식.
		 * String str2 = "abc";
		 * 생성자를 이용하지 않고 바로 문자열 상수를 가리키는 경우에는
		 * 기존에 만들어져 있던 문자열 상수의 메모리 값을 가르키게 됨.
		 * 프로그램에서 사용되는 상수 값을 저장하는 공간을 상수 풀 constant pool 이라고 함.
		 * */
		
		String str1 = new String("abc"); // 생성자의 매개변수로 문자열 생성
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // false.
		System.out.println(str1.equals(str2)); // true
		
		String str3 = "abc";
		String str4 = "abc";

		// 문자열 abc는 상수 풀에 저장되어 있으므로 str3과 str4가 가르키는 주소 값이 같음.
		System.out.println(str3 == str4); // true
		System.out.println(str3.equals(str4)); // true
	}
}
