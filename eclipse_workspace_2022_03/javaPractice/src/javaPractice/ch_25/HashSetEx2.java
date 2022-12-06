package javaPractice.ch_25;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx2 {
	public static void main(String[] args) {
		/* String ��ü�� �ߺ� ���� �����ϴ� HashSet */
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // Java�� �� ���� �����
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("�� ��ü��: " + size);
		
		System.out.println("forEach ������ ��� ����");
		for(String s : set) {
			System.out.println("\t" + s);
		}
		System.out.println();
		
		Iterator<String> iterator = set.iterator(); // �ݺ��� ���
		while(iterator.hasNext()) { // ��ü ����ŭ ����
			String element = iterator.next(); // 1���� ��ü�� ���� ��
			System.out.println("\t" + element);
		}
		System.out.println();
		
		set.remove("JDBC"); // 1���� ��ü ����
		set.remove("iBATIS"); // 1���� ��ü ����
		
		System.out.println("�� ��ü��: " + set.size());
		
		System.out.println("forEach ������ ��� ����");
		for(String s : set) {
			System.out.println("\t" + s);
		}
		System.out.println();
		
		set.clear(); // ��� ��ü�� �����ϰ� ���.
		if(set.isEmpty()) {
			System.out.println("��� ����");
		}
	}

}
