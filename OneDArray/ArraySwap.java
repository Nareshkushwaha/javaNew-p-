import java.util.*;
public class ArraySwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int temp = arr[0];
        arr[0] = arr[n - 1];
        arr[n - 1] = temp;

        System.out.println("Array after swapping first and last elements: " + Arrays.toString(arr));
    }
}
