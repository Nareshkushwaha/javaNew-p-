



public class SecondMaxArray {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int max = 0;
        int smax =0;

        // Find maximum value
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                smax = max;
                max = a[i];
            } else if (a[i] > smax && a[i] != max) {
                smax = a[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Second Maximum: " + smax);
    }
}


