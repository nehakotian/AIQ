package sam;

public class TestEmployee {

	public static void main(String[] args) {
		Employee d10=() -> 10;
		d10.showDepartment();
		
		Employee d20= () -> 20;
		d20.showDepartment();

	}

}
