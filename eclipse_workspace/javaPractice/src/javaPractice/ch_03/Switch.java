package javaPractice.ch_03;

public class Switch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 일년 동안 읽은 책 수에 따라 멘트를 출력
		int book = 15;
		book /= 10;
		switch(book) {
		case 0: // 0~9권
			System.out.println("조금 더 노력하세요!");
			break;
		case 1: // 10~19권
			System.out.println("책 읽은 것을 즐기시는 분이시네요!");
			break;
		case 2: // 20~29권
			System.out.println("책을 사랑하는 분이시네요!");
			break;
		default: // 30권 이상
			System.out.println("당신은 다독왕입니다!");
		
		}
	}
}
