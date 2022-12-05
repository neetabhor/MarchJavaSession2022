package Java_Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistAssignment {

	public static void main(String[] args) {
		
		ArrayList<String> stNames = new ArrayList<String>();
		stNames.add("Tom");
		stNames.add("Ravi");
		stNames.add("Chitra");
		System.out.println(stNames.size());
			
		Collections.reverse(stNames);
		for (String e : stNames) {
			System.out.println(e);
		}
		
	}
}