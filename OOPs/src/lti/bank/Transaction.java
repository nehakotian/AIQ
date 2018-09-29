package lti.bank;

public class Transaction {
	private String type;
	private double amount, balance;

	public Transaction() { 
	}

	public Transaction(String type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return type + "\t" + amount + "\t" + balance;
	}

	public void print() {
		System.out.println(type + "\t" + amount + "\t" + balance);
	}
}
