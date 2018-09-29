
public class MyThread extends Thread {

	private int data;

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int c=1; c<=50; c++) 
			System.out.println(name+": " + ++ data );
	}
	
	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		MyThread m3 = new MyThread();
		
		m1.setName("Alfa");
		m2.setName("Bravo");
		m3.setName("Charlie");
		m1.start();
		m2.start();
		m3.start();
	}
	
}
