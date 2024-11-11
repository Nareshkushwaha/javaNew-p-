// user input array :
// 	1,2,1,4,1,6,7,4,5,4,2
// 	target : 4 
// 	count :how many times
// 	position :which 
// 	first position 
// 	last position 


public class Arrayposstion {
    public static void main(String args[]){
        int a[]={1,2,5,6,9,4,2,5,1,6,4};
        int target=4;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(target==a[i]){
                count=a[i];
            }
        }
        System.out.println(count);
    }
}
