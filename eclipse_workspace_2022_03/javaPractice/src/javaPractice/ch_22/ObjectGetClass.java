package javaPractice.ch_22;
/* getClass() 메서드는 객체의 클래스 정보를 조사하는 Class 객체를 리턴
 * */
class Human {
	int age;
	String name;
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("안녕 " + age + "살" + name + "입니다.");
	}
}

public class ObjectGetClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human kim = new Human(29, "김규성");
		System.out.println("클래스 이름: " + kim.getClass());
	}

}
