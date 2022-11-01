package javaPractice.ch_02;

import java.util.Scanner;

public class InputMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x, y, sum;
		
		System.out.print("첫 번째 숫자를 입력하시오 : ");
		x = sc.nextInt();
		
		System.out.print("두 번째 숫자를 입력하시오 : ");
		y = sc.nextInt();
		
		sum = x + y;
		System.out.println(sum);
//		sc.close();
	}
}
