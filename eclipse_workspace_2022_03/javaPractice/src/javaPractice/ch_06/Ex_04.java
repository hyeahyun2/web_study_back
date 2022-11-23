package javaPractice.ch_06;

import java.util.Random;
import java.util.Scanner;

public class Ex_04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 프로그램이 가지고 있는 정수를 사용자가 알아맞히는 게임
		 * 1. 1부터 1000 사이의 정수 랜덤 생성
		 * 2. 사용자가 답을 추측하여 입력
		 * 3. 정답이 아닐 경우, 정답이 입력한 값보다 큰지/작은지 알려주기
		 * 4. 정답일 경우, 성공 메세지 및 시도 횟수 출력
		 * */
		Random random = new Random();
		int answer = random.nextInt(999) + 1;
//		System.out.println(answer);
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("정답을 추측하여 보세요 : ");
			int inputNum = scanner.nextInt();
			count ++;
			if(inputNum > answer) {
				System.out.println("제시한 정수가 정답보다 높습니다");
			}
			else if(inputNum < answer) {
				System.out.println("제시한 정수가 정답보다 낮습니다");
			}
			else {
				System.out.println("축하합니다! 정답입니다!");
				break;
			}
		}
		System.out.println("정답은 " + answer);
		System.out.println("시도횟수 : " + count);
		scanner.close();
	}
}
