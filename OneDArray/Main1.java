
abstract class College {
     
    abstract void course();
    
     void department(){
          System.out.println("this is non abstract department method");
     }
     
     void details(){
         System.out.println("This is non abstract details method ");
     }

}
class People extends College{
     
      void  course(){
          System.out.println("This is abstrac course method ");
      }
}

public class Main1{
  public static void main(String args[]){
      People p=new People();
             p.course();
             p.department();
             p.details();
  }
}
