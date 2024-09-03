public class Shallow{
    static void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("this is array second");
    }
    public static void main(String args[]){
        int a1[]={1,2,3,4,5,6,7,8};
        int b1[]=(a1);
        display(a1);
        display(b1);
        a1[0]=12;
        a1[3]=67;
        display(a1);
        display(b1);
    }
}