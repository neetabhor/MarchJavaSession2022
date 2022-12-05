package ContructorConcept;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Arrays;

import javaSessions.User;

public class EmpTest {

	public static void main(String[] args) {
		
		Employee e = new Employee("Naveen");
		System.out.println(e.name);
		
		Employee e1 = new Employee("Tom" , 30);
		System.out.println(e1.name + " " + e1.age + " " + e1.isActive + " " + e1.city);
		
		Employee e2 = new Employee("Peter" , 30 , false);
				
		Employee e3 = new Employee("Lisa" , 45, "Pune", true);
		
		LoginPage lp = new LoginPage("admin@gmail.com " , "admin@123");
		lp.doLogin();
		
		System.out.println("------------");
		LoginPage lp1 = new LoginPage("neeta@myrsa.co", "Neeta@123");
		lp1.doLogin();
		
		
		//customer
		Customer c1= new Customer("Sandeep", 100);
		System.out.println(c1.name + " " + c1.id + " " + c1.phone + " " + c1.cardsList);
		
		ArrayList<String> shiftCCList = new ArrayList<String>();
		shiftCCList.add("HDFC CC 12121212");
		shiftCCList.add("SBI AA 212121212");
		
		Customer c2= new Customer("Raavi", 200, "01-01-1990" ,  "9762388879" , "Banglore" , true , shiftCCList);
		System.out.println(c2.cardsList);
		System.out.println(c2.name + " " + c2.id + " " + c2.cardsList);
		
		//student
		Student s1 = new Student("Saurabh");
		Student s2 = new Student("Swapna" , 101);
		System.out.println(s2.name + " " + Arrays.toString(s2.subject));

		
		
		String sub[] = {"chem" , "Maths", "bio", "English", "Physics"};
		Student s3 = new Student("Arzoo" , 102, sub);
		
		System.out.println(s3.name + " " + Arrays.toString(s3.subject));
		
		
	
		
		
		
		
		
		
		
		
		
		
		
//		if(lp.doLogin(lp.username, lp.password)) {
//			System.out.println("Search the product....");
//		}
//		
//		LoginPage lp1 = new LoginPage("neeta@myrsa.co", "Neeta@123");
//		boolean flag = lp1.doLogin(lp1.username, lp1.password);
//		System.out.println(flag);
		
		
		
		
	}

}
