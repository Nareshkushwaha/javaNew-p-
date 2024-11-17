package String;

public class RemoveWhitespace {
    public static void main(String[] args) {
        String str = "Hello   World,   this   is   Java";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '\n' && str.charAt(i) != '\t' && str.charAt(i) != '\r') {
                result += str.charAt(i);
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("String without Whitespace: " + result);
    }
}
