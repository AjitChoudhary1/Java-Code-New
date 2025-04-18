package core_java_new4;

public class Exception_Handling
{
	       public static void main(String[] args) 
	       {
	    	   
	    	     try
	    	     {
	    	        int a=1/0;
	    	         System.out.println(a);
	    	     }
	    	     catch(ArithmeticException a1)                                //catch executed bcz exception come
	    	     {
	    	    	 System.out.println("Handled the Exception");
	    	     }
	    	     
	 //***********************************************************************************   	     
	    	     
	    	     try
	    	     {
	    	        int a=1/1;                                       //try executed bcz exception not come
	    	         System.out.println(a);
	    	     }
	    	     catch(ArithmeticException a1)
	    	     {
	    	    	 System.out.println("Handled the Exception");
	    	     }
	    	     
		}

}
