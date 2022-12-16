package javaPractice.ch_28;

import java.time.LocalDate;

public class JavaTimeLocalDate2 {
	public static void main(String[] args) {
		// 1900����� 2100����� ������ ��������, ������� �˾ƺ��� �ڵ�
		LocalDate localDate = LocalDate.now();
		LocalDate localDate2;
		int count = 0;
		
		for(int i = 1900; i<2100; i++) {
			localDate2 = localDate.withYear(i);
			if(localDate2.isLeapYear()) { // isLeapYear() : �����̸� true ��ȯ
				System.out.println(localDate2.getYear() + "�� �����Դϴ�.");
				count++;
			}
		}
		System.out.println("1900����� 2100����� ������ �� " + count + "�� �ֽ��ϴ�.");
	}
}
