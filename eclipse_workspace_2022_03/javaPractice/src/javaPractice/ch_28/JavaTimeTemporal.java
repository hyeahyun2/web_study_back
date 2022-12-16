package javaPractice.ch_28;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

/* with()메서드는 TemporalAdjusters 타입을 인자로 받으면 특정 날짜를 리턴
 * firstDayOfYear() : 년도의 첫 번째 일
 * lastDayOfYear() : 년도의 마지막 일
 * firstDayOfMonth() : 달의 첫 번째 일
 * lastDayOfMonth() : 달의 마지막 일
 * firstInMonth(DayofWeek dayOfWeek) : 달의 첫 번째 요일
 * lastInMonth(DayofWeek dayOfWeek) : 달의 마지막 요일
 * next(DayOfWeek dayOfWeek) : 돌아오는 요일
 * nextOrSame(DayOfWeek dayOfWeek) : 오늘을 포함한 돌아오는 요일
 * previous(DayOfWeek dayOfWeek) : 지난 요일
 * priviousOrSame(DayOfWeek dayOfWeek) : 오늘을 포함한 지난 요일
 * */
public class JavaTimeTemporal {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		LocalDateTime new_ldt;
		
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfYear()); // 년도의 첫 번째 일
		System.out.println("올해의 첫 번째 날 : " + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfYear()); // 년도의 마지막 일
		System.out.println("올해의 첫 번째 날 : " + new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfMonth()); // 달의 첫 번째 일
		System.out.println("이번 달의 첫번째 날 : " + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfMonth()); // 달의 마지막 일
		System.out.println("이번 달의 마지막 날 : " + new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); // 달의 첫 번째 월요일
		System.out.println("이번 달의 첫번째 월요일 : " + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)); // 달의 마지막 일요일
		System.out.println("이번 달의 마지막 일요일 : " + new_ldt);

		new_ldt = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)); // 돌아오는 요일
		System.out.println("돌아오는 금요일 : " + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)); // 오늘 포함 돌아오는 요일
		System.out.println("오늘을 포함한 돌아오는 금요일 : " + new_ldt);

		new_ldt = ldt.with(TemporalAdjusters.previous(DayOfWeek.MONDAY)); // 지난 요일
		System.out.println("지난 월요일 : " + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)); // 오늘 포함 지난 요일
		System.out.println("오늘을 포함한 지난 월요일 : " + new_ldt);
		
		
	}
}
