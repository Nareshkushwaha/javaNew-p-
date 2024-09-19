package oops;


 abstract  class A{
                      
    abstract void callme();

    void callmetoo(){
         System.out.println("This is abstract callmetoo");
    }
 }
  class B extends A{
         public void callme(){
             System.out.println("This is abstract  method callme");
         }
  }
public class AbstractDemo {
    
     public static void main(String args[]){
        B b=new B();
          b.callme();
          b.callmetoo();
     }

}
