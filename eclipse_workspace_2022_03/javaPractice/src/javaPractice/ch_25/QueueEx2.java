package javaPractice.ch_25;

import java.util.LinkedList;
import java.util.Queue;

class Message { // Queue�� �̿��� �޼��� ť
	public String command;
	public String to;
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
public class QueueEx2 {
	/* Queue�� �̿��� �޼��� ť */
	public static void main(String[] args) {
		// Stack�� class ������ Queue�� interface
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// �޼��� ����
		messageQueue.offer(new Message("sendMail", "�߱浿"));
		messageQueue.offer(new Message("sendSMS", "�ڼ���"));
		messageQueue.offer(new Message("sendKakaotalk", "ȫ�α�"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll(); // �޼��� ť���� 1���� �޼��� ����
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ ���½��ϴ�.");
				break;
			case "sendSMS":
				System.out.println(message.to + "�Կ��� SMS�� ���½��ϴ�.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "�Կ��� īī������ ���½��ϴ�.");
				break;
			}
		}
	}

}
