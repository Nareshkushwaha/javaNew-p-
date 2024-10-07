package ExceptionHandling;

// public class FinallyArithemetic {
//     finally :
// ->it is also block 
// ->it always executed 

// try--->finally 
public class FinallyArithemetic {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } finally {
            System.out.println("always executed");
        }
    }
}

