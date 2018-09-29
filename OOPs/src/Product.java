
public class Product {
	
	protected String name ;
	protected double price ;
	protected double stock;
	//protected double quantity;
	

	public Product(String name,double price,double stock) {
		this.name = name;
		this.price = price;
		this.stock =stock;
	}

	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}

	

	public double getPrice() {
		return price;
	}



	/*public double getQuantity() {
		return quantity;
	}
*/


	
	
	
}
