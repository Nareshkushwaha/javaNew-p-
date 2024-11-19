package Collection.LinkedList;

import java.util.*;

public class LinkedListPrintLoops {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("hello");
        ll.add("hiii");
        ll.add("byee");

        // For loop using size method
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
        System.out.println();

        System.out.println("For each loop:");
        // For each loop
        for (String s : ll) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("Iterator through:");
        // Iterator
        Iterator<String> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        System.out.println("List iterator through:");
        // List iterator
        ListIterator<String> litr = ll.listIterator();
        while (litr.hasNext()) {
            System.out.print(litr.next() + " ");
        }
        System.out.println();

        System.out.println("Backward:");
        while (litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");
        }
        System.out.println();

        System.out.println("Var:");
        // For-each with var (Java 10+)
        // for (var i : ll) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();

        System.out.println("Object class:");
        // For-each with Object
        for (Object o : ll) {
            System.out.print(o + " ");
        }
    }
}
