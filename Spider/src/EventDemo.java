//Lambda Expression
public class EventDemo implements Event {

	@Override
	public void doSomething() {
		System.out.println("First Event");
	}

	static class EventImpl implements Event {

		@Override
		public void doSomething() {
			// TODO Auto-generated method stub
			System.out.println("Second Event");
		}

	}

	public void doingSomething() {
		class InnerEventImpl implements Event {
			@Override
			public void doSomething() {
				System.out.println("Third Event");
			}
		}
		;
		Event e = new InnerEventImpl();
		e.doSomething();
	}

	public void doingSomethingAgain() {
		Event e=new Event() {
			@Override
			public void doSomething() {
				System.out.println("Fourth Event");
			}
		};
		e.doSomething();
	/*	new Event() {
			@Override
			public void doSomething() {
				System.out.println("Fourth Event");
			}
		}.doSomething();*/
	}
	
	public void doingSomethingLastTime() {
		Event e=() -> System.out.println("Fifth Event");
		e.doSomething();
	}
	
	public static void main(String[] args) {
		EventDemo demo = new EventDemo();
		demo.doSomething();

		// EventImpl impl = demo.new EventImpl();
		EventImpl impl = new EventDemo.EventImpl();
		impl.doSomething();

		demo.doingSomething();
		demo.doingSomethingAgain();
		demo.doingSomethingLastTime();
	}
}
