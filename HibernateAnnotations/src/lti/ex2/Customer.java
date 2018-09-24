package lti.ex2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity //Mandatory
@Table(name="customer")  
@SequenceGenerator(name="seqgen", sequenceName="cust_seq")
public class Customer {
	@Id             //Mandatory annotation
	@GeneratedValue(generator="seqgen")
	@Column(name="cust_id")
	private int custID;
	@Column(name="cust_name")
	private String name;
	@Column(name="cust_credit_limit")
	private double creditLimit;
	
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

}
