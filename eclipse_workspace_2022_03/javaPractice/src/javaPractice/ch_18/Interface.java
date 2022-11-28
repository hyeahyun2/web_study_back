package javaPractice.ch_18;
interface Player {
	void play();
	void stop();
}
class VideoPlayer implements Player {
	private int id; // 제조번호
	private static int count = 0; // 현재까지 할당된 제조번호
	public VideoPlayer() {
		id = ++count;
	}
	
	@Override
	public void play() {
		System.out.println("* 비디오 재생 시작!");
	}
	@Override
	public void stop() {
		System.out.println("* 비디오 재생 종료!");
	}
	
	public void printInfo() {
		System.out.println("이 기계의 제조번호는 [" + id + "]입니다.");
	}
}
class CDPlayer implements Player {
	@Override
	public void play() {
		System.out.println("- CD 재생 시작!");
	}
	@Override
	public void stop() {
		System.out.println("- CD 재생 종료!");
	}
	public void cleaning() {
		System.out.println("헤드를 청소했습니다.");
	}
}
interface Skinnable {
	// public static final 생략
	int BLACK = 0; // 검정
	int RED = 1; // 빨강
	int GREEN = 2; // 녹색
	int BLUE = 3; // 파랑
	int LEOPARD = 4; // 표범 무늬
	// public abstract 생략
	void changeSkin(int skin); // 스킨 변경
}
class PortablePlayer implements Player,Skinnable {
	private int skin = BLACK;
	
	public PortablePlayer() {} // 생성자
	@Override
	public void play() {
		System.out.println("= 재생 시작!");
	}
	@Override
	public void stop() {
		System.out.println("= 재생 종료!");
	}
	@Override
	public void changeSkin(int skin) {
		System.out.print("스킨을 ");
		switch(skin) {
		case BLACK:		System.out.print("검정"); break;
		case RED:		System.out.print("빨강"); break;
		case GREEN:		System.out.print("녹색"); break;
		case BLUE:		System.out.print("파랑"); break;
		case LEOPARD:	System.out.print("표범 무늬"); break;
		default:		System.out.print("기본값"); break;
		
		}
		System.out.println("(으)로 변경했습니다.");
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
		
		// PortablePlayer 색 관련
		PortablePlayer p = new PortablePlayer();
		p.play();
		p.stop();
		p.changeSkin(Skinnable.LEOPARD); // Skinnable.LEOPARD = 4
	}
}
