
public class TestCart {
	public static void main(String[] args) {
		
		Product p1=new Product("bag",1000,10);
		Product p2=new Product("shoes",1500,10);
		Product p3=new Product("clothes",4000,10);
		Product p4=new Product("phone",5000,10);
		Product p5=new Product("laptop",5400,10);

		Cart c1=new Cart();
		c1.addProduct(p1,3);
		
		c1.addProduct(p2,2);
		c1.addProduct(p4,9);

		c1.showCart();
		
		//c1.removeProduct(p1);
		//c1.showCart();

		
		
		
	}

}
