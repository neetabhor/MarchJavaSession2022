package ContructorConcept;

public class LoginPage {

	String username;
	String password;
	//below is constructor
	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	//business  logic -> below is function
	public boolean doLogin() {
		System.out.println("Enter username : " + username);
		System.out.println("Enter Password : " + password);
		System.out.println("Click on sign in button");
		System.out.println("Home page is displayed");
		return true;
	}
	
	
	
	
	
}
