package javaPractice.ch_03;

import java.util.Scanner;

public class IfElseIfEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("나이를 입력하세요 >>>>");
		int age;
		// 방법1. 입력값 int형으로 바로 받기
		age = input.nextInt();
		// 방법2. 입력값 String형으로 받아 int로 형변환
//		String tmp;
//		tmp = input.nextLine();
//		age = Integer.parseInt(tmp);
		
		if (age < 9) { // 8 이하
			System.out.println("유아입니다.");
			System.out.println("유아요금이 적용됩니다.");
		}
		else if (age < 14) { // 9 ~ 13
			System.out.println("아동입니다.");
			System.out.println("아동요금이 적용됩니다.");
		}
		else if (age < 20) { // 14 ~ 19
			System.out.println("청소년입니다.");
			System.out.println("청소년요금이 적용됩니다.");
		}
		else { // 20 이상
			System.out.println("성인입니다.");
			System.out.println("성인요금이 적용됩니다.");
		}
		System.out.println("결제를 진행해주세요.");
		input.close();
	}
}
