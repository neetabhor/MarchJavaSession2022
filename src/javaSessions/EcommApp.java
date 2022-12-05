package javaSessions;

public class EcommApp {
	
	//method overloading 
	public void test() {
		System.out.println("test method..");

	}
	public void test(int a) {
		System.out.println("test method.." +a);
		
	}
	public void test(int a, int b) {
		System.out.println("test method.." +a+b);

	}
	
	public void test(String  a, int b) {
		System.out.println("test method.." +a+b);

	}
	
	public void test(int a, String b) {
		System.out.println("test method.." +a+b);

	}
	
	//usecase
	//amazon :login 
	public void dologin (String un, String pwd) {
		
	}
	
	public void dologin(String un, String pwd, String role) {
		
	}
	
	public void dologin(String un, String pwd, String ph, int otp) {
		
	}
	//Search();
	public void search (String productName) {
		
	}
	
	public void search (String productName,String brandName) {
		
	}
	
	public void search (String productName,String brandName, int price) {
		
	}
	
	public void search (String productName,String brandName, int price, String color) {
		
	}
	
	//Payment:
	public void makePayment(String cc,int cvv) {
		
	}
	
	public void makePayment(String cc,int cvv, int otp) {
		
	}
	
	public void makePayment(String cc,String pwd) {
		
	}
	public void makePayment(String upi) {
		
	}
	
	//Booking
	public void booking (String stPoint, String endPoint) {
		
	}
	
	public void booking (String stPoint, String endPoint, String carType) {
		
	}
	public void booking (String stPoint, String endPoint, String carType, int passegers) {
		
	}
	public void booking (String stPoint, String endPoint, String paymentType, String couponCode) {
		
	}
	
	public static void main(String[] args) {
		
		EcommApp obj = new EcommApp();
		obj.test(10);	//call by value/pass by value
		obj.test(10, "Neeta");
		obj.dologin("admin", "admin");
		
	}

}
