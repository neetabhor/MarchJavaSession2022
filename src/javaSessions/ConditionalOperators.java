package javaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
			
		int a = 10;
		int b = 20;
		
		if(a==b) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		
		if(a>=10) {
			System.out.println("this is greater adn equal to 10	");
			
		}
		
		if(true) {
			System.out.println("Hi..");
		}
		else {							  //Dead code	
			System.out.println("bye..");  //Dead code
		}								//Dead code	
		
		if(false) {						//dead code 
			System.out.println("Hi..");
		}
		else {							  	
			System.out.println("bye..");  
		}	
		
		boolean flag = true;
		if(flag) {
			System.out.println("Hello selenium");
		}
		else {
			System.out.println("Bye selenium");
		}
		
		//nested if
		int marks = 95;
		if (marks <=100) {
			System.out.println("hi student");
			if(marks >=90) {
				System.out.println("Grade A");
			}
			else if(marks>=70) {
				System.out.println("Grade B");
			}
			else if(marks >=40) {
				System.out.println("Grade C");
			}
		}
		else {
			System.out.println("Wrong marks");
		}
		
		//if-else if
		int number = 25;
		if(number<=10) {
			System.out.println("hi");
		}
		else if (number<=20) {
			System.out.println("Hello");
		}
		else {
			System.out.println("bye");
		}
		
		//
		String name = "Neeta";
		if(name.equals("Tom")) {
			System.out.println("10 marks");
		}
		
		else if (name.equals("Neeta")) {
			System.out.println("20 marks");
		}
		else if (name.equals("Sandeep")) {
			System.out.println("30 marks");
		}
		else {
			System.out.println("Student is not found");
		}
		
		
		
		
	}

}
