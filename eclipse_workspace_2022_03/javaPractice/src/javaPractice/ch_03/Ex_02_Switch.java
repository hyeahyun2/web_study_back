package javaPractice.ch_03;

import java.util.Scanner;

public class Ex_02_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. 사용자에게 성적 입력받기
		 * 		입력은 0 ~ 100까지 입력이 됩니다
		 * 2. if문 사용해서 학점을 출력하는 코드
		 * A : 90 ~ 100
		 * B : 80 ~ 89
		 * C : 70 ~ 79
		 * D : 60 ~ 69 
		 * F : 0 ~ 59
		 * */
		
		Scanner input = new Scanner(System.in);
		System.out.print("성적을 입력하세요 : ");
		int num = input.nextInt();
		int score = (num / 10) * 10;
		
		switch(score) {
		case 100: case 90:
			System.out.println("A학점 입니다.");
			break;
		case 80:
			System.out.println("B학점 입니다.");
			break;
		case 70:
			System.out.println("C학점 입니다.");
			break;
		case 60:
			System.out.println("D학점 입니다.");
			break;
		default:
			System.out.println("F학점 입니다.");
		}
		input.close();
	}

}
