package javaPractice.ch_02;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. 변수 4개 모두 사용
		 * 2. 사칙연산중 + 연산만 사용
		 * 3. result = 9 가 나오도록
		 * */
		long var1 = 2L;
 		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		// 풀이
//		double sum = var1 + (int)var2 + var3 + Double.parseDouble(var4);
		
		int result = (int)(var1 + (int)var2 + var3 + Double.parseDouble(var4));
		System.out.println(result);

	}

}
