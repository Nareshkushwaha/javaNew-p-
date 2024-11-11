public class ArrayShort2 {
        public static void display(int a[]) {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }
    
        public static void SortZero(int a[]) {
            //{ 0, 1, 0, 1, 0, 1, 1, 0, 1 };
            // length
            int n = a.length;
            // count zero :
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == 1) {
                    count++;
                }
            }
            for (int i = 0; i < n; i++) {
                if (i < count) {
                    a[i] = 1;
                } else {
                    a[i] = 0;
                }
            }
            display(a);
        }
    
        public static void main(String[] args) {
            int a[] = { 0, 1, 0, 1, 0, 1, 1, 0, 1 };
            SortZero(a);
        }
    }
    

