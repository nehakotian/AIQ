package ex2;

public class EmailMessageService implements MessageService {
	public EmailMessageService() {
		System.out.println("Email Service Constructor");
	}
	
	@Override
	public void send(String to, String msg) {
		System.out.println("Email sent to " + to + " with " + msg);
	}
}
