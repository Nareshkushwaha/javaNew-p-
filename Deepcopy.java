public class Deepcopy {
    static void display(int a[]){
     for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
     }
     System.out.println(" ");
}
public static void main(String args[]){
    int a[]={1, 2, 3 ,4, 5, 6, 7, 8};
    int b[]=a.clone();
    display(a);
    display(b);
    a[2]=45;
    a[4]=34;
    b[3]=2;
    b[2]=45;
    display(a);
    display(b);
}
}
