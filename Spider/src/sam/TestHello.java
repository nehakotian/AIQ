package sam;

public class TestHello {

	public static void main(String[] args) {
		Hello h=new Hello() {
			@Override
			public String sayHello(String name) {
				return "Hello "+name;
			}
		};

		System.out.println(h.sayHello("Zubair"));
		System.out.println(h.toString());
		
		Hello hi=(name) -> "Hola "+name;
		System.out.println(hi.sayHello("Zubair"));
		System.out.println(hi);
		Hello.greet();
		h.seeOff();
	}

}
