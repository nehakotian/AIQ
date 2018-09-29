
public class MyDaemon extends Thread {
	private int limit;
	
	public MyDaemon(int limit, String name) {
		super(name);
		this.limit = limit; 
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = currentThread().getName();
		for (int c = 0; c <= limit; c++) 
			System.out.println(name + ":" + c);
				
		
	}
	
	public static void main(String[] args) {
		Thread t1 = new MyDaemon(25, "Joe");
		Thread t2 = new MyDaemon(50, "Kim");
		Thread t3 = new MyDaemon(75, "Sam");
		
		Thread daemon =  new MyDaemon(1000000, "Fan");
		
		daemon.setDaemon(true);
		
		String name = currentThread().getName();
		for (int c = 1; c <= 100; c++) 
			System.out.println(name + ":" + c);
		
		
		t1.start();
		t2.start();
		t3.start();
		daemon.start();
	}
	
	
	

}
