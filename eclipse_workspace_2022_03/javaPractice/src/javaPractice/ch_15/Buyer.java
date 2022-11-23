package javaPractice.ch_15;

import java.util.ArrayList;

public class Buyer { // ��, ������ ��� ���
	int money = 1000; // �����ݾ�
	int bonusPoint = 0; // ���ʽ����� (�ش����)
	
//	Product[] item = new Product[10]; // ������ ��ǰ �����ϱ� ���� �迭
//	int i = 0; // ī���� ���� (���ǻ� ����)
	
	ArrayList item = new ArrayList();
	
	void buy(Product p) { // �Ű����� Ÿ�� = �θ� Ŭ���� Ÿ�� -> ������ �̿�
						// �Է¹޴� ������ 'new �ڽ�Ŭ����'�� ���ǵ� ����
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
//		item[i++] = p; // �ε�����ȣ i��°�� �� ���Ǹ� ����
		item.add(p);
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	void refund(Product p) { // ������ ��ǰ ȯ��
		if(item.remove(p)) { // ��ǰ�� ArrayList���� ���� 
			// (����Ʈ�� ���� ��� false��ȯ)
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�.");
		}
		else {
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		// this.i : ī���� ���� ������ => item.length���� ȿ����!
		//	===> break�� �ʿ� ����!
//		for(int j=0; j<this.i; j++) { 
////			if(item[j] == null) break;
//			sum += item[i].price;
//			itemList += (item[j].toString() + " ");
//		}
		
		// ArrayList
		if(item.isEmpty()) { // Vector�� ����ִ��� Ȯ��
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		for(int i=0; i<item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i == 0)? "" + p : ", " + p;
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}
