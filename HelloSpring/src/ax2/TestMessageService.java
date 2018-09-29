package ax2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageService {
	@Test
	public void testProvider() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("annotated.xml");

		MessageProvider mp = (MessageProvider) ctx.getBean("provider");

		mp.process("sms", "9820108880", "Hello Neha");
		mp.process("email", "neha@gmail.com", "Hola Neha");
		mp.process("wapp", "@zubair", "Bonjour Neha");
	}
}
