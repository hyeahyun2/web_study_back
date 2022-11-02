package javaPractice.ch_03;

import java.util.Scanner;

public class IfExMaxNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = stdIn.nextInt();
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();
		System.out.print("정수 c : ");
		int c = stdIn.nextInt();
		
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		System.out.println("최대값은 " + max + "입니다.");
		
		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		System.out.println("최소값은 " +  min + "입니다.");
		
		if(max == min) {
			System.out.println("모든 수가 같아요");
		}
		stdIn.close();
	}
}
