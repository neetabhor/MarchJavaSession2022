package javaSessions;

public class CustomerFunctions {
	
	//function can not be created inside a function
	//function should be independent to each other
	
	//1.no input and no return:
	//void : does not return anything (no return keyword)
	public void test() {
		System.out.println("test method...");
		}
	//return type : void
	public void testing() {
		System.out.println("testing method..");
		int a = 10;
		int b = 20;
		int c = 30;
		int sum = a+b+c;
		System.out.println(sum);
	}
	
	//2. no input but some return:
	//return type : integer
	public int getMarks() {
		System.out.println("get marks..");
		int marks = 100;
		int bonus = 50;
		int TotalMarks = marks + bonus;
		return TotalMarks;
		
	}
	public String getName() {
		System.out.println("Get name...");
		String name = "Tom";
		return name;
		
	}
	
	public char getChar() {
		System.out.println("Get char value...");
		char c = 'a';
		return c;
		
	}
	
	//3. Some input some return
	//return type: int 
	//parameters:  
	public int sum(int a, int b) {
		System.out.println("sum method");
		int z = a+b;
		return z;
		
	}
	
	//WAF (write a function)-> name -> getStudentMarks
	//input parameter  : Student name (String)
	//return :marks of the student ->  int
	public int getStudentMarks (String studentName) {
		System.out.println("Getting marks for Student name : " +studentName);
		int marks = -1;
		
		if (studentName.equals("Vani")) {
			marks= 90;
		}else if (studentName.equals("Ria")) {
			marks= 95;
		}else if (studentName.equals("Sandeep")) {
			marks= 100;
		}if (studentName.equals("Naveen")) {
			marks= 10;
		}else {
			System.out.println("please pass the right student name.." +studentName);
			}
		return marks;
		
	}
	 
	
	
	
	public static void main(String[] args) {
		//call the function: create the object of this class:
		CustomerFunctions obj = new CustomerFunctions();
		
		int mk =obj.getStudentMarks("Tom");
		System.out.println(mk);
		
		obj.test();
		obj.testing();
	//	System.out.println(obj.getMarks());
		 
		int m = obj.getMarks();
		System.out.println(m);
		
		String str = obj.getName();
		System.out.println(str);
		
		char ch = obj.getChar();
		System.out.println((int)ch);
		
		int sum =obj.sum(40, 50);
		System.out.println(sum);
		
	}

}
