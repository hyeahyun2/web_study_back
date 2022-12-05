package javaPractice.ch_22;
/* void finalize()
 * new 연산자로 생성한 객체는 힙에 생성.
 * 메모리가 무한하지 않아 다 사용한 객체는 제거해야 함
 * 자바에는 가비지 컬렉터가 주기적으로 미사용 객체를 찾아 메모리를 회수하기 때문에,
 * 객체를 삭제하는 별도의 명령이 없음.
 * 메모리 회수가 자동으로 수행되서 메모리 누수를 걱정할 필요가 없으며 객체를 생성해서 사용하기만 하면 됨.
 * 
 * 하지만 가비지 컬렉터의 기능은 메모리에만 국한되며 그 이외의자원은 수작업으로 해체해야 됨.
 * 예를 들어 네트워크에 연결하여 통신하는 클래스라면 연결하는 동작과 연결을 끊는 동작이 필요.
 * 아래의 코드에서 disconnect() 메소드 호출이 빠졌거나, 예외가 발생해 메서드가 호출되지 않았다면
 * 객체는 가비지 컬렉터에 의해 회수되지만 
 * 연결된 통신은 아무도 끊어주지 않아 연결이 된 상태로 남아있게 됨.
 * */
/* finalize() 메서드는 객체가 사라질 때 호출되며 뒷 정리를 수행.
 * 메모리 관련 정리는 할 필요가 없지만, 통신연결, DB 오픈 등의 정리를 했다면
 * 객체가 사라지기 전에 정리해야 될 떄 사용.
 * 하지만 가비지 컬렉터가 언제 수거할지 모르기 때문에 예외 처리 방식으로 하는 것이 더 좋음.
 * 가비지 컬렉타의 호출 시점은 가상 머신이 결정하며 한가할 때 정리.
 * 
 * System.gc() 메서드
 * 메모리가 지극히 부족하거나 프로그램이 한가할 때 가비지 컬렉터를 기동하여 쓰레기를 수집.
 * 가비지 컬렉터는 시스템이 한가한 시간에 알아서 시행하도록 되어 있어 
 * 특수한 상황이 아닌 한 이 메서드 호출을 하지 말아야 함.
 * 자동으로 수집되도록 되어 있는데 강제로 명령을 내리면 오히려 성능이 떨어짐.
 * 가비지 컬렉터가 동작하면 당장 수행해야 할 다른 작업이 늦어져 사용자의 요구에 즉시 반응하지 못함.
 * 
 * System.runFinalization() 메서드
 * 가비지 컬렉터에 의해 객체를 제거할 때 finalize 메서드를 호출하는데
 * 메모리 회수 보다는 정리 작업만 하고 싶을 때 호출.
 * 메서드를 호출하면 예정된 finalize 메서드를 즉시 실행함.
 * */
class Network {
	void connect() {
		System.out.println("연결되었습니다.");
	}
	void disconnect() {
		System.out.println("연결이 끊어졌습니다.");
	}
	
	@Override
	protected void finalize() throws Throwable {
		/* 시스템이 적당한 때에 알아서 호출하기 때문에 public이 아니라 protected 엑세서 지정. 
		 * 자신의 자원을 정리하기 전에 부모의 finalize를 호출하여 부모의 자원부터 정리하는 것이 원칙.
		 **/
		super.finalize();
		disconnect();
	}
	
}
public class ObjectFinalize {
	static void communication() {
		Network network = new Network();
		network.connect();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		communication();
		System.gc(); // 강제로 가비지 컬렉터를 실행을 지시. 연결이 끊어졌습니다.
		
		// 가비지 컬렉터를 지시해도 finalize()가 바로 호출된다는 보장은 없음.
		// 여러 가지 내부 사정으로 연기 될 수 있어서 
		// 자원을 정리하려면 runFinalization() 메서드도 같이 호출해야 함.
		System.runFinalization();
	}
}
