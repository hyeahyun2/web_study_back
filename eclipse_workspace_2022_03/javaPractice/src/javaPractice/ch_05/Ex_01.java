package javaPractice.ch_05;

public class Ex_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ��ø for�� �̿��ؼ� �־��� �迭�� ��ü �׸��� �հ� ��հ� ���ϱ�
		 * */
		int[][] arr = { // total = 325, average = 325 / (4*5) = 16.25
				{5, 5, 5, 5, 5}, //25
				{10, 10, 10, 10, 10}, // 50
				{20, 20, 20, 20, 20}, // 100
				{30, 30, 30, 30, 30} // 150
		};
		int total = 0;
		float average = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		}
		// ��� = �հ� / (�ళ��*������);
		average = total / (float)(arr.length * arr[0].length);
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);
	}
}
