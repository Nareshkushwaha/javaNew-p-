// array :1,2,3,4,5,6,7,8,9,10 
// two parts : first part sum check :prime number 
// second part sum : check neon number

public class Arrayprime {
     public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("This is first part of array");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
       
        System.out.println("This is Second part of array");
        for(int i=5;i<a.length;i++){
            System.out.println(a[i]);
        }
     }
}
