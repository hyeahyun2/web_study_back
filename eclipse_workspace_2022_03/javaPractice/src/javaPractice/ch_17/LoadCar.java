package javaPractice.ch_17;
import java.util.ArrayList;
abstract class Car {
	private String name;
	
	Car(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	abstract void start();
	abstract void drive();
	abstract void stop();
	abstract void turnOff();
	
	public void run() {
		start();
		drive();
		stop();
		turnOff();
		System.out.println("세차를 합니다.");
	}
}
class Sonata extends Car {
	Sonata() {
		super("Sonata");
	}
	void start() {
		System.out.println(getName() + " 시동을 켭니다.");
	}
	void drive() {
		System.out.println(getName() + " 달립니다.");
	}
	void stop() {
		System.out.println(getName() + " 멈춥니다.");
	}
	void turnOff() {
		System.out.println(getName() + " 시동을 끕니다.");
	}
}
class Grandeur extends Car {
	Grandeur() {
		super("Grandeur");
	}
	void start() {
		System.out.println(getName() + " 시동을 켭니다.");
	}
	void drive() {
		System.out.println(getName() + " 달립니다.");
	}
	void stop() {
		System.out.println(getName() + " 멈춥니다.");
	}
	void turnOff() {
		System.out.println(getName() + " 시동을 끕니다.");
	}
}
class Avante extends Car {
	Avante() {
		super("Avante");
	}
	void start() {
		System.out.println(getName() + " 시동을 켭니다.");
	}
	void drive() {
		System.out.println(getName() + " 달립니다.");
	}
	void stop() {
		System.out.println(getName() + " 멈춥니다.");
	}
	void turnOff() {
		System.out.println(getName() + " 시동을 끕니다.");
	}
}
class Genesis extends Car {
	Genesis() {
		super("Genesis");
	}
	void start() {
		System.out.println(getName() + " 시동을 켭니다.");
	}
	void drive() {
		System.out.println(getName() + " 달립니다.");
	}
	void stop() {
		System.out.println(getName() + " 멈춥니다.");
	}
	void turnOff() {
		System.out.println(getName() + " 시동을 끕니다.");
	}
}

public class LoadCar {
	public static void main(String[] args) {
		// TArrayList<E>generated method stub
		ArrayList<Car> carList = new ArrayList<Car>();
		
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		
		for(Car car : carList) {
			car.run();
			System.out.println("==================");
		}
	}
}
