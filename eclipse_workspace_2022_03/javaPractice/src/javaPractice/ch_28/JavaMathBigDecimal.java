package javaPractice.ch_28;

import java.math.BigDecimal;

public class JavaMathBigDecimal {
	public static void main(String[] args) {
		/* BigDecimal : ��Ȯ�� �Ҽ��� ������ �ؾ� �� �� BigDecimal Ŭ������ ���.
		 * double, long���� �Ҽ��� ������ �� �� ������ ���� �κ��� ����
		 * */
		double a = 24.3953;
		double b = 50.343998;
		System.out.println(a + b); // 74.73929799999999
		
		// double�� �ڷḦ ���ڿ��� ��ȯ �� BigDecimal�� ��ü ����.
		BigDecimal num = new BigDecimal(String.valueOf(a));
		BigDecimal num2 = new BigDecimal(String.valueOf(b));
		// add() �޼ҵ带 Ȱ���Ͽ� ��Ȯ�� ��� ���� ��ȯ
		System.out.println(num.add(num2)); // 74.739298
	}
}
