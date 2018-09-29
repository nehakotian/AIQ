package lti.emp;

public class Executive extends Employee {
	private double bonus;

	public Executive() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Executive(String empName, double salary, double bonus) {
		super(empName, salary);
		// TODO Auto-generated constructor stub
		this.bonus = bonus;

	}

	@Override
	public void payslip() {
		super.payslip(); //employee's payslip
		System.out.println("Bonus: " + bonus);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() + bonus;
	}

	
}
