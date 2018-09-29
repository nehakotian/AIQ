
public class Person implements Cloneable {
	private String name;
	private int age;
	
	public Person() {
		/*name="Anonymous";// Here we are duplicating the values again and again which is breaking a constructor rule 
		age=-1;
		*/
		this("Anonymous",-1); //constructor chaining
	}
	
	public Person(String name, int age) {
		super();
		this.name = name; //this means current object
		this.age = age;
	}
	
	public void print() {
		System.out.println("Name: " + name + "\tAge: "+age);
	}
	
	
	
	@Override
	public String toString() {
		return "Name: " + name + "\tAge: "+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		if(obj instanceof Person ) {
			Person p = (Person)obj;
			if(p.name.equals(this.name) && p.age == age)
				return true;
		}
		return false;
	}

	
	
	
	@Override
	public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Person is no more");	
		}

	public static void main(String[] args) throws CloneNotSupportedException  {
		Person p1 = new Person();
		Person p2 = (Person) p1.clone();
		System.out.println(p2);
		
		/*Person p = null;
		for (int c = 1; c <=5; c++) 
			p = new Person();
			
		System.gc();
		*/
		
		
		/*Person p1=new Person("Polo",21);
		Person p2=new Person("Polo", 21);
		
		System.out.println(p1.equals(p2));*///it will return false bcoz it compares hashcode
		
		/*System.out.println(p1.hashCode());
		System.out.println(p1);  //implicitly calls toString()
*/		/*p1.print();
		
		Person p2=new Person();
		p2.print();*/
		
		
	}

	
}
