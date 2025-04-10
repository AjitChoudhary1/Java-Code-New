package core_java_new2;

import java.util.Arrays;
import java.util.Scanner;

public class Array_prg_Scls1 
{
	public static void main(String[] args)
	{
		System.out.println("Enter names");
		 String name[]= new String[6];                 //using scanner class with for loop 2nd prgrm ...this is best to use
		  Scanner s1= new Scanner(System.in);
		
		  for(int i=0;i<=5;i++)
		  {
			  name[i]= s1.next();
		  }
		  System.out.println(Arrays.toString(name));
		  s1.close();
		  
		
	}

}
