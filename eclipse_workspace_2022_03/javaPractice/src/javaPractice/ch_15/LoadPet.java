package javaPractice.ch_15;

public class LoadPet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet kurt;
		kurt = new Pet("Kurt", "����");
		kurt.introduce();
		System.out.println();
		
		RobotPet r2d2 = new RobotPet("R2D2", "��ũ");
		r2d2.introduce();
		r2d2.work(0);
		System.out.println();
		
		Pet toy = new RobotPet("toy", "����2");
		toy.introduce();
		//toy.work(0); // ����Ұ� (RobotPet �޼ҵ��̱� ����)
		System.out.println();
		
		Pet p = r2d2;
		p.introduce();
		System.out.println();

		r2d2.setName("���̷κ�");
		r2d2.introduce();
		p.introduce();
	}
}
