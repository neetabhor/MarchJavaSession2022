package javaSessions;

import java.util.ArrayList;

public class Companyfuntion {
	
	//WAF : getBrowserInfo()
	//input param: browserName(String)
	//return : some broswer information (name, version, vendor)
	
	public ArrayList<Object> getBrowserInfo(String browserName) {
		System.out.println("Getting info for browser: " + browserName);
		ArrayList<Object> browserInfoList = new ArrayList<Object>();
		
		if(browserName.trim().equalsIgnoreCase("chrome")) {
			browserInfoList.add("Google chrome");
			browserInfoList.add(99.99);
			browserInfoList.add("Google Inc");
		}
		else if(browserName.trim().equalsIgnoreCase("Firebox")) {
			browserInfoList.add("Mozilla firefox");
			browserInfoList.add(89.998);
			browserInfoList.add("Mozilla Inc");
		}
		else if(browserName.trim().equalsIgnoreCase("Safari")) {
			browserInfoList.add("Apple safari");
			browserInfoList.add(7.98);
			browserInfoList.add("Apple pvt ltd");
		}
		else {
			System.out.println("Browser name is not found");
		}
		return browserInfoList;
		
	}

	//cross browser logic
	//WAF  : launch broswer -> input parameter -> browserName (String)
	//boolean -> true/false
	
	public boolean isBrowserLaunched(String browserName) {
		System.out.println("browser name : " + browserName);
		boolean flag = false;
		
		switch (browserName.toLowerCase()) {
		case "chrome":
			System.out.println("chrome is launched");
			flag = true;
			break;
		
		case "firefox":
			System.out.println("Firefox is launched");
			flag = true;
			break;
			
		case "safari":
			System.out.println("Safari is launched");
			flag = true;
			break;	
		default:
			System.out.println("Browser is not found..." + browserName);
			break;
		}
		
		return flag;
		
	}
	

	public static void main(String[] args) {
		Companyfuntion comp = new Companyfuntion();
		if (comp.isBrowserLaunched("ie")) {
			System.out.println("Enter url....");
		}
		
		
		
		
		
		ArrayList<Object> brList = comp.getBrowserInfo("Chrome");
		System.out.println(brList);
	}

}
