package javaPractice.ch_24;

// 제네릭은 C++의 템플릿이 발전한 형태
// C++과는 달리 제네릭 대신 Object를 사용하면 모든 데이터 타입을 사용할 수 있지만,
// 경우에 따라 형 변환 해줘야 되서 제네릭을 선호
class ObjectData {
	private Object data;

	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}

// GenericTypeTest
// 제네릭(Generic) : 일반화, 범용화라는 의미로,
// 클래스나 메서드에서 사용하는 필드나 매개변수의 자료형(클래스형)을 호출하는 쪽에서 지정하도록 하는 기능

// 일반적인 방식으로 클래스에서 미리 데이터 타입을 지정해야 하지만 
// 제네릭을 사용하면 호출하는 쪽에서 데이터 타입을 지정
class CommonData<T> {
	private T data; // 데이터 타입으로 T를 지정. Type의 약자. 클래스 선언에서 <> 사이의 문자

	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}

public class ArrayListGenerics2 {
	public static void main(String[] args) {
		ObjectData stringCommonDate = new ObjectData();
		ObjectData integerCommonDate = new ObjectData();
		// 클래스의 데이터 타입이 Object라서 모든 데이터 타입이 사용 가능
		stringCommonDate.setData("abc");
		integerCommonDate.setData(100);
		System.out.println("stringCommonDate : " + stringCommonDate.getData());
		System.out.println("integerCommonDate : " + integerCommonDate.getData());
		System.out.println();
		
		// 호출하는 쪽에서 타입 지정
		CommonData<String> stringCommonDate2 = new CommonData<String>();
		CommonData<Integer> integerCommonDate2 = new CommonData<>(); // 생성자에는 타입 생략 가능
		stringCommonDate2.setData("abc");
		integerCommonDate2.setData(100);
		System.out.println("stringCommonDate2 : " + stringCommonDate2.getData());
		System.out.println("integerCommonDate2 : " + integerCommonDate2.getData());
	}
}
