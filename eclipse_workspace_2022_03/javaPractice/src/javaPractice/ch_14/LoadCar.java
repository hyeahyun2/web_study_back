package javaPractice.ch_14;
class Car {
	String maker; // 제조사
	String model; // 모델명
	String color; // 색상
	int carSpeed; // 현재 속도
	Car(){}
	Car(String maker, String model, String color, int carSpeed){
		this.maker = maker;
		this.model = model;
		this.color = color;
		this.carSpeed = carSpeed;
	}
	void speedUp() { this.carSpeed += 5; }
	void speedDown() { this.carSpeed -= 5; }
}
class SportCar extends Car {
	SportCar(){ super(); }
	SportCar(String maker, String model, String color, int carSpeed){
		super(maker, model, color, carSpeed);
	}
	void speedUp() { this.carSpeed += 10; }
	void speedDown() { this.carSpeed -= 10; }
	
}
public class LoadCar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("maker1", "model1", "white", 80);
		Car car2 = new Car("maker2", "model2", "blick", 50);
		Car car3 = new Car("maker3", "model3", "red", 60);
		
		SportCar sCar = new SportCar("maker4", "model4", "green", 100);
		sCar.speedUp();
		System.out.println(sCar.carSpeed);
	}

}
