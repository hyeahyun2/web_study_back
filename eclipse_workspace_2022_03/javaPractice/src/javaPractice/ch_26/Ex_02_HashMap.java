package javaPractice.ch_26;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ex_02_HashMap {
	/* 아이디와 비밀번호 검사하기
	 * 아이디 비번을 입력을 받아서 map에 저장된 값과 비교
	 * 1) 동일한 아이디 비번이 있는 경우 -> "로그인되었습니다."
	 * 2) 동일한 아이디는 있는데 비번이 틀릴 경우 -> "비밀번호가 일치하지 않습니다."
	 * 3) 동일한 아이디가 없는 경우 -> "입력하신 아이디가 존재하지 않습니다."
	 * */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		// 아이디와 비밀번호를 미리 저장
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해 주세요.");
			System.out.print("아이디 : ");
			String id = scanner.nextLine();
			System.out.print("비밀번호 : ");
			String pw = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id) && map.containsValue(pw)) {
				System.out.println("로그인되었습니다.");
				break;
			}
			else if(map.containsKey(id)) {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
			else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
			System.out.println();
		}
	}

}
