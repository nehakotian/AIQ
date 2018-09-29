package ax1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//in this example we are running (junit in spring) instead of (spring in junit) unlike other examples..
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:annotated.xml"})
public class SpringTestHelloWorld {
//	@Autowired
//	private ApplicationContext ctx;
	
	@Autowired       //Here, instead of writing line 12 and 13 we write 15 and 16 which in turn lets us skip line 19 
	private HelloWorld hw;
	@Test
	public void testCase() {
		//HelloWorld hw=(HelloWorld) ctx.getBean("hi");
		System.out.println(hw.getName());
	}

}
