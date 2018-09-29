
public class SyncThread implements Runnable {

	@Override
	public void run() {
		display(Thread.currentThread().getName());

	}

	private synchronized void display(String name) {
		try {
			System.out.print("[");
			Thread.sleep(1000);
			System.out.print(name);
			Thread.sleep(1000);
			System.out.println("]");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SyncThread st = new SyncThread();
		Thread t1 = new Thread(st, "Gordon");
		Thread t2 = new Thread(st, "Gabriel");
		Thread t3 = new Thread(st, "Frank");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
