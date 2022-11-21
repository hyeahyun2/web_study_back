package javaPractice.ch_14;
class Car2 {
	int wheel;
	int speed;
	String color;
	Car2(String color){
		this.color = color;
	}
}
class SportCar2 extends Car2 {
	int speedLimit;
	SportCar2(String color, int speedLimit){
		super(color);
		this.speedLimit = speedLimit;
	}
}

public class LoadCar2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportCar2 car1 = new SportCar2("red", 100);
		System.out.println(car1.color);
		System.out.println(car1.speedLimit);
	}

}
