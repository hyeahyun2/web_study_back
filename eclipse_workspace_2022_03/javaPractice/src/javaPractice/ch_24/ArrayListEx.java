package javaPractice.ch_24;

import java.util.ArrayList;

/* ������ ���׸��� ������ ���� �迭�� ArrayList�� Ÿ�� �μ����� ����غ���
 * �ٸ� �ڷ����� ������ ���ڿ��� ���������� �� Object�� �ļ��̹Ƿ� ���忡�� ���� ����.
 * ������ ��Ҹ� �������� ������ ĳ������ �ؾ� ��.
 * */
public class ArrayListEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arNum = new ArrayList();
		arNum.add(1);
		arNum.add("���ڿ�");
		int value = (int)arNum.get(0);
//		int temp = (int)arNum.get(1);
		System.out.println(value);
	}

}
