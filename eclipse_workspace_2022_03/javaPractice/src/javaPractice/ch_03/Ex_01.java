package javaPractice.ch_03;

import java.util.Scanner;

public class Ex_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. 사용자에게 정수 입력받아서
		 * 2. 양수 / 0 / 음수 판별해서 
		 * 3. 알려주기
		 * */
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = input.nextInt();
		
		if (num > 0) {
			System.out.println("입력하신 " + num + "은 양수입니다");
		}
		else if (num < 0) {
			System.out.println("입력하신 " + num + "은 음수입니다");
		}
		else {
			System.out.println("입력하신 숫자는" + num + "입니다");
		}
		input.close();
	}
}
