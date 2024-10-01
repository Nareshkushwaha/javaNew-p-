package Multithreading;

class Mythread2 extends Thread{
    public  void run(){
         for(int i=1;i<=2;i++){
             System.out.println("Child thread");
         }
    }
}
public class Runthread{
    public static void main(String args[]){
         Mythread2 m=new Mythread2();
          m.run();
           for(int i=1;i<=2;i++){
                System.out.println("Parent thread");
           }
    }
}