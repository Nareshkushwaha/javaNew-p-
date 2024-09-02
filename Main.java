public class Main{
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8};
        int count=0;
        int target=5;
        for(int i=0;i<a.length;i++){
            if(target<a[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}