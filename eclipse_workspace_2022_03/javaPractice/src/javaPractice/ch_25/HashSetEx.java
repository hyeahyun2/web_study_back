package javaPractice.ch_25;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		
		// �ߺ��� ���ڿ��� ���ŵǰ� ��� ������ �Է� ������ ��� ����
		System.out.println(hashSet);
	}
}