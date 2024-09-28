public class Searchmatrix {
    public static void printMatrix(int a[][]) {
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void searchMatrix(int a[][], int target) {
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a[i].length;j++) {
                if (a[i][j] == target) {
                    System.out.println("this is target value  "+ "("+i + " ,"+ j+")");
                    return;
                }
            }
        }
        System.out.println("Target not found in matrix");
    }

    public static void main(String[] args) {
        int a[][] = {{1, 3, 5}, {7, 9, 11}, {13, 15, 17}};
        int target = 9;

        System.out.println("Matrix:");
        printMatrix(a); 
        searchMatrix(a, target);
    }
}

