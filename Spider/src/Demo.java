
public class Demo<Z> {
	private Z data;

	public Demo(Z data) {
		this.data = data;

	}

	public Z getData() {
		return data;
	}

	public void setData(Z data) {
		this.data = data;
	}

	public static void main(String[] args) {
		Demo<String> d1= new Demo("Hello");
		//d1.setData(1000);

		Demo<Integer> d2= new Demo(500);
		//d2.setData("Bye");
	}
}
