
import java.util.*;

public class Max2dArray {
    public static void main(String args[]) {
        int max = 0;
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 7}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
              for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) 
            {
                if (a[i][j] > max)
                { 
                    max = a[i][j];
                }
            }
        }

        System.out.println("Maximum value: " + max);
    }
}
