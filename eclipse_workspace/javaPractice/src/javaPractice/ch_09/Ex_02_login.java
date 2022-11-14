package javaPractice.ch_09;

import java.util.Scanner;

public class Ex_02_login {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// id = admin , password = 1234
		Scanner scanner = new Scanner(System.in);
		String id, password;
		System.out.print("아이디를 입력해주세요. >> ");
		id = scanner.nextLine();
		System.out.print("비밀번호를 입력해주세요. >> ");
		password = scanner.nextLine();
		
		boolean result = login(id, password);
		if(result) {
			System.out.println("로그인 되었습니다.");
			logout(id);
		}
		else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
	private static boolean login(String id, String password) {
		return (id.equals("admin") && password.equals("1234"));
	}

	private static void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

	
}
