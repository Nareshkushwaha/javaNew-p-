package Collection.HashSet;

import java.util.*;

public class HashSetConstructor1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("hello");
        al.add("world");
        HashSet<String> hs = new HashSet<>(al);
        hs.add("hii");
        hs.add("bye");
        System.out.println(hs);
    }
}