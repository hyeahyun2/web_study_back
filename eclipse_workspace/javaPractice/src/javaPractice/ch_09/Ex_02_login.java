package javaPractice.ch_09;

import java.util.Scanner;

public class Ex_02_login {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// id = admin , password = 1234
		Scanner scanner = new Scanner(System.in);
		String id, password;
		System.out.print("���̵� �Է����ּ���. >> ");
		id = scanner.nextLine();
		System.out.print("��й�ȣ�� �Է����ּ���. >> ");
		password = scanner.nextLine();
		
		boolean result = login(id, password);
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			logout(id);
		}
		else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
	private static boolean login(String id, String password) {
		return (id.equals("admin") && password.equals("1234"));
	}

	private static void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}

	
}
