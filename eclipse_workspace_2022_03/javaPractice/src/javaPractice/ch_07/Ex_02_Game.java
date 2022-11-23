package javaPractice.ch_07;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_02_Game {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 가위=1, 바위=2, 보=3
		 * 배열 길이 = 5, 1~3 데이터 섞어 초기화
		 * 게임 시작 전 배열에 컴퓨터가 제시할 가위바위보 데이터 입력
		 * 게임 총 5회 진행
		 * 키보드로 1, 2, 3중 하나 입력
		 * 컴퓨터 배열 안의 인덱스 번호 0부터 ~ 차례대로
		 * 컴퓨터와 입력값 비교해서 누가 이겼는지 출력
		 * 비긴 경우 횟수에 추가 x
		 * 반복문 종료 후 게임 결과(누가 이겼는지) 출력
		 * */
		int[] computer = new int[5];
		String[] game = {"가위", "바위", "보"};
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<computer.length; i++) {
			computer[i] = (int)(Math.random()*3)+1;
		}
//		System.out.println(Arrays.toString(computer));
		int userWin = 0;
		int compWin = 0;
		for(int i=0; i<computer.length; i++) {
			System.out.print(i+1 + "판째 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해주세요 : ");
			int user = scanner.nextInt();
			System.out.print(game[user-1] + "입력했고, 컴퓨터는 " + game[computer[i]-1] + "입니다. ");
			if(user % 3 == (computer[i] + 1) % 3) {
				System.out.println("이겼습니다.");
				userWin ++;
			}
			else if(user % 3 == (computer[i] - 1) % 3) {
				System.out.println("졌습니다.");
				compWin ++;
			}
			else if(user % 3 == computer[i] % 3){
				System.out.println("비겼습니다.");
				i--;
			}
		}
		System.out.println("게임이 종료되었습니다.");
		System.out.println("사용자 승 : " + userWin + ", 컴퓨터 승 : " + compWin);
		
	}
}
