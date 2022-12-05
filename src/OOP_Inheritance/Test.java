package OOP_Inheritance;

public class Test {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.stop(); // overriden
		b.start();//inherited
		b.refuel();//inherited
		b.Autoparking(); //individual
		b.engine();
		b.fuelReading();//overriden
		BMW.getPrice();
		
		
		
		
		car c = new car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		c.fuelReading();//inherited
		
		
		//top casting :
		// child class object can be referred by parent class ref variable
		car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		car c2 = new Audi();
		
		// child class object can be referred by parent class ref variable

		Vehicle v1 =new BMW();
		v1.engine();
		
		
		//down casting
		//parent class object is referred by child class reference variable?
		//BMW b1 = (BMW)new car();// classcastException -- runtime
		//b1.start();
		
		
		
	}

}
