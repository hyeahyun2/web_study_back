package javaPractice.ch_11;
class Area {
	static void manual() {
		System.out.println("���� ��� ������ �Լ� ���");
		System.out.println("traiangle : �ﰢ�� ����");
		System.out.println("rectangle : �簢�� ����");
		System.out.println("�Դϴ�.");
	}
	double triangle(int a, int b) {
		return (double) a * b / 2;
	}
	int rectangle(int a, int b) {
		return a * b;
	}
}
public class LoadArea {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area.manual();
		
		Area cal = new Area();
		cal.manual();
		System.out.println(cal.triangle(3, 5));
		System.out.println(cal.rectangle(3, 4));
	}

}
