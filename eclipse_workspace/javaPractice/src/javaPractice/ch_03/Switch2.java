package javaPractice.ch_03;

public class Switch2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String medal = "Silver";
		
		switch(medal) {
		case "Gold":
			System.out.println("�ݸ޴� �Դϴ�.");
			break;
		case "Silver":
			System.out.println("���޴� �Դϴ�.");
			break;
		case "Bronze":
			System.out.println("���޴� �Դϴ�.");
			break;
		default:
			System.out.println("�޴��� �����ϴ�.");
			break;
		}
	}
}