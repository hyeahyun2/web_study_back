package javaPractice.ch_08;

import java.util.Scanner;

public class Ex_02 {
	public static void putStars(int n, int m) {
		for(int i=0; i<n-m; i++) {
			System.out.print(" ");
		}
		for(int i=1; i<=m; i++) {
			System.out.print("*");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("좌하변이 직각인 직각삼각형을 표시합니다.");
		System.out.print("몇 단 : ");
		int n = stdIn.nextInt();
		
		for(int i=1; i<=n; i++) {
			putStars(n, i);
			System.out.println();
		}
	}

}
