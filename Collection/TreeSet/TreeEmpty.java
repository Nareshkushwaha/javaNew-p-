package Collection.TreeSet;

import java.util.*; 
import java.util.TreeSet; 

public class TreeEmpty { 
	public static void main(String args[]) 
	{ 
		TreeSet<String> tree = new TreeSet<String>(); 

		tree.add("Welcome"); 
		tree.add("To"); 
		tree.add("Geeks"); 
		tree.add("4"); 
		tree.add("Geeks"); 
		tree.add("TreeSet"); 

		System.out.println("TreeSet: " + tree); 

		System.out.println("Is the set empty? " + tree.isEmpty()); 

		tree.clear(); 

		System.out.println("Is the set empty? " + tree.isEmpty()); 
	} 
} 
