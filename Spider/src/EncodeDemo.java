import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodeDemo {

	public static void main(String[] args) {
		String password ="P@ssw0rd";
		System.out.println("Pasword: " + password );
		
		Encoder encoder = Base64.getEncoder();	
		
		byte[] bytes = password.getBytes();
		String encoded = encoder.encodeToString(bytes);
		
		System.out.println("Encode: " + encoded);
		
		
		Decoder decoder = Base64.getDecoder();
		byte[] bytes2 = decoder.decode(encoded);
		
		String decoded= new String (bytes2);
		System.out.println("Decoded: " + decoded);
	}

}
