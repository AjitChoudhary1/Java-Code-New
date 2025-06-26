package core_java_new2;

import java.util.Arrays;

public class Array_Scls_copyothrRevrse
{
	public static void main(String[] args)                //copy in reverse order
	{
		  String input[]= new String[5];
		     input[0]="jat";
		     input[1]="Aj";
		     input[2]="saab";
		     input[3]="ji";
		     input[4]="choudhary";

		  String[] output= new String[input.length];
		  for(int i=0,j=input.length-1;i<=input.length-1;i++,j--)
		  {
			  output[j]= input[i];
		  }
		 System.out.println("Input Array:- "+Arrays.toString(input));
		 System.out.println("Output Rvrse Array:- "+Arrays.toString(output));

	}

}
