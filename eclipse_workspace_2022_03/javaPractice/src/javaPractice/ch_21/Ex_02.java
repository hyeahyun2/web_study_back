package javaPractice.ch_21;

import java.util.Scanner;

// �α��� ������ Ʋ�� ��츦 ����� ���� ���ܸ� ���� ����ó�� �ϱ�!
class LoginException extends Exception {
	public LoginException() {}
	public LoginException(String message) {
		super(message);
	}
	/* ���ܰ� �߻��� �ÿ� �α׷� ����� �ڵ� */
	public LoginException(String message, String memberID, String password) {
		super(message);
		updateLog(memberID, password);
	}
	public void updateLog(String memberID, String password) {
		/* �α׸� ������ �޼��� ����� */
	}
}
public class Ex_02 {
	String memberID = "abc";
	String password = "1234";
	Scanner stdIn = new Scanner(System.in);
	private boolean confirmLogin(String memberID, String password) throws LoginException {
		if(!this.memberID.equals(memberID) || !this.password.equals(password)) {
			throw new LoginException("�α��� ������ ��Ȯ���� �ʽ��ϴ�.", memberID, password);
//			throw new LoginException("�α��� ������ ��Ȯ���� �ʽ��ϴ�.");
		}
		else {
			System.out.println("�α��� �Ǿ����ϴ�.");
			return true;
		}
	}
	public void login() {
		String memberID, password;
		Boolean answer;
		System.out.println("�α��� ������ �Է����ּ���.");
		do {
			System.out.print("���̵� �Է����ּ��� >> ");
			memberID = stdIn.nextLine();
			System.out.print("��й�ȣ�� �Է����ּ��� >> ");
			password = stdIn.nextLine();
			try {
				answer = confirmLogin(memberID, password);
			} catch(LoginException e) {
				System.out.println(e.getMessage());
				answer = false;
			}
		} while(!answer);
		
//		try {
//			confirmLogin(memberID, password);
//		} catch(LoginException e) {
//			System.out.println(e.getMessage());
//			login();
//		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex_02 ex = new Ex_02();
		ex.login();
	}
}
