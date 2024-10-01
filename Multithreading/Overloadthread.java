package Multithreading;

class Mythread5 extends Thread{
    public  void run(){
             System.out.println("parent thread");
         }
         
         public void run(int a){
              System.out.println(a);
         }
    }
    
    
public class Overloadthread{
    public static void main(String args[]){
         Mythread5 m=new Mythread5();
          m.start();
         // m.run(6);

    }
}

//we can  pass parameter  in run method is overloaded but we can not pass any arguments in the start method 
