package Multithreading;

class Mythread3 extends Thread{
    public  void run(){
             System.out.println("parent thread");
         }
    }
    
     class Mythread4 extends Mythread3{
          public void run(){
               System.out.println("Child thread");
          }
     }
    
public class Overridthread{
    public static void main(String args[]){
         Mythread4 m=new Mythread4();
          m.start();

    }
}

//we can override run method and 
