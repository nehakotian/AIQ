
public class Vehicle {
	private String model;
	private String [] features;
	
	public Vehicle (String model, String... features) { //var-agrs--variable arguments!
		this.model=model;
		this.features=features;
	}

	public void specs() {
		System.out.println("Features of " + model);
		for(String f : features)
			System.out.println(f);
	}
	public static void main(String[] args) {
		//String[] af = {};
		Vehicle alto = new Vehicle("Alto","Power Steering", "Power Window");
		
		//String[] jf = { };
		Vehicle jazz = new Vehicle("jazz", "ABS","Pano Roof","Keyless","Airbags", "Cruise");
		
		alto.specs();
		jazz.specs();
}

}
