package javaPractice.ch_08;

import java.util.Random;
import java.util.Scanner;

public class ClassVariable {
	static Scanner stdIn = new Scanner(System.in);
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("�ٽ� �ѹ�? < yes = 1 / no = 0 > : ");
			cont = stdIn.nextInt();
		} while(cont !=0 && cont !=1); // �Է¹��� ���� 0 �Ǵ� 1�� �ƴ� ���
		return cont == 1; // 1 -> true, 0 -> false
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		System.out.println("�ϻ� Ʈ���̴�!!");
		do{
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			
			while(true) {
				System.out.print(x + " + " + y + " + " + z + " = ");
				int inputNum = stdIn.nextInt();
				if(inputNum == x+y+z) { // ������ ���
					System.out.println("�����Դϴ�!");
					break; // while�ݺ��� ����
				}
				System.out.println("Ʋ�Ƚ��ϴ�!");
			}
		}while(confirmRetry()); // �絵������? -> 0�Է½� false�Ǽ� do-while�� ����
		System.out.println("Ʈ���̴��� �����մϴ�.");
	}

}
