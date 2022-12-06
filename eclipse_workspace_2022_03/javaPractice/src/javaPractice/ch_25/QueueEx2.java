package javaPractice.ch_25;

import java.util.LinkedList;
import java.util.Queue;

class Message { // Queue를 이용한 메세지 큐
	public String command;
	public String to;
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
public class QueueEx2 {
	/* Queue를 이용한 메세지 큐 */
	public static void main(String[] args) {
		// Stack은 class 이지만 Queue는 interface
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// 메세지 저장
		messageQueue.offer(new Message("sendMail", "중길동"));
		messageQueue.offer(new Message("sendSMS", "박성훈"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두깨"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll(); // 메세지 큐에서 1개의 메세지 꺼냄
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냈습니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냈습니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냈습니다.");
				break;
			}
		}
	}

}
