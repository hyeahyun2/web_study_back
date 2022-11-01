package javaPractice.ch_02;

public class Ex_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. 연필 534자루, 학생수 30명
		 * 2. 같은 개수로 나누어 줌
		 * 3. 학생당 몇 개씩?
		 * 4. 남는 연필 개수
		 * */
		
		int pencils = 534;
		int students = 30;
		
		// 학생 한 명이 가지는 연필 수
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		// 남은 연필 수
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		
		System.out.println("(역연산)총 연필 수 : " + (pencilsPerStudent * 30 + pencilsLeft));
	}
}
