package Collection.LinkedList;

import java.util.*;

public class CrudOperation {
    public static void main(String[] args) {
        LinkedList<Integer> al1 = new LinkedList<>();
        
        al1.add(687);
        al1.add(89);
        al1.add(98);
        System.out.println("After creation: " + al1);

        System.out.println("Current list: " + al1);

        al1.set(2, 74323);
        System.out.println("After update: " + al1);

        al1.remove(1);
        System.out.println("After deletion: " + al1);

        System.out.println("Final list: " + al1);
    }
}
