package lti.emp;

public class Manager extends Employee{
	private double incentive;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String empName, double salary, double incentive) {
		super(empName, salary);
		this.incentive = incentive;
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("Incentive: " + incentive);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() + incentive;
	}
	
	

}

