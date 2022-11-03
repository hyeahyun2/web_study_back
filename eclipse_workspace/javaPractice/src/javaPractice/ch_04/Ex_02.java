package javaPractice.ch_04;

import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* do while문 사용하여 사용해서 월의 번호 입력받는 프로그램 작성
		 * 사용자가 올바른 월 번호를 입력할 때 까지 계속 반복
		 * 사용자가 올바른 월 번호를 입력해야만 다음 문장으로 넘어가기
		 * */
		Scanner scanner = new Scanner(System.in);
		int month;
		do {
			System.out.println("올바른 월을 입력하세요 [1~12]");
			month = scanner.nextInt();
		} while(month < 1 || month > 12);
		System.out.println("사용자가 입력한 월은 " + month + "입니다.");
		scanner.close();
	}
}
