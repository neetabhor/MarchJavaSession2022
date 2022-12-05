package javaSessions;

public class Users {
	
	String name;
	static int age;
	
	
	public void getmail() {
		System.out.println("Get mail method....");
	}
	
	public static void sendmail() {
		System.out.println("Send mail Method...");
	}
	

	public static void main(String[] args) {
		
		User u1 = new User();
		//1. how to call non static methods and variables -> need to create object
		
		Users obj = new Users();
		obj.name = "Neeta";
		obj.getmail();
		
		obj.age = 27;
		obj.sendmail();
		
		//2.Direct calling..
		age =30;
		System.out.println(age);
		sendmail();
		
		
		
		//3. how to call static methods and variables -> No need to create object
		//a. by using classname
		Users.age = 20;
		Users.sendmail();
		
	}

}
