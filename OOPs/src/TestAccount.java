

import lti.bank.AccountFactory;
import lti.bank.BalanceException;
import lti.bank.Bank;

public class TestAccount {
	public static void main(String[] args) {
		/*Account a1=new Account("Polo",5000);
		a1.summary();
		a1.withdraw(6000);
		a1.deposit(3000);
		a1.summary();*/
		
		/*Bank s1=AccountFactory.openAccount("Polo", "Current");
		s1.deposit(2000);
		s1.withdraw(1500);		
		s1.deposit(1000);
		
		s1.statement(); 
		*/
		Bank s2=AccountFactory.openAccount("Lolo", "current");
		//s2.deposit(2000);
		try {
			s2.withdraw(25000);
		} catch (BalanceException e) {
			System.out.println(e.getMessage()); //End user
//			System.out.println(e); //logging for audit purpose
//			e.printStackTrace(); //developers for trouble shooting
		}	
//		s2.deposit(1000);
//		
		s2.statement();
		
		/*Account c = new Current("Lili");
		c.summary();
		System.out.println("after withdrawal");
		c.withdraw(3000);
		c.withdraw(7000);
		c.summary();
		System.out.println("after deposit");
		c.deposit(2000);
		c.deposit(5000);
		c.summary();*/
	}
}
