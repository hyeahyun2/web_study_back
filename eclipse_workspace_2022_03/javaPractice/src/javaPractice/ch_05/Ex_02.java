package javaPractice.ch_05;

public class Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { 
				{95, 86}, 
				{83, 92, 96}, 
				{78, 83, 93, 87, 88}
		};
		int total = 0;
		float average = 0;
		int leng = 0; // ÃÑ °³¼ö ÀúÀå
		for(int i = 0; i < arr.length; i++) {
			leng += arr[i].length;
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		}
		// Æò±Õ 
		average = total / (float)leng;
		
		System.out.println("total = " + total); // 881
		System.out.println("average = " + average); // 88.1
	}

}
