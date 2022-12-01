package javaPractice.ch_21;

import java.io.PrintStream;

/* 사용자 정의 예외 만들기 */
class MakeMyException extends Exception {
	public MakeMyException() {}
	public MakeMyException(String message) {
		super(message);
	}
}

class MyScore {
	private int score;
	public void setScore(int s) throws MakeMyException {
		if(s < 0) {
			throw new MakeMyException("점수는 음수가 될 수 없습니다.");
		}
		else {
			this.score = s;
		}
	}
}
public class MyException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyScore obj = new MyScore();
		try {
			obj.setScore(-10);
		} catch(MakeMyException e) {
			System.out.println(e.getMessage());
		}
	}
}
