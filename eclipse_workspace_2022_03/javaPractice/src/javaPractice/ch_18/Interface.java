package javaPractice.ch_18;
interface Player {
	void play();
	void stop();
}
class VideoPlayer implements Player {
	private int id; // ������ȣ
	private static int count = 0; // ������� �Ҵ�� ������ȣ
	public VideoPlayer() {
		id = ++count;
	}
	
	@Override
	public void play() {
		System.out.println("* ���� ��� ����!");
	}
	@Override
	public void stop() {
		System.out.println("* ���� ��� ����!");
	}
	
	public void printInfo() {
		System.out.println("�� ����� ������ȣ�� [" + id + "]�Դϴ�.");
	}
}
class CDPlayer implements Player {
	@Override
	public void play() {
		System.out.println("- CD ��� ����!");
	}
	@Override
	public void stop() {
		System.out.println("- CD ��� ����!");
	}
	public void cleaning() {
		System.out.println("��带 û���߽��ϴ�.");
	}
}
interface Skinnable {
	// public static final ����
	int BLACK = 0; // ����
	int RED = 1; // ����
	int GREEN = 2; // ���
	int BLUE = 3; // �Ķ�
	int LEOPARD = 4; // ǥ�� ����
	// public abstract ����
	void changeSkin(int skin); // ��Ų ����
}
class PortablePlayer implements Player,Skinnable {
	private int skin = BLACK;
	
	public PortablePlayer() {} // ������
	@Override
	public void play() {
		System.out.println("= ��� ����!");
	}
	@Override
	public void stop() {
		System.out.println("= ��� ����!");
	}
	@Override
	public void changeSkin(int skin) {
		System.out.print("��Ų�� ");
		switch(skin) {
		case BLACK:		System.out.print("����"); break;
		case RED:		System.out.print("����"); break;
		case GREEN:		System.out.print("���"); break;
		case BLUE:		System.out.print("�Ķ�"); break;
		case LEOPARD:	System.out.print("ǥ�� ����"); break;
		default:		System.out.print("�⺻��"); break;
		
		}
		System.out.println("(��)�� �����߽��ϴ�.");
	}
}

public class Interface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player[] a = new Player[2];
		a[0] = new VideoPlayer(); // 1
		a[1] = new CDPlayer();
		
		for(Player p : a) {
			p.play();
			p.stop();
			System.out.println();
		}
		
		VideoPlayer[] b = new VideoPlayer[4]; // 2, 3, 4, 5
		for(int i=0; i<b.length; i++) {
			b[i] = new VideoPlayer();
		}
		b[b.length-1].printInfo(); // 5
		System.out.println();
		
		// PortablePlayer �� ����
		PortablePlayer p = new PortablePlayer();
		p.play();
		p.stop();
		p.changeSkin(Skinnable.LEOPARD); // Skinnable.LEOPARD = 4
	}
}
