package example;

public class MemberLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberLinkedList memberLinkedList = new MemberLinkedList();
		
		// 새로운 회원 인스턴스 생성
		Member memberLee = new Member(1001,"이지원");
		Member memberSon = new Member(1002,"손민국");
		Member memberPark = new Member(1003,"박서원");
		Member memberHong = new Member(1004,"홍길동");
		
		// ArrayList에 회원 추가
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(memberSon);
		memberLinkedList.addMember(memberPark);
		memberLinkedList.addMember(memberHong);
		
		memberLinkedList.showAllMember(); // 전체 회원 출력
		
		memberLinkedList.removeMember(memberHong.getMemberID());
		memberLinkedList.showAllMember();
	}

}
