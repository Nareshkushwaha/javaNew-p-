package OneDArray;

public class DuplicatArray {
    
        public static void printDuplicateElements(int[] a) {
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        System.out.println(a[i] + " ");
                    }
                }
            }
        }
    
        public static void main(String[] args) {
            int[] a = {1, 5, 3, 4, 6, 3, 4};
    
            System.out.println("Duplicate elements: ");
            printDuplicateElements(a);
        }
    }
    

