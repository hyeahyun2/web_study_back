package javaPractice.ch_07;

import java.util.Scanner;

public class Methode4_MaxNum {
	static int max(int a, int b) {
		System.out.println("함수 시작");
		if(a>b) return a;
		else return b;
//		System.out.println("함수 끝");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = stdIn.nextInt();
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();
		
		System.out.println("최대값 : " + max(a, b));
	}
}
