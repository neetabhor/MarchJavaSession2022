package OOP_Encapsulation;

import java.util.ArrayList;

import Java_Assignments.ArraylistAssignment;
import javaSessions.User;

public class EmpTest {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setName("Garima");
		e.setAge(20);
		e.setCity("Pune");
		
		String name = e.getName();
		System.out.println(name);
		
		String empData = e.getEmpData();
		System.out.println(empData);
		
		
		//user
		Users u1 = new Users();
		u1.name = "Tom";
		u1.age = 20;
		u1.setSalary(23.33);
		
		ArrayList<String> devList = new ArrayList<String>();
		devList.add("macbook pro");
		devList.add("iphone 12");
		u1.setDeviceList(devList);
		System.out.println(u1.name + " " + u1.age+ " " + u1.getSalary()+ " " + u1.getDeviceList());
		
		//login
		AppLogin app = new AppLogin();
		app.setUsername("Admin@gmail.com");
		app.setPassword("Admin@123");
		
		app.doLogin();
		
		
		
	}

}
