package javaSessions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		int i[] = new int [4];
		//li = 0
		//len =4
		//hi= len-1 ->3
		//len = hi+1 ->4
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		//i[4] = 50; //AIOB
		
		System.out.println(i[0]);
		System.out.println(i[0]+i[2]);
	//	System.out.println(i[4]); //Array out of bound exception 
	//	System.out.println(i[-1]);//Array out of bound exception 
		
		System.out.println("---------------");

		System.out.println("li = ;" +0);
		int len = i.length;
		System.out.println("length :"+ len);
		System.out.println("hi :" +(len-1));
		
		//To print the values from arrays : for loop
		for (int k=0; k<i.length;k++) {
			System.out.println(k + ":" +i[k]); //o/p  10 20 30 40
		}
		
		//for each loop
			System.out.println("---------------");
			int c =0;
			for(int e : i) {
				System.out.println(c+ ":" +e);
				c++;
			}
			
		//double array
			System.out.println("---------------");

			double d[] = new double[3];
			d[0] =12.33;
			d[1] = 23.44;
			d[2] =34.55;
			for (double e : d) {
				System.out.println(e);
				if(e == 23.44) {
				System.out.println("bye");
				break;

				}
			}
			System.out.println("---------------");

			for(int k =0; k<d.length;k++) {
				System.out.println(d[k]);
				if(d[k] == 23.44) {
					System.out.println("hii");
					break;
				}
			}
			
			System.out.println("---------------");
			
			char ch[] = new char [5];
			ch[0]= 'a';
			ch[1] = 'e';
			ch[2] = 'i';
			ch[3] = 'o';
			ch[4] = 'u';
			
			for(char e : ch) {
				System.out.println(e);
			}
			
			System.out.println(ch);
			int f[] = new int [3];
			f[0] = 100;
			f[1] = 200;
			f[2] =300;
			System.out.println(Arrays.toString(f));
			
			System.out.println("---------------");

			//String Array:
			String names [] = new String [3];
			names[0]= "Neeta";
			names[1] = "Sandeep";
			names[2] = "Nisa";
			
			for(String e : names) {
				System.out.println(e);
			}
			System.out.println("---------------");

			//
			for(int p =0; p<names.length; p++) {
				System.out.println(names[p]);
				
			//
			System.out.println("---------------");
				
			for (int p1 =names.length-1; p1>=0; p1--) {
				System.out.println(names[p1]);
			}
			}
			
			System.out.println("---------------");

			Object emp[] = new Object[5];
			emp[0]= "shifa";
			emp[1]= "25";
			emp[2]= "f";
			emp[3]= "12.33";
			emp[4]= "true";
			
			for(Object e : emp) {
				System.out.println(e);
			}
			System.out.println("---------------");

			//Array literals: static array
			int num[] = {12,2,3,4,100,12};
			System.out.println(num.length);
			System.out.println(num[5]);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
	}

}
