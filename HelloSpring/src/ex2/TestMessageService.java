package ex2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageService {
	@Test
	public void testProvider() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("ex2/appctx.xml");

		MessageProvider mp = (MessageProvider) appCtx.getBean("provider");

		mp.process("sms", "9820108880", "Hello Neha");
		mp.process("email", "neha@gmail.com", "Hola Neha");
		mp.process("wapp", "@zubair", "Bonjour Neha");
	}
}
