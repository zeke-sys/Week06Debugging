package week06;

import java.util.ArrayList;
import java.util.List;

public class DebuggingExample {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		addNames(names);
		int index = findIndexOfName(names, "Tommy");
		System.out.println(index);
		
		
	} //end of main
	
	
	//methods
		
		
	private static void addNames(List<String> names) {
		names.add("Sam");
		names.add("Tommy");
		names.add("Hilary");
		names.add("Joan");
	}
	
	private static int findIndexOfName(List<String> names, String name) {
		int index = -1;
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}
		
		
		

} //end of class
