package javaPractice.ch_03;

public class Switch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ϳ� ���� ���� å ���� ���� ��Ʈ�� ���
		int book = 15;
		book /= 10;
		switch(book) {
		case 0: // 0~9��
			System.out.println("���� �� ����ϼ���!");
			break;
		case 1: // 10~19��
			System.out.println("å ���� ���� ���ô� ���̽ó׿�!");
			break;
		case 2: // 20~29��
			System.out.println("å�� ����ϴ� ���̽ó׿�!");
			break;
		default: // 30�� �̻�
			System.out.println("����� �ٵ����Դϴ�!");
		
		}
	}
}
