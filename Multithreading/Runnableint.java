package Multithreading;

class MyThread8 implements Runnable{
      public void run(){
           System.out.println("Child thread");
      }
 }
  public class Runnableint{
       public static void main(String args[]){
            MyThread8 t=new MyThread8();
             Thread t1=new Thread(t);
                t1.start();
       }
  }