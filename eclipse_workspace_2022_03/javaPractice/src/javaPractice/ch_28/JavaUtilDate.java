package javaPractice.ch_28;

import java.util.Date;

public class JavaUtilDate {
	/* java.util.Date */
	public static void main(String[] args) {
		Date today = new Date(); // 기본 생성자로 Date 인스턴스를 만들고 출력
		System.out.println(today);
		
		long a = System.currentTimeMillis();
		Date today2 = new Date(a); // long 타입을 파라미터로 받아서 인스턴스 생성 후 출력
		System.out.println(today2);
	}
}
