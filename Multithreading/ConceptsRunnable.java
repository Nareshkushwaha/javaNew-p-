
//jvm always wrok on main method so main method is excuted and then another method  excuted

package Multithreading;

class MyThreadRunnable implements Runnable{
    public void run(){
          for(int i=1;i<3;i++){
              System.out.println("Child thread");
          }
    }
}
public class ConceptsRunnable{
     public static void main(String args[]){
          MyThreadRunnable t=new MyThreadRunnable();
           Thread t1=new Thread(t);
              t1.start();
              
               for(int i=0;i<3;i++){
                    System.out.println("Main thread");
               }
     }
}
