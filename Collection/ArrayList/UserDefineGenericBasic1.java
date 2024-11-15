package Collection.ArrayList;
import java.util.*;
class B {
    int a;

    B(int a) {
        this.a = a;
    }
}




public class UserDefineGenericBasic1 {
    public static void main(String[] args) {
        B k = new B(67);
        ArrayList<B> al = new ArrayList<>();
        al.add(k);
        for (B l : al) {
            System.out.println(l.a);
        }
    }
}