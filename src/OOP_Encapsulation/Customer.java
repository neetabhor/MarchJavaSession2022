package OOP_Encapsulation;

public class Customer {
	//POJO : plain old java object
	//POM : page classes :Encapsulation
	
	
	
	
	private String name;
	private int age;
	private boolean isActive;
	
	public Customer(String name, int age, boolean isActive) {
		this.name = name;
		this.age = age;
		this.isActive= isActive;
		
	}
	//getter and setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	

}
