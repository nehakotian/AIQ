package ax3;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLife {
	@Test
	public void lafda() {
		ConfigurableApplicationContext kuchBhi=new ClassPathXmlApplicationContext("annotated.xml");
		//ConfigureableApplicationContext is the only method which can be closed, other methods cannot be closed
		
		MyLife dukh=kuchBhi.getBean(MyLife.class);
		
		kuchBhi.close();
		
	}
}
