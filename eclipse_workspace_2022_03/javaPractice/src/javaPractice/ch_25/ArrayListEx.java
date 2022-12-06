package javaPractice.ch_25;

import java.util.ArrayList;
import java.util.List;

/* String ��ü�� �����ϴ� ArrayList */
public class ArrayListEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		// String ��ü ����
		list.add("java");
		list.add("JDBC");
		list.add("Serverlet/JSP");
		list.add(2, "DataBase");
		list.add("iBATIS");
		
		int size = list.size(); // ����� �� ��ü�� ���
		System.out.println("�� ��ü��: " + size); // 5
		
		String skill = list.get(2); // 2�� �ε����� ����� ��ü ���
		System.out.println("2: " + skill);
		System.out.println();
		
		// ����� ��ü ���
		for(int i=0; i<list.size(); i++) { // ����� ������ŭ �ݺ�
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		
		System.out.println();
		for(String str : list) { // foreach�ε� ��°���
			System.out.println(str);
		}
		System.out.println();
		
		list.remove(2); // 2�� �ε��� DataBase ����
		list.remove(2); // 2�� �ε��� Serverlet/JSP ����
		list.remove("iBATIS");
		
		for(int i=0; i<list.size(); i++) { // ����� ������ŭ �ݺ�
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
	}

}
