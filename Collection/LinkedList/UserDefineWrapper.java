package Collection.LinkedList;
import java.util.*;
class A {
    int a;
    String name;

    A(int a, String name) {
        this.a = a;
        this.name = name;
    }
}

public class UserDefineWrapper {
    public static void main(String[] args) {
        A p = new A(45, "hello");
        LinkedList<A> ll = new LinkedList<>();
        ll.add(p);
        for (A k : ll) {
            System.out.println(k.a + " " + k.name);
        }
    }
}