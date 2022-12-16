package javaPractice.ch_28;

import java.text.SimpleDateFormat;
import java.util.Date;

/* Date와 SimpleDateFormat 클래스를 이용해서
 * 오늘 날짜를 출력하는 프로그램 작성
 * 
 * 실행 결과 :
 * 0000년 00월 00일 0요일 00시 00분
 * */
public class Ex_02 {
	public static void main(String[] args) {
		Date day = new Date();
		
		String formatType = "yyyy년 MM월 dd일 E요일 HH시 mm분";
		
		SimpleDateFormat sdf = new SimpleDateFormat(formatType);
		System.out.println(sdf.format(day));
	}
}
