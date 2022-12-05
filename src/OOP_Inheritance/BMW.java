package OOP_Inheritance;

public class BMW extends car{
	
	//Method overriding -> polymorphism (Runtime + dyanamic)
	//When you have a method in parent class as well as the same method in child class with 
	//1.the same name 
	//2.the same number of parameters 
	//3.the same type of parameters 
	//4.the same parameter sequence and the same return type then this is method overriding
	
	@Override  
	public void start() {
		System.out.println("BMW -- start");
	}
	
	@Override
	public void fuelReading() {
		System.out.println("Vehicle -- fuelReading");
	}
	
	public void Autoparking() {
		System.out.println("BMW -- Autoparking");
	}
	
	//static methods can not be overriden 
//	public static void getPrice() {
//		System.out.println("BMW -- get price");
//	}
//	
//	@Override  //private method can not be overriden
//	private void info() {
//		System.out.println("car -- info");
//	}
//	

}
