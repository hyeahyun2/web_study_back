package javaPractice.ch_24;

import java.util.ArrayList;

/* Ÿ�� ����ġ�� ���� ĳ������ ����� �߸��� ĳ�������� ���� ������ �����ϱ� ����
 * �ڹ�5���� ������ ������ ���׸�.
 * ���׸��� Ŭ������ �μ�ȭ�Ͽ� ������ Ÿ�Կ� ���� �����ϴ� �Ϲ����� �˰����� ����.
 * 
 * �����Ϸ��� �ڷ����� ���׸����� ������ �ڷ����� �ƴϸ� ������ ������ ��.
 * ������ �߿� �Ǽ��� �̸� �� �� �֤����� ���� �߿��� �����̸� �ڵ��� ������ �� ���꼺 �⼧�� ū �⿩.
 * 
 * * ���׸��� ����
 * 1. ������ �� Ÿ���� üũ�� �� �ִ�.
 * 2. ĳ������ �ʿ䰡 ���� ���Ǽ��� �������� ���ȴ�.
 * */
public class ArrayListGenerics {
	public static void main(String[] args) {
		ArrayList<Integer> arNum = new ArrayList<Integer>();
		arNum.add(1);
//		arNum.add("���ڿ�"); // ������ ���� ���� -> ������
		int value = arNum.get(0);
		System.out.println(value);
	}

}
