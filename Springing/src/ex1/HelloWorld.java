package ex1;

public class HelloWorld {
	private String name;
	
	public HelloWorld() {
		System.out.println("Default Constructor");
	}
	public HelloWorld(String name) {
		this.name = name;
		System.out.println("Param Constructor");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
