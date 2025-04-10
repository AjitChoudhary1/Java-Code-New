package core_java_new2;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Scls_copyothrAry1 
{
	public static void main(String[] args)                  //create array using scanner class copy 1 to another 2nd prgrm
	{
		  Scanner s1= new Scanner(System.in);
		   System.out.println("Enter the size of Array: ");
		    String name[]= new String[s1.nextInt()];
		     for(int i=0;i<=name.length-1;i++)
		     {
		    	 System.out.println("Enter the value at index:- "+i);
		    	 name[i]= s1.next();
		     }
		      System.out.println("Input Array:- "+Arrays.toString(name));
		      s1.close();
		      
		      String [] Address= new String[name.length];
		       for(int j=0;j<=Address.length-1;j++)
		       {
		    	   Address[j]=name[j];
		       }
		       System.out.println("Output/copied Array:- "+Arrays.toString(Address));
		     
		     
		     
	}

}
