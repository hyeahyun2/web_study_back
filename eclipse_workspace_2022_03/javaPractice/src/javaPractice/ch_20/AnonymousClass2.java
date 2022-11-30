package javaPractice.ch_20;
interface Anony {
	public void print();
}
public class AnonymousClass2 {
	public void printB(Anony a) { // 인터페이스 Anony타입의 객체를 매개변수로 받는 메서드
		a.print();
	}
	/* 필요할 때마다 인터페이스를 내부 클래스의 인스턴스로 만들어서 동적으로 추상메서드를 구현한 후에 사용
	 * 자바나 안드로이드에서 동일한 방식으로 익명의 내부 클래스를 이용하여 화면에서 이벤트를 처리함
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousClass2 t = new AnonymousClass2();
		// Anony 클래스 인스턴스는 이 부분에서 일시적으로 사용되어 진다.
		t.printB(new Anony() {
			@Override
			public void print() {
				System.out.println("익명 클래스 사용 중입니다.");
			}
			
		});
		t.printB(new Anony(){
			@Override
			public void print() {
				System.out.println("두번째 익명 클래스 사용!");
			}
		});
	}

}
