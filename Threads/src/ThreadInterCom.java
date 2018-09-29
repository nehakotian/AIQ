class Stock {
	private int data;
	private boolean flag;

	public synchronized void setQuote() {
		try {
			if (flag == true)
				wait();
			data = (int) (Math.random() * 1000);
			System.out.println("Set: " + data);
			flag = !flag;
			notify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void getQuote() {
		try {
			if (flag == false)
				wait();
			System.out.println("Get: " + data);
			flag = !flag;
			notify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Exchange extends Thread {
	private Stock istock;

	public Exchange(Stock istock) {
		this.istock = istock;
	}

	@Override
	public void run() {
		while (true) {
			istock.setQuote();
		}
	}
}

class Holder extends Thread {
	private Stock istock;

	public Holder(Stock istock) {
		this.istock = istock;
	}

	@Override
	public void run() {
		while (true) {
			istock.getQuote();
		}
	}

}

public class ThreadInterCom {
	public static void main(String[] args) {
		Stock istock = new Stock();
		Exchange producer = new Exchange(istock);
		Holder consumer = new Holder(istock);

		producer.start();
		consumer.start();
	}
}
