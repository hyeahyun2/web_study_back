package example;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hashSet; // HashSet ����

	public MemberHashSet() { // HashSet ����
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member); // HashSet�� ȸ�� �߰�
	}
	public boolean removeMember(int memberID) {
		// �Ű������� ���� ȸ�� ���̵� �ش��ϴ� ȸ�� ����
		Iterator<Member> ir = hashSet.iterator(); // iterator�� Ȱ���� ��ȸ
		
		while(ir.hasNext()) {
			Member member = ir.next(); // ȸ���� �ϳ��� �����ͼ�
			int tempId = member.getMemberID(); // ���̵� ��
			if(tempId == memberID) { // ���� ���̵��� ���
				hashSet.remove(member); // ȸ�� ����
				return true; // ���� �Ϸ��� ��� true ��ȯ
			}
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");
		return false; // �Է¹��� memberID�� �������� ���� ��� false ��ȯ
	}
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

	
}
