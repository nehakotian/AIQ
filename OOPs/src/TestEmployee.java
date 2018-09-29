import lti.emp.Employee;
import lti.emp.Executive;
import lti.emp.Manager;

public class TestEmployee {
	public static void main(String[] args) {
		// Employee emp = new Employee ("Polo", 5000);
		// emp.payslip();

		Executive exec = new Executive("Lili", 7000, 2000);
		// exec.payslip();
		showSalary(exec);

		Manager mgr = new Manager("Mili", 9000, 3000);
		// mgr.payslip();
		showSalary(mgr);
	}

	// Polymorphism(Employee act as manager as well as executive upon passing the
	// parameters..........)
	private static void showSalary(Employee emp) {
		if (emp instanceof Manager)   //RTTI-RUNTIME TYPE IDENTIFICATION
			System.out.println("Manager Salary: " + emp.getSalary());
		else
			System.out.println("Executive Salary: " + emp.getSalary());
	}

	// METHOD OVERLOADING
	/*
	 * private static void showSalary(Manager mgr) {
	 * System.out.println("Manager Salary: " + mgr.getSalary());
	 * 
	 * }
	 * 
	 * private static void showSalary(Executive exec) {
	 * System.out.println("Executive Salary: " + exec.getSalary()); }
	 */
}
