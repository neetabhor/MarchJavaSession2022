package OOP_Encapsulation;

public class Browser {
	
	public void launchChrome() {
		System.out.println("Launching chrome.....");
		checkRAM();
		checkOsCompatible();
		checkNetworkConnection();
		checkBroswerVersion();
		
		System.out.println("Chrome is launched....");
		
		
	}
	
	private void checkRAM() {
		System.out.println("Check RAM");
		
	}
	
	private void checkOsCompatible() {
		System.out.println("Check OS");
		
	}
	
	private void checkNetworkConnection() {
		System.out.println("check Network");
	}
	
	private void checkBroswerVersion() {
		System.out.println("Check version");
	}
	
	
	
	
	
}
