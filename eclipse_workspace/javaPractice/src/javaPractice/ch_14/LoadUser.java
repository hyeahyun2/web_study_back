package javaPractice.ch_14;
class User {
	private String name;
	private int age;
	User(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class LoadUser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User("ö��" , 20);
		User user2 = new User("����" , 19);
		
		System.out.println(user1.getName() + "�� ���̴� " + user1.getAge());
		user2.setAge(1000);
		System.out.println(user2.getName() + "�� ���̴� " + user2.getAge());
		
	}
}
