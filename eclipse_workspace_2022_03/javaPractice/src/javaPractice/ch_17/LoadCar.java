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
		System.out.println("������ �մϴ�.");
	}
}
class Sonata extends Car {
	Sonata() {
		super("Sonata");
	}
	void start() {
		System.out.println(getName() + " �õ��� �մϴ�.");
	}
	void drive() {
		System.out.println(getName() + " �޸��ϴ�.");
	}
	void stop() {
		System.out.println(getName() + " ����ϴ�.");
	}
	void turnOff() {
		System.out.println(getName() + " �õ��� ���ϴ�.");
	}
}
class Grandeur extends Car {
	Grandeur() {
		super("Grandeur");
	}
	void start() {
		System.out.println(getName() + " �õ��� �մϴ�.");
	}
	void drive() {
		System.out.println(getName() + " �޸��ϴ�.");
	}
	void stop() {
		System.out.println(getName() + " ����ϴ�.");
	}
	void turnOff() {
		System.out.println(getName() + " �õ��� ���ϴ�.");
	}
}
class Avante extends Car {
	Avante() {
		super("Avante");
	}
	void start() {
		System.out.println(getName() + " �õ��� �մϴ�.");
	}
	void drive() {
		System.out.println(getName() + " �޸��ϴ�.");
	}
	void stop() {
		System.out.println(getName() + " ����ϴ�.");
	}
	void turnOff() {
		System.out.println(getName() + " �õ��� ���ϴ�.");
	}
}
class Genesis extends Car {
	Genesis() {
		super("Genesis");
	}
	void start() {
		System.out.println(getName() + " �õ��� �մϴ�.");
	}
	void drive() {
		System.out.println(getName() + " �޸��ϴ�.");
	}
	void stop() {
		System.out.println(getName() + " ����ϴ�.");
	}
	void turnOff() {
		System.out.println(getName() + " �õ��� ���ϴ�.");
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
