package javaPractice.ch_23;
/* void exit(int status)
 * 현재 프로세스를 강제 종료.
 * 인수로 정수 타입의 종료 코드를 전달
 * 정상적인 종료는 0을 리턴하고 에러발생시에 -1를 리던하는 것이 관행.
 * 또는 호출원과 약속하여 의미 있는 값을 리턴할 수도 있음.
 * 가령 특정 값을 조사하는 프로세스라면 결과값을 종료 코드로 리턴하는 식.
 * */
public class SystemExit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 프로그램 종료 exit()
		 * exit() 메서드는 현재 실행되고 있는 프로세스를 강제 종료시키는 혁할.
		 * int 매개 값을 지정하도록 되어 있는데, 이 값을 종료 상태 값이라고 하고,
		 * 일반적으로 정상 종료의 경우 0 값을 줌.
		 * */
		for(int i=0; i<=10; i++) {
			System.out.println(i);
			if(i == 5) {
				System.exit(0);
			}
		}
		System.out.println("마무리 코드");
	}

}
