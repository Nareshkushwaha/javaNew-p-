import java.util.*;
public class BinarySearch{
     public static void main(String args[]){
         int a[]={2,5,7,9,12,14,16,17,20,24,28};
         int target=5;
         int li=0;
         int hi=a.length-1;
         int mi=(li+hi)/2;
         
         while(li<=hi){
             
         
          if(a[mi]==target){
              System.out.println("elements found at "+ mi+" index posttion");
              break;
          }
          else if(a[mi]<target)
          {
              li=mi+1;
          }
          else {
               hi=mi-1;
          }
          
          mi=(li+hi)/2;
     }
     if(li>hi){
         System.out.println("elements not found");
     }
}
}