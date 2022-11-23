package javaPractice.ch_05;

public class ArrayTwoD3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 5명 학생의 국어, 영어, 수학 성적 데이터를 가지고
		 * 1. 각 학생의 3과목 총점과 평균
		 * 2. 각 과목의 모든 학생의 총점을 구하기
		 * */
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("====================================================");
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.print(" "+(i+1)+"\t"); // 학생의 해당 번호
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(sum + "\t" + sum/(float)score[i].length);
		}
		System.out.println("====================================================");
		System.out.println("총점:\t" + korTotal + "\t" + engTotal + "\t" + mathTotal);
	}
}
