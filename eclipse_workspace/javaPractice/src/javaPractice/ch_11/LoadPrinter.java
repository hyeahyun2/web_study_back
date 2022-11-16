package javaPractice.ch_11;
class Printer {
	static void println(int num) {
		System.out.println(num);
	}
	static void println(boolean b) {
		System.out.println(b);
	}
	static void println(double num) {
		System.out.println(num);
	}
	static void println(String name) {
		System.out.println(name);
	}
}
public class LoadPrinter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Printer printer = new Printer();
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("ȫ�浿");
	}

}
