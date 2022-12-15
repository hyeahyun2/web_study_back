package mvc_school_connDB;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	StudentDAO studentDAO = new StudentDAO();
	ClassListDAO classListDAO = new ClassListDAO();
	EnrolmentDAO enrolmentDAO = new EnrolmentDAO();
	
	private Scanner input = new Scanner(System.in);
	
	private final String Q_STUDENT_NUMBER = "학생의 학번을 입력 하세요. >>> ";
	private final String RETURN_MAIN_MENU = "메인 메뉴로 돌아갑니다.";
	private final String ERROR_MESSAGE = "Error : ";
	private final String ERROR_WRONG_NUMBER = "번호를 잘못 입력하셨습니다. 다시 입력해주세요.";
	
	// 해당 학번의 학생 없을 때 에러 메세지 출력
	
	// 학생 정보 출력
	private void printStudent(StudentDTO student) {
//		System.out.println("해당 학생의 정보는 다음과 같습니다.");
		System.out.println("이름 : " + student.getName());
		System.out.println("전화번호 : " + student.getPhoneNumber());
		System.out.println("메모 : " + student.getMemo());
	}
	
	// 모든 과목 정보 출력
	private void printClass() {
		ArrayList<ClassListDTO> classList = classListDAO.allClass();
		for(ClassListDTO list : classList) {
			System.out.print("과목 코드 : " + list.getClassCode());
			System.out.println(" / 과목명 : " + list.getClassName());
		}
	}
	
	//해당 학생의 수강 신청 과목 정보 출력
	private void printStudentClass(int id) {
		ArrayList<EnrolmentDTO> classList = enrolmentDAO.studentClass(id);
		for(EnrolmentDTO list : classList) {
			System.out.print("과목 코드 : " + list.getClassCode());
			String className = classListDAO.selectClassName(list.getClassCode());
			System.out.print(" / 과목명 : " + className);
			System.out.println( " / 점수 : " + list.getScore());
		}
	}
	
	// 1. 학생 추가 및 수정
	public void addStudent() {
		StudentDTO student = new StudentDTO();
		
		System.out.print(Q_STUDENT_NUMBER);
		int id = input.nextInt(); // 학 번 입력 받음
		student.setId(id);

		// 학번 중복 검사
		if(studentDAO.isStudentID(id)) { // 학생 정보 수정
			System.out.println("이미 존재하는 학생입니다.");
			System.out.println("수정할 학생 정보를 입력해주세요.");
			System.out.print("이름을 입력 하세요. >>> ");
			student.setName(input.next());
			System.out.print("전화 번호를 입력 하세요. >>> ");
			student.setPhoneNumber(input.next());
			System.out.print("메모를 입력 하세요. >>> ");
			student.setMemo(input.next());
			if(studentDAO.updateStudent(student)) {
				System.out.println("학생 정보 수정이 완료 되었습니다." + "\n");
			}
			else {
				System.out.println(ERROR_MESSAGE + "학생 정보 수정이 실패했습니다..");
			}
		}
		else { // 학생 추가
			System.out.print("이름을 입력 하세요. >>> ");
			student.setName(input.next());
			System.out.print("전화 번호를 입력 하세요. >>> ");
			student.setPhoneNumber(input.next());
			System.out.print("메모를 입력 하세요. >>> ");
			student.setMemo(input.next());
			if(studentDAO.addStudent(student)) {
				System.out.println("학생 추가가 완료 되었습니다." + "\n");
			}
			else {
				System.out.println(ERROR_MESSAGE + "학생 추가가 실패했습니다..");
			}
		}
	}
	
	// 2. 학생 삭제 메뉴
	public void removeStudent() {
		System.out.print(Q_STUDENT_NUMBER);
		int id = input.nextInt(); // 학번 입력 받기
		
		// 입력한 학번이 존재하지 않을 경우
		if(!studentDAO.isStudentID(id)) {
			System.out.println(ERROR_MESSAGE + "입력한 학번을 가지는 학생은 존재하지 않습니다.");
			return;
		}
		// 해당 학생 정보 출력 + 삭제 여부 묻기
		printStudent(studentDAO.studentOne(id));
		System.out.println("삭제할 학생의 정보가 맞습니까?(y/n)");
		String state = input.next();
		
		if(state.equals("y") || state.equals("Y")) {
			// 학생 정보 삭제
			if(studentDAO.removeStudent(id)) {
				System.out.println("학생 삭제가 완료되었습니다.");
			}
			else {
				System.out.println(ERROR_MESSAGE + "학생 삭제 처리가 실패했습니다..");
			}
		}
		else { // 삭제 요청 취소
			System.out.println(RETURN_MAIN_MENU);
		}
	}
	
	// 3. 수강신청 메뉴
	public void addClass() {
		System.out.print(Q_STUDENT_NUMBER);
		int id = input.nextInt(); // 학번 입력 받기
		
		// 입력한 학번이 존재하지 않을 경우
		if(!studentDAO.isStudentID(id)) {
			System.out.println(ERROR_MESSAGE + "입력한 학번을 가지는 학생은 존재하지 않습니다.");
			return;
		}
		
		int classCode;
		while(true) {
			System.out.println("메뉴를 선택하세요: 1. 수강신청 / 2. 수강포기 / 3. 종료");
			int classMenu = input.nextInt();
			switch(classMenu) {
			case 1: // 수강 신청
				printClass();
				System.out.println("수강신청 할 과목을 선택하세요. (과목코드 입력)");
				classCode = input.nextInt();
				if(!classListDAO.isClassCode(classCode)) { // 없는 코드 입력
					System.out.println(ERROR_MESSAGE + "과목 코드를 잘못 입력하셨습니다.");
					break;
				}
				if(enrolmentDAO.isEnrolment(id, classCode)) { // 중복 신청 방지
					System.out.println(ERROR_MESSAGE + "해당 과목은 이미 신청한 상태입니다.");
				}
				else enrolmentDAO.setClass(id, classCode, true);
				break;
			case 2: // 수강 포기
				System.out.println("해당 학생의 수강 신청 과목 정보입니다.");
				printStudentClass(id);
				System.out.println("수강포기 할 과목을 선택하세요. (과목코드 입력)");
				classCode = input.nextInt();
				if(!enrolmentDAO.isEnrolment(id, classCode)) { // 수강신청 안한 과목 입력
					System.out.println(ERROR_MESSAGE + "해당 과목은 신청 과목이 아닙니다.");
				}
				else enrolmentDAO.setClass(id, classCode, false);
				break;
			case 3:
				System.out.println(RETURN_MAIN_MENU);
				return;
			}
		}
	}
	
	// 4. 성적 입력 메뉴
	public void setScore() {
		System.out.print(Q_STUDENT_NUMBER);
		int id = input.nextInt();
		
		// 입력한 학번이 존재하지 않을 경우
		if(!studentDAO.isStudentID(id)) {
			System.out.println(ERROR_MESSAGE + "입력한 학번을 가지는 학생은 존재하지 않습니다.");
			return;
		}
		
		while(true) {
			System.out.println("해당 학생의 수강 신청 과목 정보입니다.");
			printStudentClass(id); // 수강 과목 나열
			System.out.println("성적을 입력/수정할 과목을 선택하세요. (과목코드 입력)");
			System.out.println("(0 : 메인 메뉴로 돌아가기)");
			int classCode = input.nextInt();
			if(classCode == 0) { // 종료 체크 시
				break; // while문 종료
			}
			if(!enrolmentDAO.isEnrolment(id, classCode)) { // 수강신청 안한 과목 입력
				System.out.println(ERROR_MESSAGE + "해당 과목은 신청 과목이 아닙니다.");
				continue;
			}
			
			System.out.print("성적을 입력하세요 >>> ");
			int score = input.nextInt();
			if(score < 0 || score > 100) { // 성적이 0~100 까지인지 체크
				System.out.println(ERROR_MESSAGE + "성적은 0부터 100사이의 숫자만 입력해 주세요.");
				continue; // 처음으로 돌아가기
			}
			// 정상적인 과목과 성적이 입력된 경우
			if(enrolmentDAO.settingScore(id, classCode, score)) {
				System.out.println("성적 입력이 완료 되었습니다.");
				System.out.println();
			}
		}
	}
	
	// 5. 학생 정보 조회 메뉴
	public void infomStudent() {
		System.out.println("메뉴를 선택해 주세요. 1. 특정 학생만 / 2. 전체 학생");
		int menu = input.nextInt();
		switch(menu) {
		case 1: // 특정 학생의 성적 정보
			System.out.print(Q_STUDENT_NUMBER);
			int id = input.nextInt();
			// 입력한 학번이 존재하지 않을 경우
			if(!studentDAO.isStudentID(id)) {
				System.out.println(ERROR_MESSAGE + "입력한 학번을 가지는 학생은 존재하지 않습니다.");
				return;
			}
			printStudent(studentDAO.studentOne(id)); // 학생 정보
			System.out.println("수강 과목 )");
			printStudentClass(id); // 해당 학생 수강 과목 정보
			break;
		case 2: // 전체 학생의 성적 정보
			for(StudentDTO student : studentDAO.studentAll()) {
				printStudent(student); // 학생 정보
				System.out.println("수강 과목 )");
				printStudentClass(student.getId()); // 해당 학생 수강 과목 정보
				System.out.println();
			}
			break;
		default:
			System.out.println(ERROR_MESSAGE + ERROR_WRONG_NUMBER);
			infomStudent();
		}
	}
	
	// 6. 수강 과목 관리
	public void manageClass() {
		while(true) {
			System.out.print("메뉴를 선택해 주세요. ");
			System.out.println("1. 수강과목 등록 / 2. 수강과목 삭제 / 3. 수강과목 조회"
					+ " 4. 메인메뉴로");
			int menuNum = input.nextInt();
			
			int classCode;
			switch(menuNum) {
			case 1:
				System.out.println("등록할 과목의 정보를 입력하세요.");
				ClassListDTO newClass = new ClassListDTO();
				System.out.print("코드 : ");
				classCode = input.nextInt();
				// 중복 코드 거르기
				if(classListDAO.isClassCode(classCode)) {
					System.out.println(ERROR_MESSAGE + "이미 존재하는 과목코드입니다.");
				}
				else { // 중복이 없으면
					newClass.setClassCode(classCode);
					System.out.print("과목명 : ");
					newClass.setClassName(input.next());
					if(classListDAO.addClass(newClass)) {
						System.out.println("과목이 등록되었습니다.");
					}
					else {
						System.out.println(ERROR_MESSAGE + "과목 등록이 실패했습니다..");
					}
				}
				break;
			case 2:
				System.out.println("삭제할 과목 코드를 입력하세요.");
				System.out.print("과목 코드 : ");
				classCode = input.nextInt();
				// 입력한 코드가 존재하지 않을 경우
				if(!classListDAO.isClassCode(classCode)) {
					System.out.println(ERROR_MESSAGE + "입력한 코드를 가지는 과목은 존재하지 않습니다.");
				}
				else { // 입력 코드가 존재할 경우 -> 계속 진행
					String className = classListDAO.selectClassName(classCode);
					System.out.print("과목 코드 : " + classCode);
					System.out.println(" / 과목명 : " + className);
					System.out.println("정말 삭제하시겠습니까?(y/n)");
					String state = input.next();
					if(state.equals("y") || state.equals("Y")) {
						if(classListDAO.removeClass(classCode)) {
							System.out.println("해당 과목을 삭제했습니다.");
						}
						else {
							System.out.println(ERROR_MESSAGE + "과목 삭제에 실패했습니다..");
						}
					}
				}
				break;
			case 3:
				System.out.println("수강과목 조회 메뉴를 선택하셨습니다.");
				printClass(); // 모든 과목 정보 출력
				System.out.println();
				break;
			case 4:
				System.out.println(RETURN_MAIN_MENU);
				return;
			default:
				System.out.println(ERROR_MESSAGE + ERROR_WRONG_NUMBER);
			}
		}
	}
}
