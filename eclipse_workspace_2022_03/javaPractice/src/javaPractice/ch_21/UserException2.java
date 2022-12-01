package javaPractice.ch_21;
class IDFormatException extends Exception {
	public IDFormatException(String message) {
		super(message);
	}
}

public class UserException2 {
	private String userID;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
		this.userID = userID;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserException2 test = new UserException2();
		String userID = null;
		try {
			test.setUserID(userID);
		} catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(test.getUserID());
		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(test.getUserID());
	}

}
