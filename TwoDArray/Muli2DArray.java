public class Muli2DArray {
    
     public static void PrintArray(int a[][]){
         for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
         }
     }

     static void multiply(int a[][] ,int b[][]){
        int multi[][]=new int[3][3];
         for(int  i=0;i<3;i++){
             for(int j=0;j<3;j++){
                 for(int k=0;k<3;k++){
                    multi[i][j]+=a[i][j]*b[k][j];
                 }
             }
         }
         PrintArray(multi);
     }
     public static void main(String args[]){
         int a[][]={{1,2,3},{4,5,6},{7,8,9}};
         int b[][]={{1,2,3},{4,5,6},{7,8,9}};
         System.out.println("Orignal Array");
         PrintArray(a);
         System.out.println("after Multiply array");
         multiply(a,b);
        }
     }

