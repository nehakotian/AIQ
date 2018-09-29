
public interface MyInterface {
	static void sayHello(String name) {
		System.out.println("Hello " + name);
		
	}
	
	default void sayGoodbye(String name) {
		System.out.println("Goodbye " + name);
	}
}
