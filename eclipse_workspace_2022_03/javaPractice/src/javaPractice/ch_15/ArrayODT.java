package javaPractice.ch_15;

public class ArrayODT {
	static void intro(Pet p) {
		p.introduce();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet[] a = {
				new Pet("Kurt", "����"),
				new RobotPet("R2D2", "��ũ"),
				new Pet("����Ŭ", "����")
		};
		for(Pet p : a) {
			intro(p);
			System.out.println();
		}
	}

}
