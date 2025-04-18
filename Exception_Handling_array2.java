package core_java_new4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling_array2 
{
	    public static void main(String[] args) 
	    {
	    	
	    	Scanner s1= new Scanner(System.in);
		      System.out.println("Enter the size of Array->");
		      
		      try
		      {
		   String [] rollno= new String[s1.nextInt()];
	           rollno[0]="jat";
	           rollno[1]="Ajit";
	           rollno[2]="pinku";
		      }
		      catch(NegativeArraySizeException n1)
		      {
		    	  System.out.println("Size cannot be negative");
		      
		      
		      Scanner s2= new Scanner(System.in);
		      System.out.println("Enter the size of Array again and it must be positive->");
		      
		     
		   String [] rollno= new String[s2.nextInt()];
	           rollno[0]="jat";
	           rollno[1]="Ajit";
	           rollno[2]="pinku";   
		      
	           s2.close();
	           
		      }
		      catch(InputMismatchException i1)
		      {
		    	  System.out.println("Size should be only numberj");
			      
			      
			      Scanner s2= new Scanner(System.in);
			      System.out.println("Enter the size of Array again and it must be positive->");
			      
			     
			   String [] rollno= new String[s2.nextInt()];
		           rollno[0]="jat";
		           rollno[1]="Ajit";
		           rollno[2]="pinku"; 
		    	  
		           
		           s2.close();
		      }
		     
		      
		      s1.close();
	    	
	    	
	    	
	    	
	    	
			
		}

}
