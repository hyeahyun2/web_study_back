package javaPractice.ch_05;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 적절한 변수명 / 자료형 사용하기
		
		Scanner scanner = new Scanner(System.in);
		// 계좌 잔액(초기값) : 10000원
		int money = 10000;
		// 입금 받기
		System.out.println("입금 금액을 입력해주십시요.");
		int deposit = scanner.nextInt(); // 입금 금액 저장
		// 입금 후 계좌 잔액
		money += deposit;
		System.out.println("입금하신 금액은 " + deposit + "원이고 잔액은 " + money +"원입니다.");
		// 출금 금액 입력 받기(잔액 0원 될 때 까지 계속)
		while(true) {
			System.out.println("출금금액을 입력해주십시요");
			int withdraw = scanner.nextInt(); // 출금 금액
			// 0원 입력된 경우
			if(withdraw == 0) {
				System.out.println("0원을 입력하셨습니다. 확인하시고 다시 입력해주십시요.");
				continue;
			}
			// 출금 시스템
			if(withdraw > money) { // 입력 금액 > 잔액
				System.out.println("잔액은 " + money + "원인데 출금액 " + withdraw + "원이 더 커서 출금이 안됩니다.");
			}
			else { // 입력 금액 <= 잔액
				money -= withdraw;
				System.out.println(withdraw + "원을 출금처리했고 잔액은 " + money + "원입니다.");
			}
			// 잔액 = 0원 -> 프로그램 종료
			if(money == 0) {
				System.out.println("잔액이 0원이어서 거래가 종료됩니다. 감사합니다.");
				break;
			}
		}
	}
}
