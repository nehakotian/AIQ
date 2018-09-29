package ex1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {
	
	@Test
	public void testGreeting() {
		ApplicationContext appCtx=new ClassPathXmlApplicationContext("ex1/appctx.xml"); //file name is not fixed, any file name will do
		//here we are giving the path for xml
		//we are not instantiating the object we tell application context to get the object
		//we use constructor injection or setter injection(whatever we use) there will be no changes in bean
		HelloWorld hw=(HelloWorld)appCtx.getBean("hello");
		System.out.println(hw.getGreeting());
	}
}
