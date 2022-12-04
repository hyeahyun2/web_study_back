package shopping2;

import java.util.Scanner;

// 회원가입 및 로그인 기능
public class MemberInsert extends Member {
	Scanner sc = new Scanner(System.in);
	// 회원 가입 기본 정보 입력
	public MemberInsert(String memberID, String password, String name) {
		super(memberID, password, name);
	}
	
	// 회원 추가 정보 입력
	void updateAddInfo() {
		System.out.println("추가 정보를 입력하시겠습니까?");
		System.out.print("추가 정보를 입력하시려면 Y, 그만하시려면 N을 입력해 주십시요.>>>" );
		String state = sc.nextLine();
		if(state.equals("y")||state.equals("Y")) { // 추가 정보 입력을 원할 시
			System.out.print("주소를 입력해 주십시요.>>> ");
			String UserAddress = sc.nextLine();
			System.out.print("이메일을 입력해 주십시요.>>> ");
			String UserEmail = sc.nextLine();
			// 입력 받은 정보 저장
			super.setAddress(UserAddress);
			super.setEmail(UserEmail);
		}
		else if(state.equals("n")||state.equals("N")) {
			System.out.println("추가 정보를 입력하지 않았습니다.");
		}
	}
	// 회원가입한 멤버 정보 나열
	void printMemberInfo() {
		System.out.println(super.toString());
	}
	// 로그인
	void login() {
		System.out.println("로그인 정보를 입력해 주세요.");
		String loginID, loginPW;
		boolean state = true; // 로그인 정보 일치 -> false
		while(state) {
			System.out.print("아이디를 입력해 주세요 >>> ");
			loginID = sc.nextLine();
			System.out.print("비밀번호를 입력해 주세요 >>> ");
			loginPW = sc.nextLine();
			if(loginID.equals(super.getMemberID()) && loginPW.equals(super.getPassword())) {
				System.out.println("로그인 되었습니다.");
				state = false;
			}
			else {
				System.out.println("로그인 정보가 정확하지 않습니다.");
			}
		}
	}
}
