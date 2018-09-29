package ax1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {
	
	@Test
	public void testCase() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("annotated.xml"); //file name is not fixed, any file name will do
		//here we are giving the path for xml
		
		HelloWorld hw=(HelloWorld) ctx.getBean("hi");//By id where id is "hi"
		System.out.println("Name: " + hw.getName());
		
		HelloWorld hw2 = ctx.getBean(HelloWorld.class);//By type of class
		System.out.println(hw2.getName());
	}
}
