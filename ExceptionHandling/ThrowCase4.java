package ExceptionHandling;

public class ThrowCase4 {
    public static void main(String[] args) {
        System.out.println("hello");
        throw new ArithmeticException("hello");
        // compile time :unreachable statement error
    }
}