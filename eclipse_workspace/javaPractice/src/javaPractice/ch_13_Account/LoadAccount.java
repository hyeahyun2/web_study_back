package javaPractice.ch_13_Account;

import java.util.Scanner;

public class LoadAccount {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			} else {
				System.out.println("1부터 5까지의 숫자로 입력해주세요.");
			}
			
		}
		System.out.println("프로그램 종료");
	}
	
	// 계좌 생성
	private static void createAccount() {
		System.out.println("-------------");
		System.out.println("계좌생성");
		System.out.println("-------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		System.out.print("계좌주: ");
		String owner = scanner.next();
		
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		accountArray[idx] = new Account(ano, owner, balance);
		idx ++;
	}
	// 계좌목록 보기
	private static void accountList() {
		System.out.println("-------------");
		System.out.println("계좌목록");
		System.out.println("-------------");
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				break;
			}
			System.out.println(accountArray[i].getAno() + "  " + 
					accountArray[i].getOwner() + "  " + accountArray[i].getBalance());
		}
	}
	// 예금하기
	private static void deposit() {
		System.out.println("-------------");
		System.out.println("예금");
		System.out.println("-------------");
		
		System.out.print("계좌번호: ");
		String userAno = scanner.next();
		
		System.out.print("예금액: ");
		int inputBalance = scanner.nextInt();
		
		System.out.print("결과: ");
		Account userAcc = findAccount(userAno);
		if(userAcc == null) {
			System.out.println("계좌가 없습니다.");
		}
		else {
			userAcc.setBalance(inputBalance);
			System.out.println("예금이 성공되었습니다.");
		}
	}
	// 출금하기
	private static void withdraw() {
		System.out.println("-------------");
		System.out.println("출금");
		System.out.println("-------------");
		
		System.out.print("계좌번호: ");
		String userAno = scanner.next();
		
		System.out.print("출금액: ");
		int outputBalance = scanner.nextInt();
		
		System.out.print("결과: ");
		Account userAcc = findAccount(userAno);
		if(userAcc == null) {
			System.out.println("계좌가 없습니다.");
		}
		else if(outputBalance > userAcc.getBalance()) {
			System.out.println("잔액보다 출금액이 커서 출금에 실패했습니다.");
		}
		else {
			userAcc.setBalance(-outputBalance);
			System.out.println("출금이 성공되었습니다.");
		}
	}

	// 계좌번호 입력받아 동일한 ano를 가지는 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}
