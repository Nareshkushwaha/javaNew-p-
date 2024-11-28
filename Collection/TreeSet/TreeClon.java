package Collection.TreeSet;

import java.io.*; 
import java.util.TreeSet; 

public class TreeClon{ 
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

		TreeSet cloned_set = new TreeSet(); 

		cloned_set = (TreeSet)tree.clone(); 

		System.out.println("The cloned TreeSet: " + cloned_set); 
	} 
} 
