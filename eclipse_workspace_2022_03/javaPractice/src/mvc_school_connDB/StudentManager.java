package mvc_school_connDB;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	StudentDAO studentDAO = new StudentDAO();
	ClassListDAO classListDAO = new ClassListDAO();
	EnrolmentDAO enrolmentDAO = new EnrolmentDAO();
	
	private Scanner input = new Scanner(System.in);
	
	private final String Q_STUDENT_NUMBER = "�л��� �й��� �Է� �ϼ���. >>> ";
	private final String RETURN_MAIN_MENU = "���� �޴��� ���ư��ϴ�.";
	private final String ERROR_MESSAGE = "Error : ";
	private final String ERROR_WRONG_NUMBER = "��ȣ�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.";
	
	// �ش� �й��� �л� ���� �� ���� �޼��� ���
	
	// �л� ���� ���
	private void printStudent(StudentDTO student) {
//		System.out.println("�ش� �л��� ������ ������ �����ϴ�.");
		System.out.println("�̸� : " + student.getName());
		System.out.println("��ȭ��ȣ : " + student.getPhoneNumber());
		System.out.println("�޸� : " + student.getMemo());
	}
	
	// ��� ���� ���� ���
	private void printClass() {
		ArrayList<ClassListDTO> classList = classListDAO.allClass();
		for(ClassListDTO list : classList) {
			System.out.print("���� �ڵ� : " + list.getClassCode());
			System.out.println(" / ����� : " + list.getClassName());
		}
	}
	
	//�ش� �л��� ���� ��û ���� ���� ���
	private void printStudentClass(int id) {
		ArrayList<EnrolmentDTO> classList = enrolmentDAO.studentClass(id);
		for(EnrolmentDTO list : classList) {
			System.out.print("���� �ڵ� : " + list.getClassCode());
			String className = classListDAO.selectClassName(list.getClassCode());
			System.out.print(" / ����� : " + className);
			System.out.println( " / ���� : " + list.getScore());
		}
	}
	
	// 1. �л� �߰� �� ����
	public void addStudent() {
		StudentDTO student = new StudentDTO();
		
		System.out.print(Q_STUDENT_NUMBER);
		int id = input.nextInt(); // �� �� �Է� ����
		student.setId(id);

		// �й� �ߺ� �˻�
		if(studentDAO.isStudentID(id)) { // �л� ���� ����
			System.out.println("�̹� �����ϴ� �л��Դϴ�.");
			System.out.println("������ �л� ������ �Է����ּ���.");
			System.out.print("�̸��� �Է� �ϼ���. >>> ");
			student.setName(input.next());
			System.out.print("��ȭ ��ȣ�� �Է� �ϼ���. >>> ");
			student.setPhoneNumber(input.next());
			System.out.print("�޸� �Է� �ϼ���. >>> ");
			student.setMemo(input.next());
			if(studentDAO.updateStudent(student)) {
				System.out.println("�л� ���� ������ �Ϸ� �Ǿ����ϴ�." + "\n");
			}
			else {
				System.out.println(ERROR_MESSAGE + "�л� ���� ������ �����߽��ϴ�..");
			}
		}
		else { // �л� �߰�
			System.out.print("�̸��� �Է� �ϼ���. >>> ");
			student.setName(input.next());
			System.out.print("��ȭ ��ȣ�� �Է� �ϼ���. >>> ");
			student.setPhoneNumber(input.next());
			System.out.print("�޸� �Է� �ϼ���. >>> ");
			student.setMemo(input.next());
			if(studentDAO.addStudent(student)) {
				System.out.println("�л� �߰��� �Ϸ� �Ǿ����ϴ�." + "\n");
			}
			else {
				System.out.println(ERROR_MESSAGE + "�л� �߰��� �����߽��ϴ�..");
			}
		}
	}
	
	// 2. �л� ���� �޴�
	public void removeStudent() {
		System.out.print(Q_STUDENT_NUMBER);
		int id = input.nextInt(); // �й� �Է� �ޱ�
		
		// �Է��� �й��� �������� ���� ���
		if(!studentDAO.isStudentID(id)) {
			System.out.println(ERROR_MESSAGE + "�Է��� �й��� ������ �л��� �������� �ʽ��ϴ�.");
			return;
		}
		// �ش� �л� ���� ��� + ���� ���� ����
		printStudent(studentDAO.studentOne(id));
		System.out.println("������ �л��� ������ �½��ϱ�?(y/n)");
		String state = input.next();
		
		if(state.equals("y") || state.equals("Y")) {
			// �л� ���� ����
			if(studentDAO.removeStudent(id)) {
				System.out.println("�л� ������ �Ϸ�Ǿ����ϴ�.");
			}
			else {
				System.out.println(ERROR_MESSAGE + "�л� ���� ó���� �����߽��ϴ�..");
			}
		}
		else { // ���� ��û ���
			System.out.println(RETURN_MAIN_MENU);
		}
	}
	
	// 3. ������û �޴�
	public void addClass() {
		System.out.print(Q_STUDENT_NUMBER);
		int id = input.nextInt(); // �й� �Է� �ޱ�
		
		// �Է��� �й��� �������� ���� ���
		if(!studentDAO.isStudentID(id)) {
			System.out.println(ERROR_MESSAGE + "�Է��� �й��� ������ �л��� �������� �ʽ��ϴ�.");
			return;
		}
		
		int classCode;
		while(true) {
			System.out.println("�޴��� �����ϼ���: 1. ������û / 2. �������� / 3. ����");
			int classMenu = input.nextInt();
			switch(classMenu) {
			case 1: // ���� ��û
				printClass();
				System.out.println("������û �� ������ �����ϼ���. (�����ڵ� �Է�)");
				classCode = input.nextInt();
				if(!classListDAO.isClassCode(classCode)) { // ���� �ڵ� �Է�
					System.out.println(ERROR_MESSAGE + "���� �ڵ带 �߸� �Է��ϼ̽��ϴ�.");
					break;
				}
				if(enrolmentDAO.isEnrolment(id, classCode)) { // �ߺ� ��û ����
					System.out.println(ERROR_MESSAGE + "�ش� ������ �̹� ��û�� �����Դϴ�.");
				}
				else enrolmentDAO.setClass(id, classCode, true);
				break;
			case 2: // ���� ����
				System.out.println("�ش� �л��� ���� ��û ���� �����Դϴ�.");
				printStudentClass(id);
				System.out.println("�������� �� ������ �����ϼ���. (�����ڵ� �Է�)");
				classCode = input.nextInt();
				if(!enrolmentDAO.isEnrolment(id, classCode)) { // ������û ���� ���� �Է�
					System.out.println(ERROR_MESSAGE + "�ش� ������ ��û ������ �ƴմϴ�.");
				}
				else enrolmentDAO.setClass(id, classCode, false);
				break;
			case 3:
				System.out.println(RETURN_MAIN_MENU);
				return;
			}
		}
	}
	
	// 4. ���� �Է� �޴�
	public void setScore() {
		System.out.print(Q_STUDENT_NUMBER);
		int id = input.nextInt();
		
		// �Է��� �й��� �������� ���� ���
		if(!studentDAO.isStudentID(id)) {
			System.out.println(ERROR_MESSAGE + "�Է��� �й��� ������ �л��� �������� �ʽ��ϴ�.");
			return;
		}
		
		while(true) {
			System.out.println("�ش� �л��� ���� ��û ���� �����Դϴ�.");
			printStudentClass(id); // ���� ���� ����
			System.out.println("������ �Է�/������ ������ �����ϼ���. (�����ڵ� �Է�)");
			System.out.println("(0 : ���� �޴��� ���ư���)");
			int classCode = input.nextInt();
			if(classCode == 0) { // ���� üũ ��
				break; // while�� ����
			}
			if(!enrolmentDAO.isEnrolment(id, classCode)) { // ������û ���� ���� �Է�
				System.out.println(ERROR_MESSAGE + "�ش� ������ ��û ������ �ƴմϴ�.");
				continue;
			}
			
			System.out.print("������ �Է��ϼ��� >>> ");
			int score = input.nextInt();
			if(score < 0 || score > 100) { // ������ 0~100 �������� üũ
				System.out.println(ERROR_MESSAGE + "������ 0���� 100������ ���ڸ� �Է��� �ּ���.");
				continue; // ó������ ���ư���
			}
			// �������� ����� ������ �Էµ� ���
			if(enrolmentDAO.settingScore(id, classCode, score)) {
				System.out.println("���� �Է��� �Ϸ� �Ǿ����ϴ�.");
				System.out.println();
			}
		}
	}
	
	// 5. �л� ���� ��ȸ �޴�
	public void infomStudent() {
		System.out.println("�޴��� ������ �ּ���. 1. Ư�� �л��� / 2. ��ü �л�");
		int menu = input.nextInt();
		switch(menu) {
		case 1: // Ư�� �л��� ���� ����
			System.out.print(Q_STUDENT_NUMBER);
			int id = input.nextInt();
			// �Է��� �й��� �������� ���� ���
			if(!studentDAO.isStudentID(id)) {
				System.out.println(ERROR_MESSAGE + "�Է��� �й��� ������ �л��� �������� �ʽ��ϴ�.");
				return;
			}
			printStudent(studentDAO.studentOne(id)); // �л� ����
			System.out.println("���� ���� )");
			printStudentClass(id); // �ش� �л� ���� ���� ����
			break;
		case 2: // ��ü �л��� ���� ����
			for(StudentDTO student : studentDAO.studentAll()) {
				printStudent(student); // �л� ����
				System.out.println("���� ���� )");
				printStudentClass(student.getId()); // �ش� �л� ���� ���� ����
				System.out.println();
			}
			break;
		default:
			System.out.println(ERROR_MESSAGE + ERROR_WRONG_NUMBER);
			infomStudent();
		}
	}
	
	// 6. ���� ���� ����
	public void manageClass() {
		while(true) {
			System.out.print("�޴��� ������ �ּ���. ");
			System.out.println("1. �������� ��� / 2. �������� ���� / 3. �������� ��ȸ"
					+ " 4. ���θ޴���");
			int menuNum = input.nextInt();
			
			int classCode;
			switch(menuNum) {
			case 1:
				System.out.println("����� ������ ������ �Է��ϼ���.");
				ClassListDTO newClass = new ClassListDTO();
				System.out.print("�ڵ� : ");
				classCode = input.nextInt();
				// �ߺ� �ڵ� �Ÿ���
				if(classListDAO.isClassCode(classCode)) {
					System.out.println(ERROR_MESSAGE + "�̹� �����ϴ� �����ڵ��Դϴ�.");
				}
				else { // �ߺ��� ������
					newClass.setClassCode(classCode);
					System.out.print("����� : ");
					newClass.setClassName(input.next());
					if(classListDAO.addClass(newClass)) {
						System.out.println("������ ��ϵǾ����ϴ�.");
					}
					else {
						System.out.println(ERROR_MESSAGE + "���� ����� �����߽��ϴ�..");
					}
				}
				break;
			case 2:
				System.out.println("������ ���� �ڵ带 �Է��ϼ���.");
				System.out.print("���� �ڵ� : ");
				classCode = input.nextInt();
				// �Է��� �ڵ尡 �������� ���� ���
				if(!classListDAO.isClassCode(classCode)) {
					System.out.println(ERROR_MESSAGE + "�Է��� �ڵ带 ������ ������ �������� �ʽ��ϴ�.");
				}
				else { // �Է� �ڵ尡 ������ ��� -> ��� ����
					String className = classListDAO.selectClassName(classCode);
					System.out.print("���� �ڵ� : " + classCode);
					System.out.println(" / ����� : " + className);
					System.out.println("���� �����Ͻðڽ��ϱ�?(y/n)");
					String state = input.next();
					if(state.equals("y") || state.equals("Y")) {
						if(classListDAO.removeClass(classCode)) {
							System.out.println("�ش� ������ �����߽��ϴ�.");
						}
						else {
							System.out.println(ERROR_MESSAGE + "���� ������ �����߽��ϴ�..");
						}
					}
				}
				break;
			case 3:
				System.out.println("�������� ��ȸ �޴��� �����ϼ̽��ϴ�.");
				printClass(); // ��� ���� ���� ���
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
