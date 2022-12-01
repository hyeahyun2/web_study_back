package javaPractice.ch_21;

import java.io.PrintStream;

/* ����� ���� ���� ����� */
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
			throw new MakeMyException("������ ������ �� �� �����ϴ�.");
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
