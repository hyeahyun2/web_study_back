package javaPractice.ch_25;

import java.util.LinkedList;

class MyQueue {
	private LinkedList<String> linkedList = new LinkedList<String>();

	public void enQueue(String data) {
		linkedList.add(data);
	}
	
	public String deQueue() {
		// ť�� �� �տ��� ����
		int len = linkedList.size();
		if(len == 0) {
			System.out.println("ť�� ������ϴ�.");
			return null;
		}
		return (linkedList.remove(0)); // �� ���� �ڷ� ��ȯ�ϰ� �迭���� ����
	}
}

public class QueueEx {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue()); // A
		System.out.println(queue.deQueue()); // B
		System.out.println(queue.deQueue()); // C
	}

}
