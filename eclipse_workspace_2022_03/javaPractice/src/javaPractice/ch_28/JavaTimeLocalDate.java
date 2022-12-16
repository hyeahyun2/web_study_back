package javaPractice.ch_28;

import java.time.LocalDate;

/* Ŭ�������� ���� �� �����ϱ�
 * �� Ŭ�������� �ʵ� ������ Ư�� ������ ������ �� �ִ� �޼��尡 ����.
 * withYear(int) �� ����, withMonth(int) �� ����, 
 * withDayOfYear(int) ���� �� ����, withDayOfMonth(int) ���� �� ����
 * */
public class JavaTimeLocalDate {
	public static void main(String[] args) {
		// ��¥�� �����ϴ� �ڵ�
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate new_ld = ld.withYear(1999).withMonth(8).withDayOfYear(33);
		// ���� 1999��, ���� 8����, ���� ���� 33�Ϸ� ����.
		System.out.println(new_ld);
	}

}
