package example;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member> treeSet; // treeSet 선언

	public MemberTreeSet() { // treeSet 생성
		treeSet = new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		treeSet.add(member); // treeSet에 회원 추가
	}
	public boolean removeMember(int memberID) {
		// 매개변수로 받은 회원 아이디에 해당하는 회원 삭제
		Iterator<Member> ir = treeSet.iterator(); // iterator을 활용해 순회
		
		while(ir.hasNext()) {
			Member member = ir.next(); // 회원을 하나씩 가져와서
			int tempId = member.getMemberID(); // 아이디 비교
			if(tempId == memberID) { // 같은 아이디인 경우
				treeSet.remove(member); // 회원 삭제
				return true; // 삭제 완료한 경우 true 반환
			}
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false; // 입력받은 memberID가 존재하지 않은 경우 false 반환
	}
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
