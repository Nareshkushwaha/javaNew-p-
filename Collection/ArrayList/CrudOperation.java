package Collection.ArrayList;

import java.util.*;

public class CrudOperation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Initial List: " + list);

        list.add(50);
        System.out.println("Create: " + list);

        System.out.println("Read: " + list);

        list.set(2, 35);
        System.out.println("Update: " + list);

        list.remove(1);
        System.out.println("Delete: " + list);
    }
}