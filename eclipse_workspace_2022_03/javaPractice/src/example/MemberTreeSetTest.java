package example;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		// ���ο� ȸ�� �ν��Ͻ� ����
		Member memberPark = new Member(1003,"�ڼ���");
		Member memberLee = new Member(1001,"������");
		Member memberSon = new Member(1002,"�չα�");
		
		// ArrayList�� ȸ�� �߰�
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
		
		
		Member memberHong = new Member(1003, "ȫ�浿"); // 1003 ���̵� �ߺ� ȸ�� �߰�
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();

	}

}
