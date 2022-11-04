package javaPractice.ch_05;

public class ArrayTwoD {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2차원 배열
		int[][] arr = new int[2][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("행 : " + arr.length); // 2
		System.out.println("열 : " + arr[0].length); // 3
	}
}
