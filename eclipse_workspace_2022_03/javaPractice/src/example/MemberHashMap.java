package example;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) { // 회원 추가
		// member.getMemberID() = key, member = value
		hashMap.put(member.getMemberID(), member); // key-value 쌍으로 추가
	}
	
	public boolean removeMember(int memberID) { // 회원을 삭제하는 메서드
		if(hashMap.containsKey(memberID)) { // HashMap에 매개변수로 받은 키 값인 회원 아이디가 있다
			hashMap.remove(memberID); // 해당 회원 삭제
			return true;
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() { // Iterator를 사용해서 전체 회원을 출력하는 메서드
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) { // 다음 key가 있다면
			int key = ir.next(); // key 값을 가져와서
			Member member = hashMap.get(key); // key로 부터 value 가져오기
			System.out.println(member);
		}
		System.out.println();
	}
}
