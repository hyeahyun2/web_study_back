package javaPractice.ch_28;

import java.time.LocalDate;

public class JavaTimeLocalDate2 {
	public static void main(String[] args) {
		// 1900년부터 2100년까지 윤년이 언제인지, 몇ㄴ년인지 알아보는 코드
		LocalDate localDate = LocalDate.now();
		LocalDate localDate2;
		int count = 0;
		
		for(int i = 1900; i<2100; i++) {
			localDate2 = localDate.withYear(i);
			if(localDate2.isLeapYear()) { // isLeapYear() : 윤년이면 true 반환
				System.out.println(localDate2.getYear() + "은 윤년입니다.");
				count++;
			}
		}
		System.out.println("1900년부터 2100년까지 윤년은 총 " + count + "번 있습니다.");
	}
}
