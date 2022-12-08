package mvc_school;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Student> students = new ArrayList<Student>();
	static String[] className = {"JAVA", "PYTHON", "C"};
	
	static Student findStudentInform(int studentNumber) {
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
	
	// ���� ��û or ����
	static void setClass(String message, Student newStudent, boolean check) {
		System.out.println(message);
		for(int i=0; i<className.length; i++) {
			System.out.print(i+1 + ". " + className[i] + " / ");
		}
		System.out.println();
		int index = input.nextInt() - 1;
		newStudent.setClassCheck(index, check);
		
		if(!check) { // �������� �� �����̶��
			newStudent.setClassScore(index, 0); // ���� 0���� �ʱ�ȭ
		}
	}
	
	// 1. �л� �߰� �� ����
	static void addStudent() {
		System.out.print("�л��� �й��� �Է� �ϼ���. >>> ");
		int studentNumber = input.nextInt(); // �й� �Է� ����
		
		// �Է��� �й����� ���ο� �л��� ����
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) {
			newStudent = new Student(studentNumber);
			students.add(newStudent); // �л� ��ü�� ArrayList�� ����
		}
		
		System.out.print("�̸��� �Է� �ϼ���. >>> ");
		newStudent.setName(input.next());
		System.out.print("��ȭ ��ȣ�� �Է� �ϼ���. >>> ");
		newStudent.setPhoneNumber(input.next());
		System.out.print("�޸� �Է� �ϼ���. >>> ");
		newStudent.setMemo(input.next());
		
		System.out.println("�л� �߰��� �Ϸ� �Ǿ����ϴ�." + "\n");
	}
	
	// 2. �л� ���� �޴�
	public static void removeStudent() {
		System.out.print("�л��� �й��� �Է� �ϼ���. >>> ");
		int studentNumber = input.nextInt(); // �й� �Է� �ޱ�
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { // ���� ������ �л��� ������ ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ�!!!");
			return; // �޼ҵ� ����
		}
		students.remove(newStudent); // �ش� �л��� ����
		System.out.println("�л� ������ �Ϸ�Ǿ����ϴ�/");
	}
	
	// 3. ������û �޴�
	public static void addClass() {
		System.out.print("�л��� �й��� �Է� �ϼ���. >>> ");
		int studentNumber = input.nextInt(); // �й� �Է� �ޱ�
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { // ���� ������ �л��� ������ ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ�!!!");
			return; // �޼ҵ� ����
		}
		
		while(true) {
			System.out.println("�޴��� �����ϼ���: 1. ������û / 2. �������� / 3. ����");
			int classMenu = input.nextInt();
			switch(classMenu) {
			case 1:
				setClass("������û �� ������ �����ϼ���", newStudent, true);
				break;
			case 2:
				setClass("�������� �� ������ �����ϼ���", newStudent, true);
				break;
			case 3:
				return;
			}
		}
	}
	
	// 4. ���� �Է� �޴�
	public static void setScore() {
		System.out.print("�л��� �й��� �Է� �ϼ���. >>> ");
		int studentNumber = input.nextInt();
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) {
			System.out.println("Error : �л��� �������� �ʽ��ϴ�!!!");
			return;
		}
		
		while(true) {
			System.out.println("������ �Է�/������ ������ �����ϼ���.");
			System.out.println("1. JAVA / 2. PYTHON / 3. C / 4. ����");
			int classMenu = input.nextInt();
			if(classMenu == 4) { // ���� üũ
				break; // while�� ����
			}
			if(!newStudent.getClassCheck()[classMenu-1]) { // �̽�û üũ
				System.out.println(className[classMenu-1] + "������ �̽�û �����Դϴ�!");
				continue; // �̽�û�̱� ������ �ݺ��� ó������ ���ư���
			}
			System.out.print("������ �Է��ϼ��� >>> ");
			int score = input.nextInt();
			if(score < 0 || score > 100) { // ������ 0~100 �������� üũ
				System.out.println("Error : ������ 0���� 100������ ���ڸ� �Է��� �ּ���.");
				continue; // ó������ ���ư���
			}
			// �������� ����� ������ �Էµ� ���
			newStudent.setClassScore(classMenu-1, score); // �ش� �л��� score ������Ʈ
			System.out.println(className[classMenu-1] +"���� �Է��� �Ϸ� �Ǿ����ϴ�.");
		}
	}
	
	// 5. �л� ���� ��ȸ �޴�
	public static void infomStudent() {
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
	
	// �л� ���� ���
	static void printStudentInfo(Student newStudent) {
		System.out.println("�й� : " + newStudent.getStudentNumber());
		System.out.println("�̸� : " + newStudent.getName());
		System.out.println("��ȭ��ȣ : " + newStudent.getPhoneNumber());
		System.out.println("�޸� : " + newStudent.getMemo());
		System.out.println("���� �������� ����� ���� >>> ");
		boolean[] classCheck = newStudent.getClassCheck();
		int[] classScore = newStudent.getClassScore();
		for(int i=0; i<classCheck.length; i++) {
			if(classCheck[i]) {
				System.out.println("����� : " + className[i] + " / ���� : " + classScore[i]);
			}
		}
	}
	// �Ѹ��� �л� ����
	static void One() {
		System.out.println("�л��� �й��� �Է� �ϼ���.");
		int studentNumber = input.nextInt(); // ������ Ȯ���� �л� �й�
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null){
			System.out.println("Error : �л��� �������� �ʽ��ϴ�!!!");
			return;
		}
		printStudentInfo(newStudent); // �л� ���� ��� �޼ҵ� ����
	}
	// ��� �л� ���� ���
	static void All() {
		for(Student student : students) {
			printStudentInfo(student); // �л� ���� ��� �޼ҵ� ����
			System.out.println();
		}
	}
}
