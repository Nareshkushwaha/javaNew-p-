package StringBuffer;

public class StringBufferBasic {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello world");
        System.out.println(sb);
        // string mutable (modify)
        // append method :predefine
        sb.append(" duniya");
        System.out.println(sb);
    }
}