package example;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member> treeSet; // treeSet ����

	public MemberTreeSet() { // treeSet ����
		treeSet = new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		treeSet.add(member); // treeSet�� ȸ�� �߰�
	}
	public boolean removeMember(int memberID) {
		// �Ű������� ���� ȸ�� ���̵� �ش��ϴ� ȸ�� ����
		Iterator<Member> ir = treeSet.iterator(); // iterator�� Ȱ���� ��ȸ
		
		while(ir.hasNext()) {
			Member member = ir.next(); // ȸ���� �ϳ��� �����ͼ�
			int tempId = member.getMemberID(); // ���̵� ��
			if(tempId == memberID) { // ���� ���̵��� ���
				treeSet.remove(member); // ȸ�� ����
				return true; // ���� �Ϸ��� ��� true ��ȯ
			}
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");
		return false; // �Է¹��� memberID�� �������� ���� ��� false ��ȯ
	}
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
