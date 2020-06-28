package sec06.exam02_queue;

public class Message {
	public String command; // 메세지 종류
	public String to; // 수취인

	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}