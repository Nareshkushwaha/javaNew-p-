package Abstract;


abstract class Mahindra{
     abstract void tyre();

}
class Suzuki extends Mahindra{
      void tyre(){
         System.out.println("This is  tyre abstract class");
      }
}
public class AbstractVehicle {
    
     public static void main(String args[]){
         Suzuki s=new Suzuki();
              s.tyre();
     }
}
