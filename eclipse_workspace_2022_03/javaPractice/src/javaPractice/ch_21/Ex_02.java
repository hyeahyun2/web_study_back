package javaPractice.ch_21;

import java.util.Scanner;

// 로그인 정보가 틀린 경우를 사용자 정의 예외를 만들어서 예외처리 하기!
class LoginException extends Exception {
	public LoginException() {}
	public LoginException(String message) {
		super(message);
	}
	/* 예외가 발생할 시에 로그로 남기는 코드 */
	public LoginException(String message, String memberID, String password) {
		super(message);
		updateLog(memberID, password);
	}
	public void updateLog(String memberID, String password) {
		/* 로그를 저장할 메서드 만들기 */
	}
}
public class Ex_02 {
	String memberID = "abc";
	String password = "1234";
	Scanner stdIn = new Scanner(System.in);
	private boolean confirmLogin(String memberID, String password) throws LoginException {
		if(!this.memberID.equals(memberID) || !this.password.equals(password)) {
			throw new LoginException("로그인 정보가 정확하지 않습니다.", memberID, password);
//			throw new LoginException("로그인 정보가 정확하지 않습니다.");
		}
		else {
			System.out.println("로그인 되었습니다.");
			return true;
		}
	}
	public void login() {
		String memberID, password;
		Boolean answer;
		System.out.println("로그인 정보를 입력해주세요.");
		do {
			System.out.print("아이디를 입력해주세요 >> ");
			memberID = stdIn.nextLine();
			System.out.print("비밀번호를 입력해주세요 >> ");
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
