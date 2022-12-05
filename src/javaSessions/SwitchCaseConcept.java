package javaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		
		String name = "Rohit";
		
		switch (name) {
		case "Tom":
			System.out.println("10 marks");
			break;
		case "Neeta":
			System.out.println("20 marks");
			break;
		case "Sandeep":
			System.out.println("30 marks");
			break;	
		case "Akshay":
			System.out.println("40 marks");
			break;
			
		default:
			System.out.println("Student name is not found");
			break;
		}
		
		//
		
		String browser = "CHROME ";
		switch (browser.toLowerCase().trim()) { //Trim will remove the space , toLowerCase method converts a string to lower case letters
		case "chrome":
			System.out.println("Launch chrome");
			break;
			
		case "Mozilla":
			System.out.println("Launch mozilla");
			break;
			
		case "safari":
			System.out.println("Launch safari");
			break;
			
		default:
			System.out.println("please pass thw right browser..." + browser);
			break;
		}
		
		
		//use cases of switch case:
		//RBAC (Login)-> example of amazon -> admin, customer, seller, vendor, distributor
		//Environment -> QA, Dev, Staging,UAT,Prod
		int marks = 95;
		switch (marks) {
		case 100:
			if (marks >=95) {
			System.out.println("Grade A++");
			}
			break;
		case 90:
			System.out.println("Grade B");
			break;
		case 80:
			System.out.println("Grade C");
			break;
		default:
			System.out.println("Fail");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
