package javaPractice.ch_14;
public class Car3 {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	void stop() {
		System.out.println("stop!!!!");
	}
}

class FireEngine extends Car3 { // �ҹ���
	void water() {
		System.out.println("water!!!!");
	}
}