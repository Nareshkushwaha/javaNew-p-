package ExceptionHandling;

public class ThrowsCase2{
    static void show() throws ArithmeticException, NullPointerException {
         System.out.println("Handle");
    }
    
     public static void main(String args[]){
          show();
     }
}
