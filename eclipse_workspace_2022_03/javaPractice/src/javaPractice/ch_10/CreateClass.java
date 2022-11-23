package javaPractice.ch_10;

class Car {
	boolean powerOn;
	String color;
	int wheel;
	int speed;
	boolean wiperOn;
	
	void power() {
		powerOn = !powerOn;
	}
	void speedUp() {
		speed++;
	}
	void speedDown() {
		speed--;
	}
	void wiper() {
		wiperOn = !wiperOn;
	}
}

public class CreateClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
