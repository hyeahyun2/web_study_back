package javaPractice.ch_05;

public class ArrayTwoD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6}
		};
		System.out.println("За : " + arr.length);
		System.out.println("ї­ : " + arr[0].length);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
