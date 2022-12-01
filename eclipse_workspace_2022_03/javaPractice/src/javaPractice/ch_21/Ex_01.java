package javaPractice.ch_21;

public class Ex_01 {
	// 비정상 종료를 하는데, try ~ catch를 이용해서
	// 예외를 안전하게 처리하도록 코드 수정할 것
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = i;
		}
		try {
			for(int i=0; i<11; i++) {
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("배열 길이 오류 예외 처리");
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.err.println("나머지 예외 처리");
//			e.printStackTrace();
		}
	}
}
