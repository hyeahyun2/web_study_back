package javaPractice.ch_11;
class Cars {
	static int wheel = 4;
	int speed;
}
public class LoadCars {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Cars.wheel);
//		System.out.println(Cars.speed);
		
		Cars myCar1 = new Cars();
		System.out.println(Cars.wheel);
		System.out.println(myCar1.speed);
		
		Cars myCar2 = new Cars();
		System.out.println("<���� ��>");
		System.out.println("myCar1.speed : " + myCar1.speed);
		System.out.println("myCar2.speed : " + myCar2.speed);
		System.out.println("myCar1.wheel : " + myCar1.wheel);
		System.out.println("myCar2.wheel : " + myCar2.wheel);

		myCar2.speed = 100;
		myCar2.wheel = 5;
		System.out.println("<���� ��>");
		System.out.println("myCar1.speed : " + myCar1.speed);
		System.out.println("myCar2.speed : " + myCar2.speed);
		System.out.println("myCar1.wheel : " + myCar1.wheel);
		System.out.println("myCar2.wheel : " + myCar2.wheel);
	}

}
