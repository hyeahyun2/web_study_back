package javaPractice.ch_21;

import java.util.Scanner;

public class ExceptionInputType {
	private static final Scanner in = new Scanner(System.in);
	public static void input() {
		int age = 0;
		try {
			System.out.print("나이 = ");
			age = Integer.parseInt(in.nextLine());
		} catch(NumberFormatException ex) {
			System.out.println("오류 발생 = " + ex.getMessage());
			return;
		} finally {
			System.out.println("나이 = " + age + "세");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method Start!!!");
		input();
		System.out.println("Main Method End!!!");
	}
}
