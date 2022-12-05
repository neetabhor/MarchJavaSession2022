package OOP_Encapsulation;

public class AppLogin {
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void doLogin() {
		
		System.out.println("username : " + username);
		System.out.println("Password : " + password);
		System.out.println("User is logged in");
		
		
	}
	
	
	
}
