
public class MyImpl {
	public static void main(String[] args) {
		MyInterface.sayHello("Zubair");
		
		new MyInterface() { }.sayGoodbye("Zubair");
	}
}
