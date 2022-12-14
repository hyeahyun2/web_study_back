package mvc_Account_connDB;

import java.util.ArrayList;
import java.util.Scanner;

// toString 수정, 여러번 쓰이는 로직 메소드or변수로 묶어버리기
public class AccountManager {
	private Scanner stdIn;
	private AccountDAO accountDAO;
	
	private final String INFO_LIST = "계좌번호\t성명\t잔액";
	private final String ERROR_NOT_FIND_ID = "해당 계좌번호가 존재하지 않습니다.";
	
	public AccountManager() {
		accountDAO = new AccountDAO();
		stdIn = new Scanner(System.in);
	}
	
	// 1. 계좌 개설
	public void makeAccount() { 
		AccountDTO account = new AccountDTO();
		
		System.out.print("계좌 번호 : ");
		int id = stdIn.nextInt();
		account.setId(id);

		System.out.print("이름 : ");
		account.setName(stdIn.next());
		
		System.out.print("입금액 : ");
		account.setBalance(stdIn.nextLong());
		
		if(accountDAO.insertAccount(account)) {
			System.out.println("계좌가 개설되었습니다.");
		}
		else {
			System.out.println("계좌 생성에 실패했습니다.");
		}
		
	}
	
	// 2. 입금
	public void deposit() {
		System.out.print("계좌번호 : ");
		int id = stdIn.nextInt();
		
		System.out.print("입금액 : ");
		long money = stdIn.nextLong();
		
		
		if(accountDAO.isAccount(id)) { // 중복된 id 계좌 있는지 확인
			accountDAO.updateBalance(id, money, true); // 쿼리 처리, 처리 정상적으로 완료 -> true
		}
		else {
			System.out.println(ERROR_NOT_FIND_ID);
		}
	}
	
	// 3. 출금
	public void withdraw() { 
		System.out.print("계좌번호 : ");
		int id = stdIn.nextInt();
		
		System.out.print("출금액 : ");
		long money = stdIn.nextLong();
		
		
		if(accountDAO.isAccount(id)) { // 중복된 id 계좌 있는지 확인
			AccountDTO account = accountDAO.selectOne(id);
			if(account.getBalance() < money) { // 돈 부족
				System.out.println("잔액이 부족합니다.");
			}
			else {
				accountDAO.updateBalance(id, money, false); // 쿼리 처리, 처리 정상적으로 완료 -> true
			}
		}
		else {
			System.out.println(ERROR_NOT_FIND_ID);
		}
	}
	
	// 4. 잔액 조회
	public void inquire() { 
		System.out.print("계좌번호 : ");
		int id = stdIn.nextInt();
		
		AccountDTO account = accountDAO.selectOne(id);
		if(account != null) { // 동일한 계좌 존재
			System.out.println(INFO_LIST);
			System.out.println(account.toString());
			return;
		}
	}
	
	// 5. 출력
	public void display() { 
		ArrayList<AccountDTO> list = accountDAO.selectAll();
		System.out.println(INFO_LIST);
		for(AccountDTO account : list) {
			System.out.println(account.toString());
		}
	}
	
	// 6. 프로그램 종료
	public void exitProgram() {
		System.out.println("프로그램을 종료합니다.");
		accountDAO.disConnect();
	}
}
