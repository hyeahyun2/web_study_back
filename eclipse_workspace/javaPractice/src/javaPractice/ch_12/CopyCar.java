package javaPractice.ch_12;

public class CopyCar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car(car1);
		
		System.out.println("car1의 color : " + car1.color +
				", gearType : "+ car1.gearType +
				", door : " + car1.door);
		System.out.println("car2의 color : " + car2.color +
				", gearType : "+ car2.gearType +
				", door : " + car2.door);
		
		car1.door = 100;
		System.out.println("car1의 color : " + car1.color +
				", gearType : "+ car1.gearType +
				", door : " + car1.door);
		System.out.println("car2의 color : " + car2.color +
				", gearType : "+ car2.gearType +
				", door : " + car2.door);
	}

}
