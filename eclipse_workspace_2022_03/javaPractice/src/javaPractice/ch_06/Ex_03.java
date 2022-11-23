package javaPractice.ch_06;

import java.util.Scanner;

public class Ex_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	음수가 입력될 때까지,
		 *  사용자가 입력한 정수의 합계를 계산하여 출력하는 프로그램
		 *  while문을 사용, break는 사용하지 말 것
		 * */
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		while(num >= 0) {
			sum += num;
			System.out.print("합할 정수를 입력하세요 : ");
			num = scanner.nextInt();
		}
		System.out.println("총 입력받은 수의 합계 : " + sum);
	}
}
