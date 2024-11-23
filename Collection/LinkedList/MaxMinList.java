package Collection.LinkedList;

import java.util.*;

public class MaxMinList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(15);
        list.add(8);
        list.add(23);
        list.add(5);
        list.add(50);

        int max = list.get(0);
        int min = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            if (current > max) {
                max = current;
            }
            if (current < min) {
                min = current;
            }
        }
         System.out.println(list);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}