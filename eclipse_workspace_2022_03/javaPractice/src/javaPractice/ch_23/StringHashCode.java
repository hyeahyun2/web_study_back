package javaPractice.ch_23;

public class StringHashCode {
	public static void main(String[] args) {
		/* 다른 프로그래밍 언어는 문자열을 구현할 때 char[] 배열을 사용.
		 * 자바는 String 클래스를 제공해 char[] 배열을 직접 구현하지 않아도 문자열을 사용할 수 있음.
		 * 
		 * String 클래스의 구현 내용을 보면 private final char value[]라고 선언된 char 배열이 있음.
		 * 프로그램에서 String s = new String("abc")라고 쓰면 
		 * abc는 String 클래스의 value 변수에 저장이 됨.
		 * value 변수 final로 선언이 되어 있어서 값을 변경할 수 없음. 이를 불변 immutable 이라고 함.
		 * 
		 * 프로그램에서 두 개의 문자열을 연결하면,
		 * 둘 중 하나의 문자열이 변경되는게 아니라 두 문자열이 연결된 새로운 문자열이 생성.
		 * */
		
		 String javaStr = new String("java");
		 String androidStr = new String("android");
		 System.out.println(javaStr);
		 System.out.println("처음 문자열 주소 값: " + System.identityHashCode(javaStr));
//		 System.out.println("androidStr 문자열 주소 값: " + System.identityHashCode(androidStr));
		 
		 javaStr = javaStr.concat(androidStr); // java와 android 문자열 연결 -> javaStr에 저장
		 
		 System.out.println(javaStr);
		 System.out.println("연결된 문자열 주소 값: " + System.identityHashCode(javaStr));
	}

}
