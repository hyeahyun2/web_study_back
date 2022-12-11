package mvc_school;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	private Scanner input = new Scanner(System.in);
	private ArrayList<Student> students = new ArrayList<Student>();
	
	private final String Q_STUDENT_NUMBER = "학생의 학번을 입력 하세요. >>> ";
	private final String ERROR_MESSAGE = "Error : ";
	private final String NO_STUDENT = "학생이 존재하지 않습니다!!!";
	
	// 학번 찾고 해당 학생 정보 출력 (저장 안된 값이면 null)
	private Student findStudentInform(int studentNumber) {
		for(Student student : students) {
			if(student.getStudentNumber() == studentNumber) {
				System.out.println("해당 학생의 정보는 다음과 같습니다.");
				System.out.println("이름 : " + student.getName());
				System.out.println("전화번호 : " + student.getPhoneNumber());
				System.out.println("메모 : " + student.getMemo());
				return student;
			}
		}
		return null;
	}
	// 해당 학번의 학생 없을 때 에러 메세지 출력
	private Student judgeExistence(int studentNumber) {
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) {
			System.out.println(ERROR_MESSAGE + NO_STUDENT);
		}
		return newStudent;
	}

	// 학생 성적 출력
	private void printStudentScore(Student newStudent) {
		System.out.println("학번 : " + newStudent.getStudentNumber());
		System.out.println("현재 수강중인 과목과 성적 >>> ");
		for(int i=0; i<newStudent.getClassCheck().length; i++) {
			if(newStudent.getClassCheck()[i]) {
				System.out.println("과목명 : " + Student.getClassName()[i] + " / 성적 : " + newStudent.getClassScore()[i]);
			}
		}
	}
	// 한명의 학생 모든 정보
	private void One() {
		System.out.println(Q_STUDENT_NUMBER);
		int studentNumber = input.nextInt(); // 정보를 확인할 학생 학번
		Student newStudent = judgeExistence(studentNumber);
		if(newStudent != null){
			printStudentScore(newStudent); // 학생 정보 출력 메소드 실행
		}
	}
	// 모든 학생 모든 정보 출력
	private void All() {
		for(Student student : students) {
			findStudentInform(student.getStudentNumber());
			printStudentScore(student); // 학생 정보 출력 메소드 실행
			System.out.println();
		}
	}
	
	// 수강 과목 나열
	private void classList() {
		for(int i=0; i<Student.getClassName().length; i++) {
			System.out.print(i+1 + ". " + Student.getClassName()[i] + " / ");
		}
		System.out.println(Student.getClassName().length+1 + ". 종료");
	}
	
	// 수강 신청 or 포기
	private void setClass(String message, Student newStudent, boolean check) {
		System.out.println(message);
		classList(); // 수강 과목 나열
		int index = input.nextInt() - 1;
		if(index == newStudent.getClassCheck().length) return; // 취소 선택 시
		newStudent.setClassCheck(index, check);
		
		if(!check) { // 수강포기 한 과목이라면
			newStudent.setClassScore(index, 0); // 성적 0으로 초기화
		}
	}
	
	// 1. 학생 추가 및 수정
	public void addStudent() {
		System.out.print(Q_STUDENT_NUMBER);
		int studentNumber = input.nextInt(); // 학 번 입력 받음
		
		// 입력한 학번으로 새로운 학생을 생성
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { // 학번 중복 검사
			newStudent = new Student(studentNumber); // 중복 학번 없으면 새 객체 생성
			students.add(newStudent); // 학생 객체를 ArrayList에 저장
		}
		else {
			System.out.println("이미 존재하는 학생입니다.");
			System.out.println("수정할 학생 정보를 입력해주세요.");
		}
		System.out.print("이름을 입력 하세요. >>> ");
		newStudent.setName(input.next());
		System.out.print("전화 번호를 입력 하세요. >>> ");
		newStudent.setPhoneNumber(input.next());
		System.out.print("메모를 입력 하세요. >>> ");
		newStudent.setMemo(input.next());
		
		System.out.println("학생 추가/수정이 완료 되었습니다." + "\n");
	}
	
	// 2. 학생 삭제 메뉴
	public void removeStudent() {
		System.out.print(Q_STUDENT_NUMBER);
		int studentNumber = input.nextInt(); // 학번 입력 받기
		
		Student newStudent = judgeExistence(studentNumber);
		if(newStudent == null) return; // 만약 기존에 학생의 정보가 없다면 메소드 끝내기
		students.remove(newStudent); // 해당 학생을 삭제
		System.out.println("학생 삭제가 완료되었습니다/");
	}
	
	// 3. 수강신청 메뉴
	public void addClass() {
		System.out.print(Q_STUDENT_NUMBER);
		int studentNumber = input.nextInt(); // 학번 입력 받기
		
		Student newStudent = judgeExistence(studentNumber);
		if(newStudent == null) return; // 만약 기존에 학생의 정보가 없다면 메소드 끝내기
		while(true) {
			System.out.println("메뉴를 선택하세요: 1. 수강신청 / 2. 수강포기 / 3. 종료");
			int classMenu = input.nextInt();
			switch(classMenu) {
			case 1:
				setClass("수강신청 할 과목을 선택하세요", newStudent, true);
				break;
			case 2:
				setClass("수강포기 할 과목을 선택하세요", newStudent, false);
				break;
			case 3:
				return;
			}
		}
	}
	
	// 4. 성적 입력 메뉴
	public void setScore() {
		System.out.print(Q_STUDENT_NUMBER);
		int studentNumber = input.nextInt();
		
		Student newStudent = judgeExistence(studentNumber);
		if(newStudent == null) return; // 만약 기존에 학생의 정보가 없다면 메소드 끝내기
		while(true) {
			System.out.println("성적을 입력/수정할 과목을 선택하세요.");
			classList(); // 수강 과목 나열
			int classMenu = input.nextInt();
			if(classMenu == Student.getClassName().length+1) { // 종료 체크 시
				break; // while문 종료
			}
			if(!newStudent.getClassCheck()[classMenu-1]) { // 미신청 체크
				System.out.println(Student.getClassName()[classMenu-1] + "과목은 미신청 과목입니다!");
				continue; // 미신청이기 때문에 반복문 처음으로 돌아가기
			}
			System.out.print("성적을 입력하세요 >>> ");
			int score = input.nextInt();
			if(score < 0 || score > 100) { // 성적이 0~100 까지인지 체크
				System.out.println(ERROR_MESSAGE + "성적은 0부터 100사이의 숫자만 입력해 주세요.");
				continue; // 처음으로 돌아가기
			}
			// 정상적인 과목과 성적이 입력된 경우
			newStudent.setClassScore(classMenu-1, score); // 해당 학생의 score 업데이트
			System.out.println(Student.getClassName()[classMenu-1] +"성적 입력이 완료 되었습니다.");
			
		}
	}
	
	// 5. 학생 정보 조회 메뉴
	public void infomStudent() {
		System.out.println("메뉴를 선택해 주세요. 1. 특정 학생만 / 2. 전체 학생");
		int menu = input.nextInt();
		switch(menu) {
		case 1: // 특정 학생의 성적 정보
			One();
			break;
		case 2: // 전체 학생의 성적 정보
			All();
			break;
		default:
			System.out.println("번호를 잘못 입력하셨습니다. 다시 입력해주세요.");
			infomStudent();
		}
	}
}
