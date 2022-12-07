package example;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) { // ȸ�� �߰�
		// member.getMemberID() = key, member = value
		hashMap.put(member.getMemberID(), member); // key-value ������ �߰�
	}
	
	public boolean removeMember(int memberID) { // ȸ���� �����ϴ� �޼���
		if(hashMap.containsKey(memberID)) { // HashMap�� �Ű������� ���� Ű ���� ȸ�� ���̵� �ִ�
			hashMap.remove(memberID); // �ش� ȸ�� ����
			return true;
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() { // Iterator�� ����ؼ� ��ü ȸ���� ����ϴ� �޼���
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) { // ���� key�� �ִٸ�
			int key = ir.next(); // key ���� �����ͼ�
			Member member = hashMap.get(key); // key�� ���� value ��������
			System.out.println(member);
		}
		System.out.println();
	}
}
