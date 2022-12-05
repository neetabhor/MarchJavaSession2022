package OOP_Inheritance;

public class car extends Vehicle{

	public void start() {
		System.out.println("Car -- start");
	}
	
	public void stop() {
		System.out.println("Car -- stop");
	}
	
	public void refuel() {
		System.out.println("Car -- refuel");
	}
	public static void getPrice() {
		System.out.println("BMW -- get price");
	}
	
	private void info() {
		System.out.println("car -- info");
	}
	
}
