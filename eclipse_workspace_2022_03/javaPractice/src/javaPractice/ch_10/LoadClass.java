package javaPractice.ch_10;

public class LoadClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar;// 클래스의 객체를 참조할 수 있는 참조변수 선언
		// 데이터 타입 : Car
		// new 클래스명() : 클래스의 객체를 생성
		mycar = new Car(); // 참조변수에 생성한 객체의 주소를 저장
		
		System.out.println("시동 처음 초기화 : " + mycar.powerOn);
		System.out.println("시동 색상 초기화 : " + mycar.color);
		System.out.println("바퀴의 수 초기화 : " + mycar.wheel);
		System.out.println("속력 초기화 : " + mycar.speed);
		System.out.println("와이퍼 작동 초기화 : " + mycar.wiperOn);
		
		mycar.power(); // 시동 메서드 실행
		System.out.println("시동 메서드 동작 : " + mycar.powerOn);
		mycar.power(); // 시동 메서드 실행
		System.out.println("시동 메서드 재동작 : " + mycar.powerOn);
		
		mycar.color = "black";
		System.out.println("현재 차의 색상" + mycar.color);
	}
}
