package ex2;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MessageProvider implements ApplicationContextAware {
	private ApplicationContext ctx;

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = ctx;
	}
	//we do not instantiate i.e new() bcoz then it will create container inside container and it go on recursively

	public void process(String type, String to, String msg) {
		MessageService ms = (MessageService) ctx.getBean(type);//type will be text or sms
		ms.send(to, msg);
	}
	//here we need not change the process code whatever types are added
}
