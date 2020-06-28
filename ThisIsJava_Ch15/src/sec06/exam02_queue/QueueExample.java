package sec06.exam02_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		// 구현 객체 : LinkedList

		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaoTalk", "홍두께"));

		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll(); // 하나씩 꺼내옴. 선입선출 (FIFO)
			// poll() : 객체 하나를 가져옴. 객체를 큐에서 제거한다.
			// peek() : 객체 하나를 가져옴. 객체를 큐에서 제거하지 않는다.
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS을 보냅니다.");
				break;
			case "sendKakaoTalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}
	}
}