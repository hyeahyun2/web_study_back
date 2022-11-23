package javaPractice.ch_04;

import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문 while문을 빠져나오도록
		// break 사용해서
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num;
		
		while(true) {
			System.out.print("더할 숫자를 입력하세요(종료하려면 0 입력) : ");
			num = scanner.nextInt();
			if(num == 0) {
				break;
			}
			sum += num;
		}
		System.out.println("입력하신 숫자의 총 합 : " + sum);
		scanner.close();
	}
}
