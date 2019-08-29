package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> o = new ArrayList<String>();
		//2. Add five Strings to your list
		o.add("A");
		o.add("B");
		o.add("C");
		o.add("D");
		o.add("E");
		//3. Print all the Strings using a standard for-loop
		for (int a = 0; a < o.size(); a++) {
			String b = o.get(a);
			System.out.println(b);
		}
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		int even = o.size()/2;
		for (int a = 0; a < even; a++) {
			System.out.println(o);
		}
		//6. Print all the Strings in reverse order.
		for (int a = o.size(); a < 0; a--) {
			String b = o.get(a);
			System.out.println(b);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		if (o.contains("e")) {
			System.out.println(o);
		}
	}
}
