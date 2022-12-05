package BuilderPattern;

public class AmazonApp {

	public AmazonApp doLogin () {
		System.out.println("Login to app");
		return this;
	}
	
	public AmazonApp doLogin(String un, String pwd) {
		System.out.println("Login to app : "+ un + " " + pwd);
		return this;

	}
	
	public AmazonApp doSearch(String productName) {
		System.out.println("Search the product" + productName);
		return this;

	}
	
	public AmazonApp doSearch(String productName, int price) {
		System.out.println("Search the product" + productName + " : " + price);
		return this;

	}
	
	public AmazonApp doSearch(String productName, int price, String seller) {
		System.out.println("Search the product" + productName + " " + price + ": " + seller);
		return this;

	}
	
	public AmazonApp addToCart(String productName) {
		System.out.println("Add to cart :" + productName  );
		return this;

	}
	
	public AmazonApp makePayment(String cc, int cvv) {
		System.out.println("Making payment : " + cc + " " + cvv);
		return this;

	}
	
	public AmazonApp makePayment(String upi) {
		System.out.println("Making payment : " + upi);
		return this;

	}

	public AmazonApp generateOrderID() {
		System.out.println("Your oder id is : " + 123456);
		return this;

	}
	
	public AmazonApp logout() {
		System.out.println("Logout...");
		return this;

	}	
	
	
	
	
}
