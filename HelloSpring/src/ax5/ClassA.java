package ax5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ClassA {
	
	@Autowired
	@Lazy //default is eager injection. Here we have done lazy injection
	private ClassB classB;
	
	public ClassA() {
		System.out.println("Constructor of ClassA");
	}
	
	public void someMethod() {
		classB.someOtherMethod();
	}
}
