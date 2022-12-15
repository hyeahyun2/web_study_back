package mvc_school_connDB;

import java.util.Scanner;

public class SchoolManagerView {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudentManager studentManager = new StudentManager();
		System.out.println("�л� ���� ���α׷��� �����մϴ�.");
		
		while(true) {
			System.out.println("�޴��� �����ϼ��� >> 1. �л��߰�/���� / 2. �л� ���� / 3. ������û / " + 
					"4. ���� �Է� / 5. ���� ��ȸ / 6. ���� ���� ���� / 7. ���α׷� ����");
			int menu = input.nextInt();
			switch(menu) {
			case 1:
				System.out.println("�л� �߰� �� ���� �޴� �Դϴ�.");
				studentManager.addStudent();
				break;
			case 2:
				System.out.println("�л� ���� �޴� �Դϴ�.");
				studentManager.removeStudent();
				break;
			case 3:
				System.out.println("���� ��û �޴� �Դϴ�.");
				studentManager.addClass();
				break;
			case 4:
				System.out.println("���� �Է� �޴� �Դϴ�.");
				studentManager.setScore();
				break;
			case 5:
				System.out.println("���� ��ȸ �޴� �Դϴ�.");
				studentManager.infomStudent();
				break;
			case 6:
				System.out.println("���� ���� ���� �޴��Դϴ�.");
				studentManager.manageClass();
				break;
			case 7:
				System.out.println("���α׷��� �����մϴ�.");
				input.close();
				return;
			default:
				System.out.println("���� �޴��� �����Ͽ����ϴ�.");
			}
		}
	}

}
