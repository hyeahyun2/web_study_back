package javaPractice.ch_28;

import java.time.LocalDateTime;

/* LocalDateTime
 * 시간을 더하고 빼는 메서드를 확인하는 코드
 * minusHours(long) 시간 빼기, minusMinutes(long) 분 빼기,
 * minusSeconds(long) 초 빼기, minusNanos(long) 나노초 빼기
 * plusHours(long) 시간 더하기, plusMinutes(long) 분 더하기,
 * plusSeconds(long) 초 더하기, plusNanos(long) 나노초 더하기
 * */
public class JavaTimeLocalDateTime {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("현재 시간 : " + ldt);
		LocalDateTime ldt1 = ldt.minusHours(5).plusMinutes(30).minusSeconds(4);
		System.out.println("변경 시간 : " + ldt1);
		
		LocalDateTime ldt2 = ldt1.minusHours(24);
		System.out.println("자동 변경 시간 : " + ldt2);
	}
}
