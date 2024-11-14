package String;

public class Replacestring {
    public static void main(String[] args) {
        String original = "hello world";

        String replacedChar = original.replace('o', 'a');
        System.out.println(replacedChar); 
        
        String replacedSubstring = original.replace("world", "Java");
        System.out.println(replacedSubstring); 

        String replacedAll = original.replaceAll("[aeiou]", "*");
        System.out.println(replacedAll); 

        String replacedFirst = original.replaceFirst("o", "*");
        System.out.println(replacedFirst); 
    }
}