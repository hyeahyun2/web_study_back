package example;

import java.util.ArrayList;
import java.util.LinkedList;

public class MemberLinkedList {
	private LinkedList<Member> linkedList;

	public MemberLinkedList() {
		this.linkedList = new LinkedList<Member>(); // Member ������ ������ ArrayList ����
	}
	
	public void addMember(Member member) {
		linkedList.add(member); // ȸ���� �߰�
	}
	
	public boolean removeMember(int memberID) {
		for(int i=0; i<linkedList.size(); i++) {
			Member member = linkedList.get(i); // get() �޼���� ȸ���� ���������� ������
			if(member.getMemberID() == memberID) { // ȸ�� ���̵�� �Ű������� ��ġ�ϸ�
				linkedList.remove(i); // �ش� ȸ���� ����
				return true;
			}
		}
//		for(Member member : arrayList) {
//			if(member.getMemberID() == memberID) {
//				arrayList.remove(member);
//				return true;
//			}
//		}
		// �ݺ��� ������ �ش� ���̵� ã�� ���� ���
		System.out.println(memberID + "�� �������� �ʽ��ϴ�."); 
		return false;
	}
	
	public void showAllMember() { // ��ü ȸ���� ����ϴ� �޼���
		for(Member member : linkedList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
