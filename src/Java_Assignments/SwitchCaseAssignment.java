package Java_Assignments;

public class SwitchCaseAssignment {

	public static void main(String[] args) {
		
		String role = "Admin";
		switch (role.toLowerCase().trim()) {
		case "Customer":
			System.out.println("Customer login");
			break;
		case "Admin":
			System.out.println("Admin login");
			break;
		case "Seller":
			System.out.println("Seller login");
			break;
		case "Vendor":
			System.out.println("Vendor login");
			break;
		case "Distributor":
			System.out.println("Distributor login");
			break;
	
		default:
			System.out.println("Give valid role");
			break;
		}
		
		//
		String environment = "QA";
		switch (environment.toLowerCase().trim()) {
		case "QA":
			System.out.println("Run on QA Environment");
			break;
		case "Dev":
			System.out.println("Run on Dev Environment");
			break;
		case "Staging":
			System.out.println("Run on Staging Environment");
			break;
		case "UAT":
			System.out.println("Run on UAT Environment");
			break;
		case "Prod":
			System.out.println("Run on Prod Environment");
			break;
	
		default:
			System.out.println("Give valid environment");
			break;
		}
		
		
		
		
		
		
	}

}
