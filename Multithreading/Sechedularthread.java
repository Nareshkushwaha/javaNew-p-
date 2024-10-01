package Multithreading;

class Mythread1 extends Thread{
    public  void run(){
         for(int i=1;i<=2;i++){
             System.out.println("Child thread");
         }
    }
}
public class Sechedularthread{
    public static void main(String args[]){
         Mythread1 m=new Mythread1();
          m.start();
           for(int i=1;i<=2;i++){
                System.out.println("Parent thread");
           }
    }
}