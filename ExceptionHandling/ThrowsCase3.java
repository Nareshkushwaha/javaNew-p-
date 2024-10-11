package ExceptionHandling;

public class ThrowsCase3 extends RuntimeException{
    static void show() throws ThrowsCase3{
          System.out.println("This is method show");
    }
    public static void main(String args[]){
         show();
    }
}