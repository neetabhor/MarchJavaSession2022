package javaSessions;

import java.util.Arrays;

public class BrowserAl {
	
	public String[] getempDevices(String employeeName) {
		System.out.println("Employee name is " + employeeName);
		
		if(employeeName.equalsIgnoreCase("Manisha")) {
			String product[] = {"Macbook pro", "Macbook air", "iphone12"};
			return product;
		}
		
		else if(employeeName.equalsIgnoreCase("Kiran")) {
			String product[] = {"Windows", "Dell"};
			return product;
		}
		else {
			System.out.println("Emp name is not found.." +employeeName);
			return null;
		}
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		BrowserAl br = new BrowserAl();
		String dev[]= br.getempDevices("navven");
		System.out.println(Arrays.toString(dev));
	}

}
