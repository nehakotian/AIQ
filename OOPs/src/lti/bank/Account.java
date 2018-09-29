package lti.bank;

import java.util.Vector;

/**
 * This is a generalized account class
 * @author Vinduja Neha
 * @version 1.0
 *
 */

public abstract class Account implements Bank {
	private int acntNo;
	private String holder;
	private double balance;

	private static int autogen = INIT_ACNT_NO;

	//protected Transaction[] txns; // declaring transaction array
	//txns = new Vector<>();
	protected int idx;
	protected Vector<Transaction> txns;  //declaring transaction array
	/**
	 * Default Constructor
	 */
	public Account() {

	}

	public Account(String holder, double balance) {
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;

		txns = new Vector<>();
		//txns = new Transaction[5]; // instantiating transaction array of 5
		// Adding opening account transaction into array
		txns.add(new Transaction("Opening", balance, balance));
		//txns[idx++] = new Transaction("Opening", balance, balance);
	}

	/**The method to display account summary.*/
	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);

	}

	// BL Methods
	public void deposit(double amount) {
		balance += amount;
		txns.add(new Transaction("Credit", amount, balance));
		//txns[idx++] = new Transaction("Credit", amount, balance);
	}

	// public abstract void withdraw(double amount);
	/*
	 * { if (amount <= balance) balance -= amount; else
	 * System.out.println("Insufficient funds!"); }
	 */

	public void statement() {
		System.out.println("Statement of A/C: " + acntNo);
		System.out.println("Type\tAmount\tBalance\tOverdraft");
		for (Transaction txn:txns) {
			//if(txns!=null)
				System.out.println(txn);
			//txns[i].print();

		}
	}

	// Balance interface
	public double getBalance() {
		return balance;
	}

	protected void setBalance(double balance) {
		this.balance = balance;
	}

}
