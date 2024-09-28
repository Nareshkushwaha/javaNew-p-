public class CountVowels {

    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c', 'e', 'i', 'o', 'u', 'x', 'y', 'z'};
        int Count = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
                ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                Count++;
            }
        }

        System.out.println("Number of vowels in the array: " + Count);
    }
}


