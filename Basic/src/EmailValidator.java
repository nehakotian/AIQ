
public class EmailValidator {

	public static void main(String[] args) {
		// 1.Only one occurrences of @ and .
		// 2. Min 4 letters before @
		// 3. Min 3 letters between @ and .
		// 4. Min 2 letters after .

		String email = "zubair@mail.com";
		int count = 0, count1 = 0;
		//int index1 = email.indexOf('@');
		//int index2 = email.indexOf('.');
		int flag = 0;

		// if any 1 condition is false do not check for other conditions
		// string class methods

		
		/*if(email.contains("."))
				count++;
		
		if(email.contains("@"))
				count1++;*/
		
		for (int i = email.length() - 1; i >= 0; i--) {

			if (email.charAt(i) == '.') 
				count++;
			
			
			if (email.charAt(i) == '@')
				count1++;
		}
		
		
		if ((count == 1 && count1 == 1) && 
				(email.indexOf('@') >3) && 
				(email.indexOf('.')-email.indexOf('@') >3) && 
				(email.length()-email.indexOf('.') >2) )
				System.out.println("Email Valid");
		else
			System.out.println("Email Invalid");
		
		
		
	}

}
