package javaPractice.ch_12;
class Rocket {
	int x;
	int y;
	Rocket(int x, int y){
		this.x = x;
		this.y = y;
	}
	String printInfo() {
		return "x: " + x + ", y: " + y;
	}
	void moveUp() {
		y++;
	}
}
public class Ex_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 로켓을 나타내는 Rocket 클래스 작성
		 * Rocket 클래스의 필드와 메서드
		 * # 필드
		 * x, y : 현재 로켓의 위치
		 * # 메서드
		 * Rocket(x, y) : 현재 로켓의 위치
		 * printInfo() : 로켓 정보를 문자열로 변환하는 메서드
		 * moveUp() : 로켓의 y좌표가 1만큼 증가
		 * */
		Rocket rocket = new Rocket(10,20);
		System.out.println(rocket.printInfo()); // x: 10, y: 20
		rocket.moveUp();
		rocket.moveUp();
		System.out.println(rocket.printInfo()); // x: 10, y: 22
	}

}
