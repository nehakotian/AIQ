package lti.bank;

public class Current extends Account {
	private double overdraft;

	public Current() {

	}

	public Current(String holder) {
		// super(holder, INIT_CUR_BAL, OVERDRAFT_VALUE);
		super(holder, INIT_CUR_BAL);
		overdraft = OVERDRAFT_VALUE;
	}

	@Override
	public void withdraw(double amount) throws BalanceException {

		if (amount <= getBalance()) {
			setBalance(getBalance() - amount);
		}
		else if (amount <= getBalance()+overdraft) {
				overdraft += getBalance();
				setBalance(MIN_CUR_BAL);
				overdraft=overdraft-amount;
		
		} else {
			throw new BalanceException("Insufficient funds!");
	}
		txns.add(new Transaction("Debit",amount,getBalance()));
		//txns[idx++]=new CurrentTransaction("Debit",amount,getBalance(),overdraft);
		/*
		 * if(amount<=(getBalance())) setBalance(getBalance()-amount); else
		 * if(amount<=(getBalance()+ getOverdraft())) { amount = amount - getBalance();
		 * setBalance(MIN_CUR_BAL); setOverdraft(getOverdraft()-amount);
		 * 
		 * } else System.out.println("Insufficient funds!");
		 */
	}

	public void deposit(double amount) {
		this.overdraft =overdraft+ amount;
		if (overdraft > OVERDRAFT_VALUE) {
			setBalance(getBalance() + overdraft - OVERDRAFT_VALUE);
			overdraft = OVERDRAFT_VALUE;
			/*
			 * double v =0.0; if(getOverdraft()==OVERDRAFT_VALUE) setBalance(getBalance() + amount);
			 * else if(getOverdraft()< OVERDRAFT_VALUE) { v = OVERDRAFT_VALUE - getOverdraft();
			 * setOverdraft(getOverdraft() + v); amount = amount-v; setBalance(getBalance()
			 * + amount); }
			 */
		}
		
		txns.add(new Transaction("Credit",amount,getBalance()));
		//txns[idx++]=new CurrentTransaction("Credit",amount,getBalance(),overdraft);
	}



	@Override
	public void summary() {

		super.summary();
		System.out.println("Overdraft: " + overdraft);
	}

}
