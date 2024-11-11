import java.util.*;
public class Deepcopy2{
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
    
        int b[]=a.clone();
        display(a);
        display(b);
        a[2]=45;
        a[3]=34;
        display(a);
        display(b);
        
        
      
    }
}