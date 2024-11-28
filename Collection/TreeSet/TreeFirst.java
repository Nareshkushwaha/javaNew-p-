package Collection.TreeSet;

// Java code to illustrate first() 
import java.util.*; 
import java.util.TreeSet; 

public class TreeFirst { 
	public static void main(String args[]) 
	{ 
		// Creating an empty TreeSet 
		TreeSet<Integer> tree = new TreeSet<Integer>(); 

		// Use add() method to add elements into the Set 
		tree.add(14); 
		tree.add(8); 
		tree.add(200); 
		tree.add(48); 
		tree.add(7); 
		tree.add(124); 

		// Displaying the TreeSet 
		System.out.println("TreeSet: " + tree); 

		// Displaying the lowest element of the set 
		System.out.println("The first element is: " + tree.first()); 
	} 
} 
