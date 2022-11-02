package javaPractice.ch_03;

public class Switch2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String medal = "Silver";
		
		switch(medal) {
		case "Gold":
			System.out.println("금메달 입니다.");
			break;
		case "Silver":
			System.out.println("은메달 입니다.");
			break;
		case "Bronze":
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
	}
}
