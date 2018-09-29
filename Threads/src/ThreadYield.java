
public class ThreadYield {
	class HelloThread extends Thread {
		@Override
		public void run() {
			while(true) {
				System.out.println("Hello");
				yield();
				/*try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
			}
		}
	}
	
	class WorldThread extends Thread {

		@Override
		public void run() {
			while(true) {
				System.out.println("World");
				yield();
				/*try {
					sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadYield yield = new ThreadYield();
		HelloThread hello = yield.new HelloThread();
		
		WorldThread world = yield.new WorldThread();
		
		hello.start();
		world.start();
	}
}
