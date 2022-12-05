package OOP_Encapsulation;

public class TestCustomer {

	public static void main(String[] args) {
		
		//POST (api call)
		Customer obj = new Customer("Neeta", 20 , true);
		
		//GET (API call)
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.isActive());
		
		
		// update : put (API call)
		obj.setName("Neeta bhor");
		obj.setActive(false);
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.isActive());
		
		
	}

}
