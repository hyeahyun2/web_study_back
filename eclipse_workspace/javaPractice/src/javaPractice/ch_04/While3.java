package javaPractice.ch_04;

public class While3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ���
		int i = 2;
		while(i <= 9) {
			System.out.println("**** " + i + "�� ****");
			int j = 1;
			while(j <= 9) {
				System.out.println(i + " x " + j + " = " + i * j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
