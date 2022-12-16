package javaPractice.ch_28;

import java.util.Calendar;

public class CalendarSetTime {
	public static void main(String[] args) {
		/* set()���� ��¥ �����ϱ�
		 * set() �޼���� Calendar �ν��Ͻ��� ���� ������ �� ���
		 * �� ���� �Ķ���͸� �ʿ�� �ϸ� ù ��° �Ķ���ʹ� �ٲ�� �� �׸�,
		 * �ι�° �Ķ���ʹ� �ٲ� ���� ����.
		 * set(�ٲ�� �� �׸�, �ٲ� ��);
		 * set(��, ��, ��);
		 * */
		/* D-day�� ���ϴ� �ڵ� */
		Calendar today = Calendar.getInstance(); // ���� ��¥�� ��Ÿ���� �񱳷� �� �� ����� ��ü
		Calendar endOfYear = Calendar.getInstance(); // ���� ��¥�� ������ ��ü
		Calendar christmas = Calendar.getInstance(); // ũ�������� ��¥�� ������ ��ü
		
		endOfYear.set(Calendar.MONTH, 11); // endOfYear ��ü�� ���� 12���� ����
		endOfYear.set(Calendar.DATE, 31); // endOfYear ��ü�� ���� 31�Ϸ� ����
		// �������� ���� �� ���� ���� �ð� ��� (�ð� * �� * �� * 1000 ���� �����ֱ�)
		long diff = endOfYear.getTimeInMillis() - today.getTimeInMillis(); 
		System.out.println("�������� ���� �� : " + diff / (24 * 60 * 60 * 1000) + "��");
		
		christmas.set(2022, 11, 25); // 2022�� 12�� 25��
		diff = christmas.getTimeInMillis() - today.getTimeInMillis();
		System.out.println("ũ������������ ���� �� : " + diff / (24 * 60 * 60 * 1000) + "��");
	}

}
