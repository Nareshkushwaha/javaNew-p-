package String;

public class EndsWithstring {
    public static void main(String[] args) {

        String str = "Hello, world!";

        String suffix1 = "world!";
        String suffix2 = "Hello";

        boolean endsWithSuffix1 = str.endsWith(suffix1);
        boolean endsWithSuffix2 = str.endsWith(suffix2);

        System.out.println("Does the string end with '" + suffix1 + "'? " + endsWithSuffix1); 
        System.out.println("Does the string end with '" + suffix2 + "'? " + endsWithSuffix2); 
    }
}
