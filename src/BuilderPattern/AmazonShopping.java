package BuilderPattern;

public class AmazonShopping {

	public static void main(String[] args) {
		
		AmazonApp obj = new AmazonApp();
		obj.doLogin("Navven@gmail.co" , "navven@123")
			.doSearch("Macbookpro")
				.addToCart("macbookpro")
					.makePayment("1211 1234 1235 5431", 123)
						.generateOrderID().logout();
			
		System.out.println("--------------");
		
	//
		obj.doLogin("Navven@gmail.co" , "navven@123")
		.doSearch("Nike shoes", 5000, "XYZ")
			.addToCart("Nike shoes")
					.generateOrderID().logout();
			
		
		System.out.println("--------------");
		
		obj.doLogin("Navven@gmail.co" , "navven@123")
		.doSearch("iphon13 pro")
					.generateOrderID().logout();
		
		System.out.println("--------------");
		
		obj.doLogin("Navven@gmail.co" , "navven@123")
					.generateOrderID().logout();
		
		System.out.println("--------------");
		
		obj.doLogin("Navven@gmail.co" , "navven@123").logout();
		
		System.out.println("--------------");
		
		obj.doLogin("Navven@gmail.co" , "navven@123");
		
	}

}
