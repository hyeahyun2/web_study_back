package javaPractice.ch_13_Account;

public class Account {
	private String ano; // °èÁÂ¹øÈ£
	private String owner; // °èÁÂÁÖ
	private int balance; // ÀÜ¾×
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAno() {
		return ano;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance += balance;
	}
}
