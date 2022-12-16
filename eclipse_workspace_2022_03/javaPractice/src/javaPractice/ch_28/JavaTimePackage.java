package javaPractice.ch_28;

import java.time.LocalDate;

/* java.time ��Ű��
 * ���߿� �߰��� ��Ű��. ������ Date�� Calendar�� ����
 * 
 * java.time : ��¥�� �ð��� ��Ÿ���� LocalDate, LocalTime ���� ������ ��Ű��
 * java.time.format : ��¥�� �ð��� �Ľ��ϰ� �������ϴ� API ����
 * java.time.chrono : �������� �޷� �ý����� ����� �� �ִ� API ����
 * java.time.temporal : ��¥�� �ð��� �����ϱ� ���� API ����
 * java.time.zone : Ÿ������ �����ϴ� API ����.
 * 
 * java.time ��Ű������ ��¥�� �ð��� ������ �� ����.
 * Ŭ�������� immutable (������) �Ӽ��� �ֱ� ������ ��¥�� �ð��� �����ϰ� �Ǹ�
 * �����δ� �����ϴ� ���� �ƴ϶� ���ο� ��ü�� ��ȯ
 * */
public class JavaTimePackage {
	public static void main(String[] args) {
		/* LocalDate Ŭ���� : ��¥ ������ ����. 
		 * ��¥ ������ �����ϴ� ����� ���� v
		 * 1) ���� ��¥�� �����ϴ� now() �޼��带 ���� ���
		 * 2) Ư�� ��¥�� �����ϴ� of() �޼��鸦 ����ϴ� ���
		 * */
		
		// ��¥�� ���ϰ� ���� �޼��带 Ȯ���ϴ� �ڵ�
		// minusYears(long) �⵵ ����, minusMonths(long) �� ����, 
		//		minusDays(long) �� ����, minusWeeks(long) �� ����
		// plusYears(long) �⵵ ���ϱ�, plusMonths(long) �� ���ϱ�, 
		//		plusDays(long) �� ���ϱ�, plusWeeks(long) �� ���ϱ�
		
		LocalDate ld = LocalDate.now(); // ���� ��¥�� ����
		System.out.println(ld); // 2022-12-16
		
		// 2���� ����, 3���� ���ϰ�, 4���� ����
		LocalDate ld2 = ld.minusYears(2).plusMonths(3).minusDays(4);
		System.out.println(ld2); // 2021-03-12
		
		// �ڵ���ȯ
		LocalDate ld3 = ld2.minusDays(3); // ld2���� 3���� ��
		System.out.println(ld3); // 2021-03-09
		
		// �� ���ϱ�
		LocalDate ld4 = ld3.plusWeeks(3); // ld3���� 3�ָ� ����
		System.out.println(ld4); // 2022-03-30
	}

}
