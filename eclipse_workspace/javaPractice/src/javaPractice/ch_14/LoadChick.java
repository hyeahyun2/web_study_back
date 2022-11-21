package javaPractice.ch_14;

public class LoadChick {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneralChick generalChick = new GeneralChick();
		generalChick.display();
		
		RedChick redChick = new RedChick();
		redChick.display();
		System.out.println(redChick.x); // 100
	}

}
