public class TwomaxMulti {
        public static void printArray(int[] arr) {
           for (int i=0;i<arr.length;i++) {
               System.out.print(arr[i] + " ");
           }
           System.out.println();
       }
   
       public static int findMaxProduct(int[] arr) {
           int maxProduct = 0;
   
           for (int i = 0; i < arr.length; i++) {
               for (int j = i + 1; j < arr.length; j++) {
                   int product = arr[i] * arr[j];
                   if (product > maxProduct) {
                       maxProduct = product;
                   }
               }
           }
   
           return maxProduct;
       }
           public static void main(String[] args) {
           int[] arr = {1, 3, 5, 7, 9};
   
           System.out.println("Array Elements:");
           printArray(arr);
   
           int maxProduct = findMaxProduct(arr);
   
           System.out.println("Maximum Product = " + maxProduct);
       }
   }
   

