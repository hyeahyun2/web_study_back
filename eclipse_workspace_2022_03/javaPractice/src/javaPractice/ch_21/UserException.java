package javaPractice.ch_21;
class AgeException extends Exception {
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}
	public void printStackTrace() {
		System.out.println(getMessage());
		super.printStackTrace();
	}
}

public class UserException {
	public static void ticketing(int age) throws AgeException {
		if(age < 0) {
			throw new AgeException("���� �Է��� �߸��Ǿ����ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -19;
		try {
			ticketing(age);
		} catch(AgeException e) {
			e.printStackTrace();
		}
	}
}
