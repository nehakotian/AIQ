package ax1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hi") //if we don't write component name the default name will be "helloWorld"(i.e Class name with first letter small)
public class HelloWorld {
	private String name;
	
	public HelloWorld() {
		System.out.println("Default Constructor");
	}
	
	public HelloWorld(String name) {
		this.name=name;
		System.out.println("Param Constructor");
	}

	public String getName() {
		return name;
	}
		
	@Value("Annotated Zubair")
	public void setName(String name) {
		this.name = name;
	}
	
}
