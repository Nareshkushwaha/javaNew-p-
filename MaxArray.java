import java.util.*;
public  class MaxArray{
     public static void main(String args[]){
         int a[]={1,2,3,8,5,6,7};
          int max=0;
           for(int i=0; i<a.length; i++)
           {
             if (a[i] > max) 
                max = a[i];
            }

                   System.out.print(max);
               }
           }
     