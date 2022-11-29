package shoppingProcess;

import java.util.ArrayList;
import java.util.Scanner;

// IShop 인터페이스를 구현한 MyShop 클래스
public class MyShop implements IShop {
	// 등록 회원 정보 배열
//	User[] users =new User[2];
	ArrayList<User> users = new ArrayList<User>();
	// 등록 상품 정보 배열
	Product[] products = new Product[4];
	int[] productNum = {0, 0, 0, 0};
	// 상품 추가를 위한 장바구니
	ArrayList<Product> cart = new ArrayList<Product>();
	// 키보드 입력으로 문자열 입력받기 위한 Scanner 객체 생성
	Scanner scan = new Scanner(System.in);
	
	// 선택된 사용자 index 보관
	int selUser;
	// 쇼핑몰 이름
	String title;

	@Override
	public void setTitle(String title) { // 쇼핑몰 제목(이름) 설정
		this.title = title;
	}
	/**
	 * 프로그램에서 사용하기 위한 예제 사용자 등록 메서드
	 * */
	@Override
	public void genUser() {
		User user;
		System.out.print("추가할 사용자의 이름를 입력해주세요 >> ");
		String userName = scan.next();
		System.out.println("결제 방식을 선택해주세요 : [1]CARD [2]CASH");
		String userPay = scan.next();
		switch(userPay) {
		case "1":
			user = new User(userName, PayType.CARD);
			users.add(user);
			break;
		case "2":
			user = new User(userName, PayType.CASH);
			users.add(user);
			break;
		default:
			System.out.println("1과 2중에 선택해주세요.");
			genUser();
		}
		System.out.print("사용자를 더 추가하시겠습니까?(y/n) >>> ");
		String answer = scan.next();
		switch(answer) {
		case "y":
			genUser();
			break;
		case "n":
			break;
		default:
			System.out.println("y와 n중에 선택해주세요.");
		}
	}

	/**
	 * 프로그램에서 사용하기 위한 예제 상품 등록 메서드
	 * */
	@Override
	public void genProduct() {
		CellPhone cellPhone = new CellPhone("갤럭시 노트5", 1000000, 101, "SKT", "삼성");
		products[0] = cellPhone;
		cellPhone = new CellPhone("애플 아이폰7", 980000, 102, "KT", "Apple");
		products[1] = cellPhone;
		SmartTV smartTV = new SmartTV("삼성 3D Smart TV", 5000000, 201,"4K", "42");
		products[2] = smartTV;
		smartTV = new SmartTV("LG Smart TV", 2500000, 202, "Full HD", "36");
		products[3] = smartTV;
		
	}
	
	/**
	 * 프로그램 메인 시작 메서드
	 * */
	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정 선택");
		System.out.println("================================");
		int i = 0; // 인덱스 번호
		
		// 등록된 사용자 정보 출력
		for(User user : users) {
			System.out.println("[" + i++ + "]" + user.getName() + "(" + user.getPayType() + ")");
		}
		
		System.out.println("[x]종 료");
		System.out.print("선택: ");
		String sel = scan.next(); // 선택숫자 + 종료(x) 중에 선택 -> 문자열 변수에 저장
		System.out.println("## " + sel + "선택 ##");
		
		//선택된 메뉴에 따라 처리
		switch(sel) {
		case "x":
			System.exit(0);
			break;
		default:
			selUser = Integer.parseInt(sel); // sel 자료형 정수로 변환
			productList();
		}
	}
	
	/**
	 * 상품 목록을 보고 상품을 선택해 장바구니에 넣기 위한 메서드
	 * */
	public void productList() {
		System.out.println(title + " : 상품 목록 - 상품 선택");
		System.out.println("================================");
		int i = 0;
		
		// 등록된 상품 정보 출력
		for(Product product : products) {
			System.out.print("[" + i + "]");
			product.printDetail();
			i++;
		}
		System.out.println("[h]메인화면"); // start() 메서드 실행
		System.out.println("[c]체크아웃"); // 결제 진행
		System.out.print("선택: ");
		String sel = scan.next();
		System.out.println("## " + sel + "선택 ##");
		
		// 선택된 메뉴에 따라 처리
		switch(sel) {
		case "h": 
			start();
			break;
		case "c":
			checkOut();
			break;
		default:
			int psel = Integer.parseInt(sel);
			// 위에서 선언한 ArrayList<Product> cart에 선택 항목 저장
			boolean state = true;
			for(int j =0; j<cart.size(); j++) {
				if(products[psel] == cart.get(j)) {
					state = false;
				}
			}
			productNum[psel] ++;
			if(state) cart.add(products[psel]); 
			productList(); // 자기 자신 재호출 (재귀함수)
		}
	}

	/**
	 * 결제 진행을 위한 체크아웃 처리 메서드
	 * */
	public void checkOut() {
		System.out.println(title + " : 체크아웃");
		System.out.println("================================");
		int total = 0;
		int i = 0;
		
		// 장바구니에 등록된 상품 정보 출력
		for(Product p : products) {
			if(productNum[i] != 0) {
				System.out.println("[" + i + "]" + p.pname + "(" + p.price + ") , " + productNum[i] + "개");
				total += (p.price * productNum[i]);
			}
			i++;
		}
		System.out.println("================================");
		
		// 선택한 사용자의 결제 방법 출력
		System.out.println("결제 방법: " + users.get(selUser).getPayType());
		
		// 합계 출력
		System.out.println("합계: " + total + "원 입니다.");
		System.out.println("[p]이전, [q]결제 완료");
		System.out.print("선택: ");
		String sel = scan.next();
		
		// 선택된 메뉴에 따라 처리
		switch(sel) {
		case "q":
			System.out.println("## 결제가 완료 되었습니다. 종료합니다. ##");
			System.exit(0);
			break;
		case "p":
			productList();
			break;
		default: // 지정된 입력 문자 외 다른 문자 입력한 경우
			checkOut(); // 체크아웃 메서드 재실행
		}
	}
}
