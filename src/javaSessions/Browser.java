package javaSessions;

import java.util.Arrays;

public class Browser {
	
	public String[] getEmpDevices (String empName) {
		System.out.println("Employee name is :" + empName);
		String product [] = new String[5];
		
		if (empName.equalsIgnoreCase("Adi")) {
			product[0]= "Macbook Pro";
			product[1]= "Macbook air";
			product[2]= "iphone 12";
			product[3]= "ipad";
			product[4] = "Apple mouse";
			
		}
		else if (empName.equalsIgnoreCase("Prashant")) {
			product[0]= "Windows Dell";
			product[1]= "Samsung s9";
			product[2]= "Dell house";
		}
		else {
			System.out.println("emp name is not found..." + empName);
		}
		return product;
		
	}
	
	public static void main(String[] args) {
			
		Browser br = new Browser();
		String dev[]= br.getEmpDevices("Prashant");
		System.out.println(Arrays.toString(dev));
		
		
		
		
		
		
	}

}
