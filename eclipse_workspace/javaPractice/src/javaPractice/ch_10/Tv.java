package javaPractice.ch_10;

public class Tv {
	String color; // ��
	boolean power; // ��������
	int channel; // ä��
	
	// Tv�� ���(�޼���)
	void power() { // Tv �ѱ� or ����
		power = !power;
	}
	void channelUp() { // Tv�� ä�� ���̱�
		++channel;
	}
	void channelDown() { // Tv�� ä�� ���߱�
		--channel;
	}
}
