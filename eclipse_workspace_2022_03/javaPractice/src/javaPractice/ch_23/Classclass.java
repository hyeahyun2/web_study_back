package javaPractice.ch_23;
/* Class 클래스
 * 자바의 모든 클래스와 인터페이스는 컴파일 되고나면 class 파일로 생성됨.
 * java 파일이 컴파일되면 class 파일이 생성되고, 
 * 이 class 파일에는 클래스나 인터페이스에 대한 변수, 메서드, 생성자 등의 정보가 들어있음.
 * Class 클래스는 컴파일된 class 파일에 저장된 클래스나 인터페이스의 정보를 가져오는 데 사용.
 * 
 * 상황에 따라 내가 작업하지 않은 클래스를 사용해야 할 때도 있고,
 * 반환 받는 클래스가 정확히 어떤 자료형인지 모르는 경우가 생김.
 * 모르는 클래스의 정보를 사용할 경우에는 우리가 클래스의 정보를 직접 찾아야 함.
 * */
class Person {
	private String name;
	private int age;
	
	public Person() {} // 디폴트 생성자

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class Classclass {
	public static void main(String[] args) throws ClassNotFoundException {
		/* forName() 메서드에서 발생하는 예외를 처리함.
		 * 이름과 일치하는 클래스가 없는 경우 ClassNotFoundExcetpion 발생.
		 * */
		/* Class 클래스를 선언하고 클래스 정보를 가져오는 방법은 3가지.
		 * 1. Object 클래스의 getClass() 메서드 사용하기
		 * String s = new String();
		 * Class c = s.getClass(); // getClass() 메서드의 반환형은 Class
		 * 
		 * 2. 클래스 파일 이름을 Class 변수에 직접 대입하기
		 * Class c = String.Class;
		 * 
		 * 3. Class.forName("클래스 이름") 메서드 사용하기.
		 * Class c = Class.forName("java.lang.String");
		 * */
		Person person = new Person();
		Class pClass1 = person.getClass(); // Object의 getClass() 메서드 사용
		System.out.println(pClass1.getName()); // javaPractice.ch_23.Person
		
		Class pClass2 = Person.class; // 직접 class 파일 대입하기
		System.out.println(pClass2.getName()); // javaPractice.ch_23.Person
		
		// 클래스 이름으로 가져오기
		Class pClass3 = Class.forName("javaPractice.ch_23.Person");
		System.out.println(pClass3.getName());

	}
}
