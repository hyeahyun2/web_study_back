package javaPractice.ch_15;

public class ArrayODT {
	static void intro(Pet p) {
		p.introduce();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet[] a = {
				new Pet("Kurt", "아이"),
				new RobotPet("R2D2", "루크"),
				new Pet("마이클", "영진")
		};
		for(Pet p : a) {
			intro(p);
			System.out.println();
		}
	}

}
