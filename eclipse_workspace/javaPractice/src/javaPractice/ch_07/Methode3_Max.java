package javaPractice.ch_07;

import java.util.Scanner;

public class Methode3_Max {
	static int max(int a, int b, int c) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� a : ");
		int a = stdIn.nextInt();
		System.out.print("���� b : ");
		int b = stdIn.nextInt();
		System.out.print("���� c : ");
		int c = stdIn.nextInt();
		
		System.out.println("�ִ밪 : " + max(a,b,c));
	}

}
