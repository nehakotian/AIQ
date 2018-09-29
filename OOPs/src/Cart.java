
public class Cart extends Product{
	Product[] products = new Product[5];
	
	protected double  quantity;
	public Cart() {
		
	}

	int idx;

	public void addProduct(Product product,double quantity) {
		//if(products[idx].quantity<products[idx].stock)
		products[idx++] = product;
		this.quantity = quantity;


	}
	
	public double getQuantity() {
		return quantity;
	}
	
	


	public void showCart() {			
		System.out.println("Name  \t   "+ "Price  \t" + "Quantity \t" + "Total Price \t");
		double sum=0;
		double total =0;

		for (int i = 0; i < idx; i++) {
			if(products!=null) {

				total = products[i].getPrice()*this.quantity;
				
				System.out.println(products[i].getName()+" " + " \t" 
								+ products[i].getPrice()+"\t\t"+ 
									this.getQuantity() + "\t\t" + total );	
				sum=sum+total;							
			}				
		}	
		System.out.println("--------------------------------------------------------");
		System.out.println( "Total:\t" + sum);
		}




	public void removeProduct(Product p1) {
		p1=null;
		System.out.println(p1);	
	}

			
}


