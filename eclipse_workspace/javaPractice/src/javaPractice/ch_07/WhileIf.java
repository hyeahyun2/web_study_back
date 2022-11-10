package javaPractice.ch_07;

import java.util.Arrays;
import java.util.Scanner;

public class WhileIf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 학생 수와 각 학생들의 점수 입력받아
		 * 최고 점수 및 평균 점수를 구하는 프로그램
		 * */
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 > ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo == 1) {
				System.out.print("학생 수를 입력하세요 : ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			}
			else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.print(i + 1 + "번째 학생의 점수를 입력하세요 : ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				System.out.println("모든 학생의 점수가 입력되었습니다.");
			}
			else if(selectNo == 3) {
				for(int i = 0; i < studentNum; i++) {
					System.out.println(i + 1 + "번째 학생의 점수 : " + scores[i]);
				}
			}
			else if(selectNo == 4) { // 최고점수, 평균점수 구하기
				int maxNum = scores[0];
				int sumNum = scores[0];
				for(int i=1; i<studentNum; i++) {
					sumNum += scores[i];
					if(maxNum < scores[i]){
						maxNum = scores[i];
					}
				}
				System.out.println("최고점수 : " + maxNum);
				System.out.println("평균점수 : " + (double)sumNum/studentNum);
			}
			else if(selectNo == 5) {
				System.out.println("프로그램이 종료됩니다.");
				run = false;
			}
		}
	}
}
