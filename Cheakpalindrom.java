public class Cheakpalindrom {
        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    
        public static void PalindromeArray(int[] arr) {
            int left = 0;
            int right = arr.length - 1;
            boolean Palindrome = true;
    
            while (left < right) {
                if (arr[left] != arr[right]) {
                    Palindrome = false;
                    break;
                }
                left++;
                right--;
            }
    
            System.out.println("Is Palindrome: " + Palindrome);
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 2, 1};
    
            System.out.println("Array: ");
            printArray(arr);
    
            PalindromeArray(arr);
        }
    }

