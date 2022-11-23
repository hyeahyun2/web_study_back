package javaPractice.ch_15;
class Robot {}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("���� ��ϴ�.");
	}
}
class SingRobot extends Robot {
	void sing() {
		System.out.println("�뷡�� �մϴ�.");
	}
}
class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}

public class Ex_08_Robot {
	public static void action(Robot r) {
		if(r instanceof DanceRobot) {
			((DanceRobot)r).dance();
		}
		else if(r instanceof SingRobot) {
			((SingRobot)r).sing();
		}
		else if(r instanceof DrawRobot){
			((DrawRobot)r).draw();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "aca";
		a = a.replace("a", "b");
		System.out.println(a);
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i=0; i<arr.length; i++) {
			action(arr[i]);
		}
	}

}
