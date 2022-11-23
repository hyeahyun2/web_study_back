package javaPractice.ch_12;

public class LoadCar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car("blue");
		
		System.out.println("car1ÀÇ color : " + car1.color +
				", gearType : "+ car1.gearType +
				", door : " + car1.door);
		System.out.println("car2ÀÇ color : " + car2.color +
				", gearType : "+ car2.gearType +
				", door : " + car2.door);
	}
}
