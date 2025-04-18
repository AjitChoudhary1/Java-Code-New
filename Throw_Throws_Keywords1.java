package core_java_new4;

import java.util.InputMismatchException;                             //throws declare an exception
                                                                     // throw throw an exception

public class Throw_Throws_Keywords1 
{
	   @SuppressWarnings("unused")
	public static void main(String[] args) throws NullPointerException,InputMismatchException
	   {
		      
		     if(1>2)
		     {
		    	 throw new NullPointerException("Sorry cell is empty");
		     }
		     else
		     {
		    	 throw new InputMismatchException("Sorry but your input is not  matching");
		     }
		   
		   
		   
		
	}

}
