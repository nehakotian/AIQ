import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {

	public static void main(String[] args) {
		Locale hindi = new Locale("hi", "in");
		ResourceBundle bundle = ResourceBundle.getBundle("message", hindi);// Factory method - base name (Locale.french for french)
		
		System.out.println(bundle.getString("greeting"));
		System.out.println(bundle.getString("message"));

	}

}
