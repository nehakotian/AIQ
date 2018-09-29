package ax2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("provider")
public class MessageProvider{
	@Autowired
	//injects the reference of the specified object type--it does injection by type by default
	
	private ApplicationContext ctx;

	public void process(String type, String to, String msg) {
		MessageService ms = (MessageService) ctx.getBean(type);//type will be text or sms
		ms.send(to, msg);
	}
}
