package javaPractice.ch_14;
public class Chick {
	int x;
	int y;
	
	Chick(){
		x = 100;
		y = 100;
	}
	void display() {System.out.println("º´¾Æ¸®");}
	void walk() {System.out.println("°È´Ù");}
	void ppick() {System.out.println("»à»à");}
}
class GeneralChick extends Chick {
	
}
class RedChick extends Chick {}
