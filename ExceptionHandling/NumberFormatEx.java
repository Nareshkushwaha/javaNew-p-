package ExceptionHandling;

public class NumberFormatEx
{
	public static void main(String args[])
	{
	    try{
	    String a="hii";
	    int b=Integer.parseInt(a);
		System.out.println("The length of the array arr is: " +b);
	}
	catch(NumberFormatException ex){
	     System.out.println(ex);
	}
  }
}

