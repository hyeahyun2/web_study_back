package mvc_school;

import java.util.Scanner;

public class SchoolManagerView {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("학생 관리 프로그램을 시작합니다.");
		
		while(true) {
			System.out.println("메뉴를 선택하세요 >> 1. 학생추가 / 2. 학생 삭제 / 3. 수강신청 / " + 
					"4. 성적 입력 / 5. 정보 조회 / 6. 프로그램 종료");
			int menu = input.nextInt();
			switch(menu) {
			case 1:
				System.out.println("학생 추가 및 수정 메뉴 입니다.");
				StudentManager.addStudent();
				break;
			case 2:
				System.out.println("학생 삭제 메뉴 입니다.");
				StudentManager.removeStudent();
				break;
			case 3:
				System.out.println("수강 신청 메뉴 입니다.");
				StudentManager.addClass();
				break;
			case 4:
				System.out.println("성적 입력 메뉴 입니다.");
				StudentManager.setScore();
				break;
			case 5:
				System.out.println("정보 조회 메뉴 입니다.");
				StudentManager.infomStudent();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				input.close();
				return;
			default:
				System.out.println("없는 메뉴를 선택하였습니다.");
			}
		}
	}

}
