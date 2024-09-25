 
//   package TwoDArray;

 public class TransposeArray {
    
    public static void PrintArray(int a[][]){
         for(int i=0;i<a.length;i++){
             for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
             }
             System.out.println();
         }
    }
    static int[][] Transpose(int a[][]) {
        int[][] ans = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ans[i][j] = a[j][i];
            }
        }
        return ans;
    }
     public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Orignal Array");
        PrintArray(a);
        System.out.println("After the transpose");
        int b[][] = Transpose(a);
        PrintArray(b);
    }
}

