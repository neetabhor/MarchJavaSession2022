package javaSessions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArraylistConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		System.out.println(ar);
		
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());
		System.out.println(ar);
		System.out.println("------------");

		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
		System.out.println(ar);
		System.out.println("------------");

		System.out.println("li = " +0);
		System.out.println("size :" +ar.size());
		System.out.println("hi:" +(ar.size()-1));
		System.out.println("------------");
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(3));
		System.out.println("-----------");

		
	//	System.out.println(ar.get(4));
		
//		ar.add(4,600);
//		System.out.println(ar.get(4));
//		
//		ar.add(1,1100);
//		System.out.println(ar.get(1));
//		
//		ar.remove(2);
//		System.out.println(ar.size());
//		System.out.println(ar.get(2));
		
		//print all the values from arraylist : for loop
		for (int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("-----------");
		for(Object e: ar) {
			System.out.println(e);
		}
	
		//Generies in arraylists:
		ArrayList<String> stNames = new ArrayList<String>();
		stNames.add("Tom");
		stNames.add("Ravi");
		stNames.add("Chitra");
		System.out.println(stNames.size());
		
		for (String e: stNames) {
			System.out.println(e);
			if(e.equals("Ravi")) {
				System.out.println("hii Ravi");
				break;
			}
			
		}
		System.out.println(stNames);
		
		//
		ArrayList<Integer> Marklist = new ArrayList<Integer>();
		Marklist.add(100);
		
		ArrayList<Double> pricelist = new ArrayList<Double>();
		pricelist.add(12.33);
		pricelist.add(100.00);
		
		ArrayList<Character> charlist = new ArrayList<Character>();
		
		//
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Sanjay");
		empData.add(30);
		empData.add(34.55);
		empData.add('m');
		empData.add(true);
		
		System.out.println(empData);
		for(Object e : empData) {
			System.out.println(e);
		}
		
		// in reveresed order
		for(int c = empData.size()-1;c>=0; c--) {
			System.out.println(empData.get(c));
		}
		
		//usecases:
		//Total number of links/images
		//Webelement
		//Dynamic dropdowns
		//footer list
		//topmenu list
		//child list
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
