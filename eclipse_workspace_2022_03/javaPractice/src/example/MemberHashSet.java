package example;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hashSet; // HashSet 선언

	public MemberHashSet() { // HashSet 생성
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member); // HashSet에 회원 추가
	}
	public boolean removeMember(int memberID) {
		// 매개변수로 받은 회원 아이디에 해당하는 회원 삭제
		Iterator<Member> ir = hashSet.iterator(); // iterator을 활용해 순회
		
		while(ir.hasNext()) {
			Member member = ir.next(); // 회원을 하나씩 가져와서
			int tempId = member.getMemberID(); // 아이디 비교
			if(tempId == memberID) { // 같은 아이디인 경우
				hashSet.remove(member); // 회원 삭제
				return true; // 삭제 완료한 경우 true 반환
			}
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false; // 입력받은 memberID가 존재하지 않은 경우 false 반환
	}
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

	
}
