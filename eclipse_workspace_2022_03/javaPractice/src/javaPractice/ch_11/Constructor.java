package javaPractice.ch_11;
class Cellphone{
	String model = "Galaxy 8";
	String color;
	int capacity;
	Cellphone(String color, int capacity){
		this.color = color;
		this.capacity = capacity;
	}
}
public class Constructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cellphone myphone = new Cellphone("Silver", 64);
		System.out.println(myphone.model);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);
	}

}
