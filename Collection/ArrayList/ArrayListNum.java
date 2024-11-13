package Collection.ArrayList;

import java.util.*;
public class ArrayListNum{
    public static void main(String arga[]){
       ArrayList al=new ArrayList();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size");
       int size=sc.nextInt();
       for(int i=0;i<size;i++){
           int x=sc.nextInt();
           al.add(x);
       }
       System.out.println(al);
    }
}