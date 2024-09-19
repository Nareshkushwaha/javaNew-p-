//can we make multiple abstract method : YES

package Abstract;


abstract class Mahindra{

    abstract void tyre();
    abstract void horn();

}
class Suzuki extends Mahindra{
     void tyre(){
        System.out.println("This is  tyre abstract class");
     }
      void horn(){
        System.out.println("This is break abstract method");
      }
}
public class AbstractVehicle2 {
   
    public static void main(String args[]){
        Suzuki s=new Suzuki();
             s.tyre();
             s.horn();
    }
}
