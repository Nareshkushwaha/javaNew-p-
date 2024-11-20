
 package Collection.LinkedList;
 import java.util.*;
class A{
     String name;
     int a;
     A(String name,int a){
          this.a=a;
          this.name=name;
     }
}
 public class UserDefineGenric{
      public static void main(String ars[]){
            A b=new A("hello",45);
            A p=new A("hii",78);
            A u=new A("by",74);                 
            LinkedList<A> ll=new LinkedList<>();
            ll.add(b);
            ll.add(p);
            ll.add(u);
           //  System.out.println(ll);
             for(  A  i: ll){
                  System.out.println(i.name+" "+i.a+" ");
             }

            
      }
 }