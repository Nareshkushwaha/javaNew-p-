package Collection.Vactor;

import java.util.*;  
public class VectorItrator  {    
    public static void main(String arg[]) {   
        //Create an empty Vector        
        Vector < String > colors = new Vector < String > ();  
        //Add color elements in the vector  
            colors.add("Red");  
            colors.add("Green");  
            colors.add("Blue");  
            colors.add("Pink");  
            //Obtain an Iterator  
            Iterator<String> itr = colors.iterator();  
            while(itr.hasNext()){  
                 System.out.println(itr.next());  
            }   
    }              
}  