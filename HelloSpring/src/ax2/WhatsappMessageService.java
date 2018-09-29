package ax2;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("wapp")
@Lazy
public class WhatsappMessageService implements MessageService{

	public WhatsappMessageService() {
		System.out.println("Whatsapp Service is ready");
	}
	

	@Override
	public void send(String to, String msg) {
		System.out.println("Whatsapp sent to " + to + " with " + msg);
	}
}
