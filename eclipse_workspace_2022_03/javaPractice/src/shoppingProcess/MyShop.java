package shoppingProcess;

import java.util.ArrayList;
import java.util.Scanner;

// IShop �������̽��� ������ MyShop Ŭ����
public class MyShop implements IShop {
	// ��� ȸ�� ���� �迭
//	User[] users =new User[2];
	ArrayList<User> users = new ArrayList<User>();
	// ��� ��ǰ ���� �迭
	Product[] products = new Product[4];
	int[] productNum = {0, 0, 0, 0};
	// ��ǰ �߰��� ���� ��ٱ���
	ArrayList<Product> cart = new ArrayList<Product>();
	// Ű���� �Է����� ���ڿ� �Է¹ޱ� ���� Scanner ��ü ����
	Scanner scan = new Scanner(System.in);
	
	// ���õ� ����� index ����
	int selUser;
	// ���θ� �̸�
	String title;

	@Override
	public void setTitle(String title) { // ���θ� ����(�̸�) ����
		this.title = title;
	}
	/**
	 * ���α׷����� ����ϱ� ���� ���� ����� ��� �޼���
	 * */
	@Override
	public void genUser() {
		User user;
		System.out.print("�߰��� ������� �̸��� �Է����ּ��� >> ");
		String userName = scan.next();
		System.out.println("���� ����� �������ּ��� : [1]CARD [2]CASH");
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
			System.out.println("1�� 2�߿� �������ּ���.");
			genUser();
		}
		System.out.print("����ڸ� �� �߰��Ͻðڽ��ϱ�?(y/n) >>> ");
		String answer = scan.next();
		switch(answer) {
		case "y":
			genUser();
			break;
		case "n":
			break;
		default:
			System.out.println("y�� n�߿� �������ּ���.");
		}
	}

	/**
	 * ���α׷����� ����ϱ� ���� ���� ��ǰ ��� �޼���
	 * */
	@Override
	public void genProduct() {
		CellPhone cellPhone = new CellPhone("������ ��Ʈ5", 1000000, 101, "SKT", "�Ｚ");
		products[0] = cellPhone;
		cellPhone = new CellPhone("���� ������7", 980000, 102, "KT", "Apple");
		products[1] = cellPhone;
		SmartTV smartTV = new SmartTV("�Ｚ 3D Smart TV", 5000000, 201,"4K", "42");
		products[2] = smartTV;
		smartTV = new SmartTV("LG Smart TV", 2500000, 202, "Full HD", "36");
		products[3] = smartTV;
		
	}
	
	/**
	 * ���α׷� ���� ���� �޼���
	 * */
	@Override
	public void start() {
		System.out.println(title + " : ����ȭ�� - ���� ����");
		System.out.println("================================");
		int i = 0; // �ε��� ��ȣ
		
		// ��ϵ� ����� ���� ���
		for(User user : users) {
			System.out.println("[" + i++ + "]" + user.getName() + "(" + user.getPayType() + ")");
		}
		
		System.out.println("[x]�� ��");
		System.out.print("����: ");
		String sel = scan.next(); // ���ü��� + ����(x) �߿� ���� -> ���ڿ� ������ ����
		System.out.println("## " + sel + "���� ##");
		
		//���õ� �޴��� ���� ó��
		switch(sel) {
		case "x":
			System.exit(0);
			break;
		default:
			selUser = Integer.parseInt(sel); // sel �ڷ��� ������ ��ȯ
			productList();
		}
	}
	
	/**
	 * ��ǰ ����� ���� ��ǰ�� ������ ��ٱ��Ͽ� �ֱ� ���� �޼���
	 * */
	public void productList() {
		System.out.println(title + " : ��ǰ ��� - ��ǰ ����");
		System.out.println("================================");
		int i = 0;
		
		// ��ϵ� ��ǰ ���� ���
		for(Product product : products) {
			System.out.print("[" + i + "]");
			product.printDetail();
			i++;
		}
		System.out.println("[h]����ȭ��"); // start() �޼��� ����
		System.out.println("[c]üũ�ƿ�"); // ���� ����
		System.out.print("����: ");
		String sel = scan.next();
		System.out.println("## " + sel + "���� ##");
		
		// ���õ� �޴��� ���� ó��
		switch(sel) {
		case "h": 
			start();
			break;
		case "c":
			checkOut();
			break;
		default:
			int psel = Integer.parseInt(sel);
			// ������ ������ ArrayList<Product> cart�� ���� �׸� ����
			boolean state = true;
			for(int j =0; j<cart.size(); j++) {
				if(products[psel] == cart.get(j)) {
					state = false;
				}
			}
			productNum[psel] ++;
			if(state) cart.add(products[psel]); 
			productList(); // �ڱ� �ڽ� ��ȣ�� (����Լ�)
		}
	}

	/**
	 * ���� ������ ���� üũ�ƿ� ó�� �޼���
	 * */
	public void checkOut() {
		System.out.println(title + " : üũ�ƿ�");
		System.out.println("================================");
		int total = 0;
		int i = 0;
		
		// ��ٱ��Ͽ� ��ϵ� ��ǰ ���� ���
		for(Product p : products) {
			if(productNum[i] != 0) {
				System.out.println("[" + i + "]" + p.pname + "(" + p.price + ") , " + productNum[i] + "��");
				total += (p.price * productNum[i]);
			}
			i++;
		}
		System.out.println("================================");
		
		// ������ ������� ���� ��� ���
		System.out.println("���� ���: " + users.get(selUser).getPayType());
		
		// �հ� ���
		System.out.println("�հ�: " + total + "�� �Դϴ�.");
		System.out.println("[p]����, [q]���� �Ϸ�");
		System.out.print("����: ");
		String sel = scan.next();
		
		// ���õ� �޴��� ���� ó��
		switch(sel) {
		case "q":
			System.out.println("## ������ �Ϸ� �Ǿ����ϴ�. �����մϴ�. ##");
			System.exit(0);
			break;
		case "p":
			productList();
			break;
		default: // ������ �Է� ���� �� �ٸ� ���� �Է��� ���
			checkOut(); // üũ�ƿ� �޼��� �����
		}
	}
}
