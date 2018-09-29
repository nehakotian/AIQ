import lti.stock.Broker;
import lti.stock.Holder;
import lti.stock.StockSingleton;

public class TestStock {
	public static void main(String[] args) {
		//Stock lti = new Stock();
		
		Holder h= StockSingleton.getStock();
		h.viewQuote();
		
		Broker b = StockSingleton.getStock();
		b.getQuote();
		
		System.out.println(h == b);
	}
}
