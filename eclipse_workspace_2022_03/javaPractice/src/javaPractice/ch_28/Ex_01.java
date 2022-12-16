package javaPractice.ch_28;

import java.util.Calendar;

/* ���� ��� : 
 * 2022�� 8�� 22��
 * ������ ����
 * 5�� 54�� 38��
 * */
public class Ex_01 {
	public static String getWeekStr(int date) {
		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};
		return week[date - 1];
	}
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		now.set(2022, 7, 22);
		now.set(Calendar.HOUR, 17);
		now.set(Calendar.MINUTE, 54);
		now.set(Calendar.SECOND, 38);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DATE);
		String strWeek = getWeekStr(now.get(Calendar.DAY_OF_WEEK));
		String strAmPm = null;
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		int amPm = now.get(Calendar.AM_PM);
		if(amPm == Calendar.AM) {
			strAmPm = "����";
		}
		else {
			strAmPm = "����";
		}
		
		System.out.print(year + "�� ");
		System.out.print(month + "�� ");
		System.out.println(day + "�� ");
		System.out.print(strWeek + "���� ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "�� ");
		System.out.print(minute + "�� ");
		System.out.println(second + "�� ");
	}
}
