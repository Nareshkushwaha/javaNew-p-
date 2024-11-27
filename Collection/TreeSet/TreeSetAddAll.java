package Collection.TreeSet;

import java.io.*;
import java.util.TreeSet;

public class TreeSetAddAll {
	public static void main(String args[])
	{
		// Creating an empty TreeSet
		TreeSet<String> tree = new TreeSet<String>();

		tree.add("Welcome");
		tree.add("To");
		tree.add("Geeks");
		tree.add("4");
		tree.add("Geeks");
		tree.add("TreeSet");

		System.out.println("TreeSet: " + tree);

		TreeSet<String> tree_two = new TreeSet<String>();
        tree_two.add("Hello");
		tree_two.add("World");
		tree.addAll(tree_two);
		
		System.out.println("TreeSet: " + tree);
	}
}
