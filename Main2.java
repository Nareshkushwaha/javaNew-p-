public class Main2 {
    public static void main(String[] args) {
        int a[]={1,3,2,4,5,6,4,8,6,0,9};
        for(int i=1;i<a.length-1;i++){
            int left=i-1;
            int right=i+1;
            if(a[i]>a[left] && a[i]>a[right]){
                System.out.print(a[i]+" ");
            }
        }
    }
}
