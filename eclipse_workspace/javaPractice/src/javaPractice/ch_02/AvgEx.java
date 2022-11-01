package javaPractice.ch_02;

public class AvgEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte kor, math, eng;
		kor = 55;
		math = 99;
		eng = 87;
		
		int sum = kor + math + eng;
		System.out.println("ÃÑÁ¡ : " + sum);
		
		int avg_01 = sum / 3;
		System.out.println("Æò±Õ1 : " + avg_01);
		
		double avg_02 = sum / 3; // Á¤¼ö·Î °è»ê(80) ÀÌÈÄ ½Ç¼ö·Î Çüº¯È¯ (80.0)
		System.out.println("Æò±Õ2 : " + avg_02);
		
		double avg_03 = (double)sum / 3;
		System.out.println("Æò±Õ3 : " + avg_03);
		
		double avg_04 = sum / 3.0;
		System.out.println("Æò±Õ4 : " + avg_04);
		
		double avg_05 = (double)sum / 3.0;
		System.out.println("Æò±Õ5 : " + avg_05);
	}
}
