package javaPractice.ch_15;

public class LoadPet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet kurt;
		kurt = new Pet("Kurt", "아이");
		kurt.introduce();
		System.out.println();
		
		RobotPet r2d2 = new RobotPet("R2D2", "루크");
		r2d2.introduce();
		r2d2.work(0);
		System.out.println();
		
		Pet toy = new RobotPet("toy", "아이2");
		toy.introduce();
		//toy.work(0); // 실행불가 (RobotPet 메소드이기 때문)
		System.out.println();
		
		Pet p = r2d2;
		p.introduce();
		System.out.println();

		r2d2.setName("아이로봇");
		r2d2.introduce();
		p.introduce();
	}
}
