import java.util.*;
public class PrintArraySecond{

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
           
            array[i] = scanner.nextInt();
        }

        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            // System.out.print(array[i] + " ");
        }
    
        int temp = size;

        while(temp > 0){

            // Left Side
            for(int i = 1 ; i <= size ; i++){
                if(temp == size || i == 1 || i == temp){
                    System.out.print(i+ " ");
                }
                else System.out.print("  ");
            }
    

            // right Side
            for(int i = size-1 ; i >= 1 ; i--){
                
                if(temp == size || i == 1 || i == temp){
                    System.out.print(i+ " ");
                }
                else System.out.print("  ");
            }

            System.out.println();
            temp--;
        }
    }
}

