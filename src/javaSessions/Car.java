package javaSessions;

public class Car {
	
	String name;
	int price;
	String color;
	static final int wheels = 4; //common value
	
	
	
	public static void main(String[] args) {
		
		final int i =10; //local variable
		
		final int days = 7; //final keyword example
		//days = 10
		System.out.println(100* days);
				
		
		
		
		Car c1 = new Car();
		c1.name ="BMW";
		c1.price = 30;
		c1.color = "Black";
		//System.out.println(c1.wheels);
		//how to call static vars
		//1. Using class name:
		System.out.println(c1.name+ " " + c1.price+ " " +c1.color+ " " + Car.wheels);
		
		//2.Directly calling
		System.out.println(wheels);
		
		
		Car c2 = new Car();
		c2.name ="Audi";
		c2.price = 50;
		c2.color = "white";
		
		Car c3 = new Car();
		c3.name ="Honda";
		c3.price = 20;
		c3.color = "grey";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
