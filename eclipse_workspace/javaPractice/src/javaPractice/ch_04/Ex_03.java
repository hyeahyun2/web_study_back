package javaPractice.ch_04;

import java.util.Scanner;

public class Ex_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. while, break를 사용
		 * 2. 반복문으로 점수 계속 입력받기
		 * 3. 만약 음수 입력시 break에 의해 반복 루프 종료
		 * 4. 입력한 점수들의 평균 구하기
		 * */
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		while(true) {
			System.out.print("점수를 입력하세요(음수입력시 종료) : ");
			int score = scanner.nextInt();
			if(score < 0) {
				break;
			}
			sum += score;
			count++;
		}
		System.out.println("입력한 점수의 평균 : " + (double)sum/count);
		scanner.close();
	}
}
