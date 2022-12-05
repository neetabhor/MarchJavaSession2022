package javaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		//1.For Loop
		//print 1 to 10
		for(int j=1; j<=10; j++) {
			System.out.println(j);
		}
		
		System.out.println("------");

//		for(;;) {
//			System.out.println("Bye!!");
//		}
		
		System.out.println("------");
		for(byte b = 1; b<=5; b++) {
			System.out.println(b);
		}
		
		System.out.println("------");
		for(double d = 1.0; d<=10.0; d++) {
			System.out.println(d);
		}
		
		System.out.println("------");
		for(char c = 'A'; c<='Z'; c++) {
			System.out.println(c+ " : "+ (int)c);
		}
		//use cases:
			//number of interations are fixed
			//array/arraylist
			//drop downs -- month, year
			//20 elements -- text
			//window handling --> while, for
			//web elements
		
		
		//2.while loop
		
		//1 to 10:
				
		int i = 1;
			while(i<=10) {
				System.out.println(i);//12345678910
				i++;
					//i = i+1;
					//++i;
				}
				
				boolean flag = false;
				int i1 = 11;
				while(i1<=100 && i1>=10) {
					System.out.println(i1);
					i1++;
				}
				
				//infinite loop:
//				while(true) {
//					System.out.println("Welcome to Hotel Taj !!");
//				}
//				
				//even numbers 1 to 100:
				System.out.println("------");
				int k = 1;
				while(k<=100) {
					//System.out.println(k);
						if(k % 2 == 0) {
							System.out.println(k);
							//break;
						}
					k++;	
				}
				System.out.println("------");
				
				//use cases:
				//number of interations are not fixed
				//pagination
				//calendar
				//carousel
				//lazy loading scrolling
				//WebElement wait logic
		
		//3. do-while loop
			//print 1 to 10 numbers
			System.out.println("------");

				int p =1;
				do {
					System.out.println(p);
					p++;
				}while(p<=10);
				
				//Usecases
				//Waiting for the element to be appeared on the page.
				//
				
				
				
				
				
				
				
				
				
				
		
	}

}
