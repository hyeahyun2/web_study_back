package javaPractice.ch_25;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompareInt implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2) * -1; // Integer Ŭ������ compareTo() �޼��带 �ݴ��
	}
}

public class TreeSetEx2 {
	public static void main(String[] args) {
		TreeSet<Integer> score = new TreeSet<Integer>(new MyCompareInt());
		
		score.add(90);
		score.add(100);
		score.add(85);
		score.add(65);
		score.add(50);
		score.add(75);
		score.add(90);
		
		System.out.println(score);
		
		Integer value = null;
		value = score.first(); // ���� ���� ��
		System.out.println("���� ���� ���� : " + value);
		value = score.last(); // ���� ū ��
		System.out.println("���� ���� ���� : " + value);
		value = score.lower(85); // ������ ������ ���� �� �� ���� ū �� (���ڰ� ������)
		System.out.println("85 �ٷ� ���� ���� : " + value);
		value = score.higher(85); // ������ ������ ū �� �� ���� �� �� (���ڰ� ������)
		System.out.println("85 �ٷ� ���� ���� : " + value);
		value = score.floor(85); // ������ ���� ���ų� ���� �� �� ���� ū �� (���ڰ� ����)
		System.out.println("85 �Ǵ� �ٷ� ���� ���� : " + value);
		value = score.ceiling(85); // ������ ���� ���ų� ū �� �� ���� ���� �� (���ڰ� ����)
		System.out.println("85 �Ǵ� �ٷ� ���� ���� : " + value);
		System.out.println();
		
		while(!score.isEmpty()) {
			value = score.pollLast(); // ���� ū ���� ��ȯ �� ����
			System.out.println("���� ���� ���� ���� : " + value);
		}
	}
}
