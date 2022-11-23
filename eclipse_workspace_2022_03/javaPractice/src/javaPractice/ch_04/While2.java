package javaPractice.ch_04;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		String answer = "Y";
//		int count = 0;
//		
//		while(answer.equals("Y")) {
//			System.out.println("음악을 재생하시겠습니까?(Y)");
//			answer = scanner.nextLine();
//			
//			if(answer.equals("Y")) {
//				count++;
//				System.out.println("음악을 " + count + "번 재생했습니다.");
//			}
//		}
//		System.out.println("재생종료");
//		scanner.close();

		// for문으로 변경
		int count = 0;
		Scanner scanner2 = new Scanner(System.in);
		for(String answer = "Y"; answer.equals("Y") || answer.equals("y"); ) {
			System.out.println("음악을 재생하시겠습니까?(Y/y)");
			answer = scanner2.nextLine();
			if(answer.equals("Y") || answer.equals("y")) {
				count ++;
				System.out.println("음악을 " + count + "번 재생했습니다.");
			}
		}
		System.out.println("재생종료");
		scanner2.close();
	}
}
