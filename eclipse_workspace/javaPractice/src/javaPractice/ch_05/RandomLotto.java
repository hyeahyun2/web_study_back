package javaPractice.ch_05;

public class RandomLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// random함수 이용해서 로또번호 구하기
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1; // 1부터 45까지 각 배열에 입력
		}
		for(int i=0; i<10000; i++) {
			int j = (int)(Math.random() * ball.length); // 0~44
			// 배열 순서 셔플
			int temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		for(int i=0; i<6; i++) { // 배열 인덱스번호 앞 6개 출력
			System.out.print(ball[i] + " ");
		}
	}

}
