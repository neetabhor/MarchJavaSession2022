package javaSessions;

public class Employee {
	
	String name;
	int age;
	double salary;
	boolean isPermanent;
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(); //e1 is object refrence name... RHS(new employee is object)
		e1.name = "Tom";
		e1.age =  20;
		e1.salary = 12.33;
		e1.isPermanent = true;
		
		System.out.println(e1.name+ " " +e1.age + " " +e1.salary + " " +e1.isPermanent );
		
		Employee e2 = new Employee();
		e2.name ="Sandeep";
		e2.salary = 15.32;
		System.out.println(e2.name+ " " +e2.age + " " +e2.salary + " " +e2.isPermanent );

		//No object reference
		new Employee();
		new Employee().name = "Neeta";
		
		
		//null ref type object
		
		Employee e3 = new Employee();
		e3 = null;
		e3.name = "lisa"; //null pointer exceptions
		System.out.println(e3.name);
		
	
	}

}
