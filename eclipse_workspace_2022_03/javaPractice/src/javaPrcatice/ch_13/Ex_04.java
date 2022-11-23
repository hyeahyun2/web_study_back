package javaPrcatice.ch_13;
class Account {
	private int balance;
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int money) {
		if(money >= MIN_BALANCE && money <= MAX_BALANCE) {
			this.balance = money;
		}
	}
}
public class Ex_04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("ÇöÀç ÀÜ°í : " + account.getBalance());

		account.setBalance(-100);
		System.out.println("ÇöÀç ÀÜ°í : " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("ÇöÀç ÀÜ°í : " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("ÇöÀç ÀÜ°í : " + account.getBalance());
	}

}
