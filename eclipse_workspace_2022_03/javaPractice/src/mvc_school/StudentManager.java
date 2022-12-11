package mvc_school;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	private Scanner input = new Scanner(System.in);
	private ArrayList<Student> students = new ArrayList<Student>();
	
	private final String Q_STUDENT_NUMBER = "�л��� �й��� �Է� �ϼ���. >>> ";
	private final String ERROR_MESSAGE = "Error : ";
	private final String NO_STUDENT = "�л��� �������� �ʽ��ϴ�!!!";
	
	// �й� ã�� �ش� �л� ���� ��� (���� �ȵ� ���̸� null)
	private Student findStudentInform(int studentNumber) {
		for(Student student : students) {
			if(student.getStudentNumber() == studentNumber) {
				System.out.println("�ش� �л��� ������ ������ �����ϴ�.");
				System.out.println("�̸� : " + student.getName());
				System.out.println("��ȭ��ȣ : " + student.getPhoneNumber());
				System.out.println("�޸� : " + student.getMemo());
				return student;
			}
		}
		return null;
	}
	// �ش� �й��� �л� ���� �� ���� �޼��� ���
	private Student judgeExistence(int studentNumber) {
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) {
			System.out.println(ERROR_MESSAGE + NO_STUDENT);
		}
		return newStudent;
	}

	// �л� ���� ���
	private void printStudentScore(Student newStudent) {
		System.out.println("�й� : " + newStudent.getStudentNumber());
		System.out.println("���� �������� ����� ���� >>> ");
		for(int i=0; i<newStudent.getClassCheck().length; i++) {
			if(newStudent.getClassCheck()[i]) {
				System.out.println("����� : " + Student.getClassName()[i] + " / ���� : " + newStudent.getClassScore()[i]);
			}
		}
	}
	// �Ѹ��� �л� ��� ����
	private void One() {
		System.out.println(Q_STUDENT_NUMBER);
		int studentNumber = input.nextInt(); // ������ Ȯ���� �л� �й�
		Student newStudent = judgeExistence(studentNumber);
		if(newStudent != null){
			printStudentScore(newStudent); // �л� ���� ��� �޼ҵ� ����
		}
	}
	// ��� �л� ��� ���� ���
	private void All() {
		for(Student student : students) {
			findStudentInform(student.getStudentNumber());
			printStudentScore(student); // �л� ���� ��� �޼ҵ� ����
			System.out.println();
		}
	}
	
	// ���� ���� ����
	private void classList() {
		for(int i=0; i<Student.getClassName().length; i++) {
			System.out.print(i+1 + ". " + Student.getClassName()[i] + " / ");
		}
		System.out.println(Student.getClassName().length+1 + ". ����");
	}
	
	// ���� ��û or ����
	private void setClass(String message, Student newStudent, boolean check) {
		System.out.println(message);
		classList(); // ���� ���� ����
		int index = input.nextInt() - 1;
		if(index == newStudent.getClassCheck().length) return; // ��� ���� ��
		newStudent.setClassCheck(index, check);
		
		if(!check) { // �������� �� �����̶��
			newStudent.setClassScore(index, 0); // ���� 0���� �ʱ�ȭ
		}
	}
	
	// 1. �л� �߰� �� ����
	public void addStudent() {
		System.out.print(Q_STUDENT_NUMBER);
		int studentNumber = input.nextInt(); // �� �� �Է� ����
		
		// �Է��� �й����� ���ο� �л��� ����
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { // �й� �ߺ� �˻�
			newStudent = new Student(studentNumber); // �ߺ� �й� ������ �� ��ü ����
			students.add(newStudent); // �л� ��ü�� ArrayList�� ����
		}
		else {
			System.out.println("�̹� �����ϴ� �л��Դϴ�.");
			System.out.println("������ �л� ������ �Է����ּ���.");
		}
		System.out.print("�̸��� �Է� �ϼ���. >>> ");
		newStudent.setName(input.next());
		System.out.print("��ȭ ��ȣ�� �Է� �ϼ���. >>> ");
		newStudent.setPhoneNumber(input.next());
		System.out.print("�޸� �Է� �ϼ���. >>> ");
		newStudent.setMemo(input.next());
		
		System.out.println("�л� �߰�/������ �Ϸ� �Ǿ����ϴ�." + "\n");
	}
	
	// 2. �л� ���� �޴�
	public void removeStudent() {
		System.out.print(Q_STUDENT_NUMBER);
		int studentNumber = input.nextInt(); // �й� �Է� �ޱ�
		
		Student newStudent = judgeExistence(studentNumber);
		if(newStudent == null) return; // ���� ������ �л��� ������ ���ٸ� �޼ҵ� ������
		students.remove(newStudent); // �ش� �л��� ����
		System.out.println("�л� ������ �Ϸ�Ǿ����ϴ�/");
	}
	
	// 3. ������û �޴�
	public void addClass() {
		System.out.print(Q_STUDENT_NUMBER);
		int studentNumber = input.nextInt(); // �й� �Է� �ޱ�
		
		Student newStudent = judgeExistence(studentNumber);
		if(newStudent == null) return; // ���� ������ �л��� ������ ���ٸ� �޼ҵ� ������
		while(true) {
			System.out.println("�޴��� �����ϼ���: 1. ������û / 2. �������� / 3. ����");
			int classMenu = input.nextInt();
			switch(classMenu) {
			case 1:
				setClass("������û �� ������ �����ϼ���", newStudent, true);
				break;
			case 2:
				setClass("�������� �� ������ �����ϼ���", newStudent, false);
				break;
			case 3:
				return;
			}
		}
	}
	
	// 4. ���� �Է� �޴�
	public void setScore() {
		System.out.print(Q_STUDENT_NUMBER);
		int studentNumber = input.nextInt();
		
		Student newStudent = judgeExistence(studentNumber);
		if(newStudent == null) return; // ���� ������ �л��� ������ ���ٸ� �޼ҵ� ������
		while(true) {
			System.out.println("������ �Է�/������ ������ �����ϼ���.");
			classList(); // ���� ���� ����
			int classMenu = input.nextInt();
			if(classMenu == Student.getClassName().length+1) { // ���� üũ ��
				break; // while�� ����
			}
			if(!newStudent.getClassCheck()[classMenu-1]) { // �̽�û üũ
				System.out.println(Student.getClassName()[classMenu-1] + "������ �̽�û �����Դϴ�!");
				continue; // �̽�û�̱� ������ �ݺ��� ó������ ���ư���
			}
			System.out.print("������ �Է��ϼ��� >>> ");
			int score = input.nextInt();
			if(score < 0 || score > 100) { // ������ 0~100 �������� üũ
				System.out.println(ERROR_MESSAGE + "������ 0���� 100������ ���ڸ� �Է��� �ּ���.");
				continue; // ó������ ���ư���
			}
			// �������� ����� ������ �Էµ� ���
			newStudent.setClassScore(classMenu-1, score); // �ش� �л��� score ������Ʈ
			System.out.println(Student.getClassName()[classMenu-1] +"���� �Է��� �Ϸ� �Ǿ����ϴ�.");
			
		}
	}
	
	// 5. �л� ���� ��ȸ �޴�
	public void infomStudent() {
		System.out.println("�޴��� ������ �ּ���. 1. Ư�� �л��� / 2. ��ü �л�");
		int menu = input.nextInt();
		switch(menu) {
		case 1: // Ư�� �л��� ���� ����
			One();
			break;
		case 2: // ��ü �л��� ���� ����
			All();
			break;
		default:
			System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			infomStudent();
		}
	}
}
