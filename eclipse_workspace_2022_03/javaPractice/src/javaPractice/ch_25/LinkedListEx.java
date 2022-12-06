package javaPractice.ch_25;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		// ��ũ�� ����Ʈ�� ��� �߰�
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		
		System.out.println(linkedList); // ����Ʈ ��ü ���
		
		linkedList.add(1, "D");
		System.out.println(linkedList);
		
		// addFirst(��) : �� �տ� ��ü �߰�. LinkedList���� ���
		linkedList.addFirst("O");
		System.out.println(linkedList);	
		
		// removeLast(��) : �� �ڿ� ��� ���� �� ��ȯ. LinkedList���� ���
		System.out.println(linkedList.removeLast());
		System.out.println(linkedList);
	}
}
