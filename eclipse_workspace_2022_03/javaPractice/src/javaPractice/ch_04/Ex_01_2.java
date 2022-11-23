package javaPractice.ch_04;

import java.util.Scanner;

public class Ex_01_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. do-while문 사용하여
		 * 2. 정수 입력받게
		 * 3. 입력받은 정수의 합계 구하기
		 * 4. 음수가 입력되면 while문 종료
		 * */
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int num;
		do {
			System.out.print("정수를 입력해주세요 >>> ");
			num = input.nextInt();
			if(num >= 0) {
				sum += num;
			}
		} while(num >= 0);
		
		System.out.println("입력된 정수의 합 : " + sum);
		input.close();
	}
}
