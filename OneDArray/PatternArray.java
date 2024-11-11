import java.util.Scanner;

public class PatternArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] array=new int[size];
         System.out.println("Enter the elements of the array:");
         for(int i=0;i<size;i++) {
            array[i]=sc.nextInt();
        }

        System.out.println("Array elements:");
        for (int i=0;i<size;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("\nStar pattern:");
        for(int i=0;i<size;i++) {
            for(int j=0;j<array[i];j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
