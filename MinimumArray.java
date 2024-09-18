public class MinimumArray {
    
        public static void main(String args[]){
            int a[]={1,2,3,8,5,6,7};
             int mini=a.length;
              for(int i=0; i<a.length; i++)
              {
                if (a[i] <= mini) 
                   mini = a[i];
               }
   
                      System.out.print(mini);
                  }
              }


