package javaPractice.ch_14;
public class Chick {
	int x;
	int y;
	
	Chick(){
		x = 100;
		y = 100;
	}
	void display() {System.out.println("���Ƹ�");}
	void walk() {System.out.println("�ȴ�");}
	void ppick() {System.out.println("���");}
}
class GeneralChick extends Chick {
	
}
class RedChick extends Chick {}
