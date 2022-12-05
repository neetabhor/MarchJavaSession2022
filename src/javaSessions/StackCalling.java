package javaSessions;

public class StackCalling {
	
	public  void m1() {
		System.out.println("m1");
		m2();
		
	}
	
	public  void m2() {
		System.out.println("m2 method");
		m3();
		
	}
	
	public  void m3() {
		System.out.println("m3 method");
		m1();
	}
	
	
	
	

	public static void main(String[] args) {
		
		StackCalling obj =  new StackCalling();
		obj.m1();
		
	}

}
