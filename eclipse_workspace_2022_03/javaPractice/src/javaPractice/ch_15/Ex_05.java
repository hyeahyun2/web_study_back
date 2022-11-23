package javaPractice.ch_15;
class Score {
	private int kor;
	private int math;
	private int eng;
	private int com;
//	Score(){}
	Score(int kor, int math, int eng, int com){
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.com = com;
	}
	public void setKor(int kor) {
		if(kor > 100 || kor < 0) {
			System.out.println("점수는 0에서 100까지 입력 가능합니다");
		}
		else {
			this.kor = kor;
		}
	}
	public void display() {
		System.out.println("kor : " + kor + ", math : " + math + 
				", eng : " + eng + ", com : " + com);
	}
}
public class Ex_05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Score score = new Score();
//		score.setKor(-500);
		Score score = new Score(100, 80, 95, 84);
		score.display();
	}
}
