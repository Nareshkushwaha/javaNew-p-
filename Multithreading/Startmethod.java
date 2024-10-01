package Multithreading;

class Mythread6 extends Thread{
    public  void run(){
             System.out.println("run method");
         }
         
         public void start(){
              System.out.println("Start method");
         }
    }
    
    
public class Startmethod{
    public static void main(String args[]){
         Mythread6 m=new Mythread6();
        //   m.run();
          m.start();
        

    }
}

//when want to make inactiv stage of thread then make start method in code 