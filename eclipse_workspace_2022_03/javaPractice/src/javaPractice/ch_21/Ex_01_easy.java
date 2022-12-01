package javaPractice.ch_21;

public class Ex_01_easy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30};
		
		try {
			System.out.println("arr[2]=" + arr[2]);
			System.out.println("arr[3]=" + arr[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("배열 길이 관련 오류 예외 처리");
			System.err.println(e.getMessage());
		} catch(Exception e){
			System.err.println("나머지 예외 처리");
		} finally {
			System.out.println("arr 출력 완료");
		}
		System.out.println("try/catch 구문 밖 문장 수행");
	}
}
