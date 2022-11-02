package javaPractice.ch_03;

public class ForRunningTime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* for문 동작 시간 구하기
		 * for문 동작 이후 시간 - for문 동작 전 시간
		 * */
		long startTime = System.currentTimeMillis(); // 시작시간
		for(int i = 0; i < 1000000000; i++) {
			;
		}
		long endTime = System.currentTimeMillis(); // 종료시간
		
		System.out.println("시작시간 : " + startTime);
		System.out.println("종료시간 : " + endTime);
		System.out.println("소요시간 : " + (endTime - startTime));
	}
}
