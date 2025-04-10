package core_java_new2;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Scls_prg1 
{
	public static void main(String[] args)     //complete array by scanner class 2nd prgrm
	{
		 Scanner s1= new Scanner(System.in);
		  System.out.println("Enter the size of array");
		  
		  String Address[]= new String[s1.nextInt()];
		  //for(int i=0;i<=4;i++)
		  for(int i=0;i<=Address.length-1;i++)
		  {
			  System.out.println("Enter the index position:-> "+i);
			  Address[i]=  s1.next();
			  
		  }
		  System.out.println(Arrays.toString(Address));
		  s1.close();
		
		
	}

}
