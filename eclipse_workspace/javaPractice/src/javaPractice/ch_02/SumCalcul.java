package javaPractice.ch_02;

public class SumCalcul {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 연산에서의 문자열 자동 변환
		 * 1) 피연산자가 숫자일 경우 -> 덧셈 연산
		 * 2) 피연산자 중 하나라도 문자열일 경우 
		 * 		-> 문자열로 자동 변환 후 문자열 결합 연산
		 * */
		// 숫자의 결합 연산 -> 변수의 타입 : int
		int value = 10 + 2 + 8;
		System.out.println("value : " + value); // 20
		
		// 문자열 하나라도 있는 경우 변수의 타입 -> String
		String str1 = 10 + 2 + "8";
		System.out.println("str1 : " + str1); // 128
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2 : " + str2); // 1028
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3 : " + str3); // 1028
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4 : " + str4); // 1010
	}
}
