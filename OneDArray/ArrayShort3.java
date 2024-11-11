// user input :
// 0,1,2 
import java.util.*;

public class ArrayShort3 {
    public static void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void shortArray(int a[]) {
        for (int i =a.length-1; i >=0; i--) {
            
        System.out.print(a[i]+" ");
    }
}

     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        // Get array elements from user
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        // Display array elements
        System.out.println("Array elements:");
        display(a);


        System.out.println("after the swap elements ");
        shortArray(a);
    }
}



