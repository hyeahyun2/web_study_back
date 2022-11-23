package javaPractice.ch_11;
class Bank {
	String name; // °èÁ¤ ¸íÀÇ
	String userNum; // °èÁÂ¹øÈ£
	long balance; // ¿¹±İÀÜ°í
	void outputB(long money) {
		balance -= money;
	}
	void inputB(long money) {
		balance += money;
	}
}
public class LoadBank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank chulsoo = new Bank();
		chulsoo.name = "Ã¶¼ö";
		chulsoo.userNum = "123456";
		chulsoo.balance = 1000;
		
		Bank younghee = new Bank();
		younghee.name = "¿µÈñ";
		younghee.userNum = "654321";
		younghee.balance = 200;
		
		chulsoo.outputB(200);
		younghee.inputB(100);
		
		System.out.println("* Ã¶¼öÀÇ °èÁÂ");
		System.out.println("   °èÁÂ¸íÀÇ : " + chulsoo.name);
		System.out.println("   °èÁÂ¹øÈ£ : " + chulsoo.userNum);
		System.out.println("   °èÁÂÀÜ°í : " + chulsoo.balance);
		
		System.out.println("* ¿µÈñÀÇ °èÁÂ");
		System.out.println("   °èÁÂ¸íÀÇ : " + younghee.name);
		System.out.println("   °èÁÂ¹øÈ£ : " + younghee.userNum);
		System.out.println("   °èÁÂÀÜ°í : " + younghee.balance);
	}

}
