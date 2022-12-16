package javaPractice.ch_28;

import java.time.LocalDateTime;

/* LocalDateTime
 * �ð��� ���ϰ� ���� �޼��带 Ȯ���ϴ� �ڵ�
 * minusHours(long) �ð� ����, minusMinutes(long) �� ����,
 * minusSeconds(long) �� ����, minusNanos(long) ������ ����
 * plusHours(long) �ð� ���ϱ�, plusMinutes(long) �� ���ϱ�,
 * plusSeconds(long) �� ���ϱ�, plusNanos(long) ������ ���ϱ�
 * */
public class JavaTimeLocalDateTime {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("���� �ð� : " + ldt);
		LocalDateTime ldt1 = ldt.minusHours(5).plusMinutes(30).minusSeconds(4);
		System.out.println("���� �ð� : " + ldt1);
		
		LocalDateTime ldt2 = ldt1.minusHours(24);
		System.out.println("�ڵ� ���� �ð� : " + ldt2);
	}
}
