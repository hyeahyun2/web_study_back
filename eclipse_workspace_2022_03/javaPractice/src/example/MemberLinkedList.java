package example;

import java.util.ArrayList;
import java.util.LinkedList;

public class MemberLinkedList {
	private LinkedList<Member> linkedList;

	public MemberLinkedList() {
		this.linkedList = new LinkedList<Member>(); // Member 형으로 선언한 ArrayList 생성
	}
	
	public void addMember(Member member) {
		linkedList.add(member); // 회원을 추가
	}
	
	public boolean removeMember(int memberID) {
		for(int i=0; i<linkedList.size(); i++) {
			Member member = linkedList.get(i); // get() 메서드로 회원을 순차적으로 가져옴
			if(member.getMemberID() == memberID) { // 회원 아이디와 매개변수가 일치하면
				linkedList.remove(i); // 해당 회원을 삭제
				return true;
			}
		}
//		for(Member member : arrayList) {
//			if(member.getMemberID() == memberID) {
//				arrayList.remove(member);
//				return true;
//			}
//		}
		// 반복문 돌려서 해당 아이디 찾지 못한 경우
		System.out.println(memberID + "가 존재하지 않습니다."); 
		return false;
	}
	
	public void showAllMember() { // 전체 회원을 출력하는 메서드
		for(Member member : linkedList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
