package ex5;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class OrderProcessingService implements MessageSourceAware {

	private MessageSource messageSource;
	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void placeOrder(int quantity) {
		int availableQuantity = 2; //just an assumption
		if(quantity > availableQuantity) {
			String errorMessage = messageSource.getMessage("insufficient.stock", 
					new Object[]{availableQuantity}, new Locale("hi")); //Locale.getDefault()--locale for English by default
			
			throw new RuntimeException(errorMessage);
		}
	}
}
