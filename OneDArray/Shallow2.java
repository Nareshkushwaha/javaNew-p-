// int a[]
// b[]=a
// c[]=b
// d[]=c
// e[]=d 

// shallow copy and deep copy 

import java.util.*;
public class Shallow2{
    static void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("this is array second");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
    
        display(a);
        System.out.println("This is arra b");
        int b[]=(a);
        display(b);
        System.out.println("This is array C");
        int  c[]=(b);
        display(c);
        System.out.println("this  is arry d");
        int d[]=(c);
        display(d);
        System.out.println("This is array e");
        int e[]=(d);
        display(e);

        System.out.println("After the clone method use in  deep copy");

         
       
        
        
      
    }
}