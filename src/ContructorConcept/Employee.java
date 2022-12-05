package ContructorConcept;

public class Employee {

	//Class var
	String name;
	int age;
	String city;
	boolean isActive;
	
	public Employee() {
		System.out.println("This is defaul constructor...");
	}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Employee(String name, int age, boolean isActive) {

		this.name = name;
		this.age = age;
		this.isActive = isActive;
	}

	public Employee(String name, int age, String city, boolean isActive) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.isActive = isActive;
	}
	
	
	
	
	//Contructor:
	//It is not a funtion
	//can not return anything
	//no return type
	// no void
	//constructor name will be same as the class name
	//Constructor can be overloaded
	//Constructor will be called when you create the object of the class
	// Constructor is used to initialize the class variables with the constructor local variable using "this" keyword
	//constructor is used to restrict the unneccessary object creation
	// never write bussiness logic /feature logic inside the construcor
	//business logic should be writtern inside the functio
	
	
	
	
	
	
//	public Employee() { //zero parameter
//		System.out.println("Default constructor");
//	}
//	
//	public Employee(int a) { //1param
//		System.out.println("1 parametarised constructor : " +a);
//		
//	}
//	
//	public Employee(int a, int b) { //2param
//		System.out.println("2 parametarised constructor : " + (a+b));
//		
//	}
	
	
}
