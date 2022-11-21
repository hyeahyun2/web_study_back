package javaPractice.ch_14;
class Tv {
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
class CaptionTv extends Tv {
	boolean caption;
	void displayCaption (String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

public class LoadTv {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello, world!"); // 출력안됨(caption == false라서)
		ctv.caption = true;
		ctv.displayCaption("Hello, world!");
	}

}
