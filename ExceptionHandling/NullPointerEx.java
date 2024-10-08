package ExceptionHandling;

// Nullpointer Exception 

public class NullPointerEx {
	public static void main(String args[])
	{
	    try{
		int arr[] = null;
		System.out.println("The length of the array arr is: " + arr.length);
	}
	
	
	catch(NullPointerException ex){
	     System.out.println(ex);
	}
  }
}