package String;


public class DuplicateWords {
    public static void main(String[] args) {
        String str = "Java is a programming language Java is platform independent";
        String[] words = str.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            int count = 0;
            String positions = "";

            for (int j = 0; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    count++;
                    positions += (j + 1) + " ";
                }
            }

            if (count > 1) {
                System.out.println("Word: " + words[i] +", Count: " + count +", Positions: " + positions);
            }
        }
    }
}

