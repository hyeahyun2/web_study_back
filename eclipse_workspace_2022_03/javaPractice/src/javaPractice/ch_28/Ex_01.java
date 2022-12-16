package javaPractice.ch_28;

import java.util.Calendar;

/* 실행 결과 : 
 * 2022년 8월 22일
 * 월요일 오후
 * 5시 54분 38초
 * */
public class Ex_01 {
	public static String getWeekStr(int date) {
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
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
			strAmPm = "오전";
		}
		else {
			strAmPm = "오후";
		}
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
	}
}
