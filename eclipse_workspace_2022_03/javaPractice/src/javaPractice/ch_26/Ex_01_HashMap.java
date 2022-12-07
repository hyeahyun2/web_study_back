package javaPractice.ch_26;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// HashMap�� ���̵�(String)�� ����(Integer)�� ����Ǿ� ����
// ���� ����� ���� ��� ���� ����ϰ�, �ְ������� �ְ������� ���� ���̵� ����ϱ�
/* ���� ��� :
 * ��� ���� : 91
 * �ְ� ���� : 96
 * �ְ� ������ ���� ���̵� : blue
 * */
public class Ex_01_HashMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; // �ְ� ������ ���� ���̵� ����
		int maxScore = 0; // �ְ� ���� ����
		int totalScore = 0; // ���� �հ� ����
		
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			if(maxScore < value) { 
				maxScore = value; // �ְ� ����
				name += (key + " "); // �ְ� ���� ���� ���̵�
			} 
			totalScore += value; // ���� �հ�
		}
		
		System.out.println("��� ���� : " + totalScore/map.size()); // ���
		System.out.println("�ְ� ���� : " + maxScore);
		System.out.println("�ְ� ������ ���� ���̵� : " + name);
		
	}

}
