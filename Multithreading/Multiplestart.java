package Multithreading;

class Mythread7 extends Thread{
    public  void run(){
             System.out.println("run method");
         }
    }
    
    
public class Multiplestart{
    public static void main(String args[]){
         Mythread7 m=new Mythread7();
          m.start();
          m.start();
        

    }
}

//when call multiple start method in multithreading then give Exception IllegalException  Thread Exception