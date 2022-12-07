package example;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		// 새로운 회원 인스턴스 생성
		Member memberPark = new Member(1003,"박서원");
		Member memberLee = new Member(1001,"이지원");
		Member memberSon = new Member(1002,"손민국");
		
		// ArrayList에 회원 추가
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
		
		
		Member memberHong = new Member(1003, "홍길동"); // 1003 아이디 중복 회원 추가
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();

	}

}
