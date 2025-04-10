package core_java_new2;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Scls_prg
{
	public static void main(String[] args)             //complete array by scanner class 1st prgrm
	{
		  Scanner s1= new Scanner(System.in);
		  System.out.println("Enter the size of array");
		  
		  int Mnmbr[]= new int[s1.nextInt()];
		  //for(int i=0;i<=4;i++)
		  for(int i=0;i<=Mnmbr.length-1;i++)
		  {
			  System.out.println("Enter the index position:-> "+i);
			  Mnmbr[i]=  s1.nextInt();
			  
		  }
		  System.out.println(Arrays.toString(Mnmbr));
		  s1.close();
		
	}

}
