package core_java_new2;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Scls_copyothrAry 
{
	public static void main(String[] args)              //create array using scanner class copy 1 to another 1st prgrm
	{
		 Scanner s1=new Scanner(System.in);
		 System.out.println("Enter the size of your array: ");
		 
		 boolean [] result= new boolean[s1.nextInt()];
		 for(int i=0;i<=result.length-1;i++)
		 {
			 System.out.println("Enter the value of your array at the index position "+i);
			 result[i]= s1.nextBoolean();
		 }
		 System.out.println("Input Array--> "+Arrays.toString(result));
		 s1.close();
		 
		 boolean [] result1= new boolean[result.length];
		 
		 for(int i1=0;i1<=result1.length-1;i1++)
		 {
			 result1[i1]=result[i1];
		 }
		 System.out.println("Output/copied Array--> "+Arrays.toString(result1));
		 
		 
		
	}

}
