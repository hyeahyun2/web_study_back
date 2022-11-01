package javaPractice.ch_02;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. 두 개의 정수 입력받기
		 * 2. 정수의 합, 차, 곱, 평균 구하기
		 * 3. 두 수를 비교하여 더 큰 수/작은 수 계산해 화면에 출력하기
		 * 		(큰 수와 작은 수를 구할 때는 조건연산자(삼항연산자) 사용하기)
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		System.out.println("두 수의 합 : " + sum);
		System.out.println("두 수의 차 : " + (num1 - num2));
		System.out.println("두 수의 곱 : " + (num1 * num2));
		System.out.println("두 수의 평균 : " + ((double)sum / 2));
		
//		int big = num1 < num2 ? num2 : num1;
//		int small = num1 < num2 ? num1 : num2;
//		System.out.println("큰 수 :" + big);
//		System.out.println("작은 수 :" + small);
		System.out.println(num1 < num2 ? "큰 수 : " + num2 + "\n작은 수 : " + num1 :  "큰 수 : " + num1 + "\n작은 수 : " + num2);
	}
}
