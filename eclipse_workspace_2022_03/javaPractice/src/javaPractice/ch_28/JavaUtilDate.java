package javaPractice.ch_28;

import java.util.Date;

public class JavaUtilDate {
	/* java.util.Date */
	public static void main(String[] args) {
		Date today = new Date(); // �⺻ �����ڷ� Date �ν��Ͻ��� ����� ���
		System.out.println(today);
		
		long a = System.currentTimeMillis();
		Date today2 = new Date(a); // long Ÿ���� �Ķ���ͷ� �޾Ƽ� �ν��Ͻ� ���� �� ���
		System.out.println(today2);
	}
}
