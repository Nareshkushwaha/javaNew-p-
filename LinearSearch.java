public interface LinearSearch {
    
        public static void main(String args[]){
            int a[]={1,2,3,4,5,6};
            int target=9;
            int temp=0;
             for(int i=0;i<a.length;i++){
                if(a[i]==target){
                    System.out.print("target is paresent at "+ i +" index posstion ");
                    temp=temp+1;
                }
             }
             if(temp==0){
                System.out.println("target is not found");
             }
        }
}
