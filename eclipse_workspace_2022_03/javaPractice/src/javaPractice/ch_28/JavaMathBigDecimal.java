package javaPractice.ch_28;

import java.math.BigDecimal;

public class JavaMathBigDecimal {
	public static void main(String[] args) {
		/* BigDecimal : 정확한 소수점 연산을 해야 할 때 BigDecimal 클래스를 사용.
		 * double, long으로 소수점 연산을 할 때 오차가 나는 부분을 보완
		 * */
		double a = 24.3953;
		double b = 50.343998;
		System.out.println(a + b); // 74.73929799999999
		
		// double형 자료를 문자열로 변환 후 BigDecimal의 객체 생성.
		BigDecimal num = new BigDecimal(String.valueOf(a));
		BigDecimal num2 = new BigDecimal(String.valueOf(b));
		// add() 메소드를 활용하여 정확한 결과 값을 반환
		System.out.println(num.add(num2)); // 74.739298
	}
}
