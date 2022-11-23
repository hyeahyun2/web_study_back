package javaPractice.ch_08;

import java.util.Random;
import java.util.Scanner;

public class ClassVariable {
	static Scanner stdIn = new Scanner(System.in);
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("다시 한번? < yes = 1 / no = 0 > : ");
			cont = stdIn.nextInt();
		} while(cont !=0 && cont !=1); // 입력받은 수가 0 또는 1이 아닌 경우
		return cont == 1; // 1 -> true, 0 -> false
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		System.out.println("암산 트레이닝!!");
		do{
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			
			while(true) {
				System.out.print(x + " + " + y + " + " + z + " = ");
				int inputNum = stdIn.nextInt();
				if(inputNum == x+y+z) { // 정답일 경우
					System.out.println("정답입니다!");
					break; // while반복문 중지
				}
				System.out.println("틀렸습니다!");
			}
		}while(confirmRetry()); // 재도전할지? -> 0입력시 false되서 do-while문 중지
		System.out.println("트레이닝을 종료합니다.");
	}

}
