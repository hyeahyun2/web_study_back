package javaPractice.ch_25;

import java.util.ArrayList;

/* ArrayList : �迭���� ������ ����
 * ��Ҹ� �߰��ϸ� 0�� �ε������� ���ʴ�� ����
 * �޼��带 ����� ���ϴ� ��ġ�� ��Ҹ� �߰��ϰų�, ����, ��ȯ �� �� ����
 * */
public class ArrayListEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ÿ���� �������� ���� ����. �ʱ� capa ���� ������ ���� ����
		ArrayList list1 = new ArrayList(10); 
		list1.add("A");
		list1.add("C");
		list1.add("E");
		list1.add("D");
		
		System.out.print("�ʱ���� : ");
		System.out.println(list1);
		
		System.out.print("�ε��� 1 ��ġ�� B �߰� : ");
		list1.add(1, "B");
		System.out.println(list1);
		
		System.out.print("�ε��� 2 ��ü�� �� ���� : ");
		list1.remove(2);
		System.out.println(list1);
		
		System.out.println("�ε��� 2�� ��ġ�� �� ��ȯ : " + list1.get(2));
	}

}
