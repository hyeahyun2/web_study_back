package javaPractice.ch_10;

public class Tv {
	String color; // 색
	boolean power; // 전원상태
	int channel; // 채널
	
	// Tv의 기능(메서드)
	void power() { // Tv 켜기 or 끄기
		power = !power;
	}
	void channelUp() { // Tv의 채널 높이기
		++channel;
	}
	void channelDown() { // Tv의 채널 낮추기
		--channel;
	}
}
