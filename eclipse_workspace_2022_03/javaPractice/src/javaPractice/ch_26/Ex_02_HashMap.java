package javaPractice.ch_26;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ex_02_HashMap {
	/* ���̵�� ��й�ȣ �˻��ϱ�
	 * ���̵� ����� �Է��� �޾Ƽ� map�� ����� ���� ��
	 * 1) ������ ���̵� ����� �ִ� ��� -> "�α��εǾ����ϴ�."
	 * 2) ������ ���̵�� �ִµ� ����� Ʋ�� ��� -> "��й�ȣ�� ��ġ���� �ʽ��ϴ�."
	 * 3) ������ ���̵� ���� ��� -> "�Է��Ͻ� ���̵� �������� �ʽ��ϴ�."
	 * */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		// ���̵�� ��й�ȣ�� �̸� ����
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��� �ּ���.");
			System.out.print("���̵� : ");
			String id = scanner.nextLine();
			System.out.print("��й�ȣ : ");
			String pw = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id) && map.containsValue(pw)) {
				System.out.println("�α��εǾ����ϴ�.");
				break;
			}
			else if(map.containsKey(id)) {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
			else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
			System.out.println();
		}
	}

}
