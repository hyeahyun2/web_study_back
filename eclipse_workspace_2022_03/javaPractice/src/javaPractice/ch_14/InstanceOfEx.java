package javaPractice.ch_14;

public class InstanceOfEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		if(fe instanceof Car3) {
			System.out.println("This is a Car instance.");
		}
		if(fe instanceof Object) {
			System.out.println("This is an Object instance.");
		}
		System.out.println();
		
		Car3 polyFe = new FireEngine();
		if(polyFe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		if(polyFe instanceof Car3) {
			System.out.println("This is a Car instance.");
		}
		if(polyFe instanceof Object) {
			System.out.println("This is an Object instance.");
		}
		System.out.println();
		
		Car3 car = new Car3();
		if(car instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		if(car instanceof Car3) {
			System.out.println("This is a Car instance.");
		}
		if(car instanceof Object) {
			System.out.println("This is an Object instance.");
		}
	}
}
