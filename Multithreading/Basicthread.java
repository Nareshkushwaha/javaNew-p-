package Multithreading;


    class Mythread extends Thread{
        public void run(){
             System.out.println("Welcom to india");
        }
   }
    public class Basicthread{
         public static void main(String args[]){
              Mythread m=new Mythread();
               m.start();
         }
         
    }
   

