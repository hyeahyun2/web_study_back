package javaPractice.ch_14;

public class LoadCar3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 car;
		FireEngine fe = new FireEngine();
		FireEngine fe2;
		
		fe.water();
		car = fe; // 자식타입 -> 부모타입 으로 형변환 (형변환 키워드(Car) 생략 가능)
		//car.water(); // water() : 자식클래스의 메서드
		fe2 = (FireEngine)car; // 부모타입 -> 자식타입 으로 형변환
		fe2.water();
//		System.out.println((FireEngine)car.water());
	}
}
