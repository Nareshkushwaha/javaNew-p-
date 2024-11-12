package String;

public class WordsCount  {
    public static void main(String[] args) {
        String str = "java is programming language and this is very good ";
        String[] words = str.split("\\s+");
        int count=0;
        
        for(int i=0;i<words.length;i++){
              count ++;
        }
        System.out.println(count);
    }
}