package javaPractice.ch_28;

import java.text.SimpleDateFormat;
import java.util.Date;

/* Date�� SimpleDateFormat Ŭ������ �̿��ؼ�
 * ���� ��¥�� ����ϴ� ���α׷� �ۼ�
 * 
 * ���� ��� :
 * 0000�� 00�� 00�� 0���� 00�� 00��
 * */
public class Ex_02 {
	public static void main(String[] args) {
		Date day = new Date();
		
		String formatType = "yyyy�� MM�� dd�� E���� HH�� mm��";
		
		SimpleDateFormat sdf = new SimpleDateFormat(formatType);
		System.out.println(sdf.format(day));
	}
}
