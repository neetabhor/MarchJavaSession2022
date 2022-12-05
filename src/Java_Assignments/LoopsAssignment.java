package Java_Assignments;

public class LoopsAssignment {

	public static void main(String[] args) {
		//For loop assignment
		// print 10 to 1
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}

		//while loop
		//print odd number between 1 to 100
		System.out.println("----------------");

		int k=1;
		while(k<=100) {
			if(k % 2 == 1) {
				System.out.println(k);
			}
			k++;
		}
		
		System.out.println("----------------");
		//while loop
		//print 10 to 1
		int i=10;
		while(i>0) {
			System.out.println(i);
			i--;
		}
		System.out.println("----------------");

		for(i=1; i<=100;i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if(i % 3 == 0)
			{
				System.out.println("Fizz");
			}
			else if (i % 5 == 0)
			{
				System.out.println("Buzz");
			}
			else 
			{
				System.out.println(i);
			}
		}
		//Alternative way to print fizz and Buzz
		System.out.println("----------------");
		
		for(i=1; i<=100;i++) 
		{
			String s = "";
			if (i % 3 == 0) {
			 s= "Fizz";
			}
			if (i % 5 == 0) {
				s = s+"Buzz";
			}
			if (s.isEmpty()) {
				System.out.println(i);
			}
			else {
				System.out.println(s);
			}
			
		}
		
	//print prime number between given range
		
		
	
		
		
		
	}

}
