package javaPractice.ch_12;

public class Car {
	String color; // 색상
	String gearType; // 변속기 종류 - auto(자동), manual(수동)
	int door; // 문의 개수
	
	Car(){
		this("white", "auto", 4);
	}
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	Car(String color){
		this(color, "auto", 4);
	}
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
