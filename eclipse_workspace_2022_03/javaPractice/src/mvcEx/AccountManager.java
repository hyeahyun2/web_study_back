package mvcEx;

import java.util.ArrayList;
import java.util.Scanner;

// toString 수정, 여러번 쓰이는 로직 메소드or변수로 묶어버리기
public class AccountManager {
	private ArrayList<Account> list;
	private Scanner stdIn;
	
	private final String ERROR_NOT_FIND_ID = "해당 계좌번호가 존재하지 않습니다.";
	private final String INFO_LIST = "계좌번호\t성명\t잔액";
	
	public AccountManager() {
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
	}
	
	private Account existID(int id) { // 동일한 계좌 유무 검색
		for(Account account : list) {
			if(account.getId() == id) {
				return account;
			}
		}
		return null;
	}
	
	private Account findAccount(int id) { // 동일 계좌 찾기
		Account account = existID(id);
		if(account == null) { // 동일 계좌가 존재하지 않을 때 에러 메세지 출력
			System.out.println(ERROR_NOT_FIND_ID);
		}
		return account;
	}
	
	public void makeAccount() { // 계좌 개설
		Account account = new Account();
		
		System.out.print("계좌 번호 : ");
		int id = stdIn.nextInt();
		if(existID(id) != null) { // 계좌 중복 검사
			System.out.println("중복된 계좌가 존재합니다.");
			makeAccount();
			return;
		}
		account.setId(id);

		System.out.print("이름 : ");
		account.setName(stdIn.next());
		
		System.out.print("입금액 : ");
		account.setBalance(stdIn.nextLong());
		
		list.add(account);
		
		System.out.println("계좌가 개설되었습니다.");
		System.out.println(list.toString() + "\t");
	}
	
	public void deposit() { // 입금
		System.out.print("계좌번호 : ");
		int id = stdIn.nextInt();
		
		System.out.print("입금액 : ");
		long money = stdIn.nextLong();
		
		Account account = findAccount(id);// 해당 계좌 찾아서 저장
		if(account != null) { // 동일한 계좌 존재
			account.setBalance(account.getBalance() + money);
			System.out.println("입금완료 되었습니다.");
		}
	}
	
	public void withdraw() { // 출금
		System.out.print("계좌번호 : ");
		int id = stdIn.nextInt();
		
		System.out.print("출금액 : ");
		long money = stdIn.nextLong();
		
		
		Account account = findAccount(id);// 해당 계좌 찾아서 저장
		if(account != null) { // 동일한 계좌 존재
			if(account.getBalance() < money) {
				System.out.println("잔액이 부족합니다.");
			}
			else { // 동일한 계좌 존재x
				account.setBalance(account.getBalance() - money);
				System.out.println("출금완료 되었습니다.");
			}
			return;
		}
	}
	
	public void inquire() { // 잔액 조회
		System.out.print("계좌번호 : ");
		int id = stdIn.nextInt();
		Account account = findAccount(id);// 해당 계좌 찾아서 저장
		
		if(account != null) { // 동일한 계좌 존재
			System.out.println(INFO_LIST);
			System.out.println(account.toString());
			return;
		}
	}
	
	public void display() { //출력
		System.out.println(INFO_LIST);
		for(Account account : list) {
			System.out.println(account.toString());
		}
	}
}
