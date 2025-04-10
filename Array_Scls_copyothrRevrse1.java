package core_java_new2;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Scls_copyothrRevrse1             // copy to another in reverse order using Scanner class
{
	public static void main(String[] args) 
	{
		  Scanner s1= new Scanner(System.in);
		   
		   System.out.println("Enter the size of your Array:- ");
		   int[] input=new int[s1.nextInt()];
		    for(int i=0; i<=input.length-1;i++)
		    {
		    	System.out.println("Enter value at index:- "+i);
		    	input[i]= s1.nextInt();
		    }
		    System.out.println("Input Array:- "+Arrays.toString(input));
		    s1.close();
		    
		  int output[]= new int[input.length];
		   for(int i=0,j=input.length-1;i<=input.length-1;i++,j--)
		   {
			output[j]=input[i];   
		   }
		   System.out.println("Output/copied Array in reverse:- "+Arrays.toString(output));
		   
		
	}

}
