package core_java_new3;

import java.util.Scanner;

public class Array_AverageVAlue1
{
	public static void main(String[] args)                            //avrage value of float array using scnr cls
	{
		float sum=0;
	     float average;
	      Scanner s1= new Scanner(System.in);
	       System.out.println("Enter the size of array:-> ");
	      float[] age= new float[s1.nextInt()];
	       for(int i=0;i<=age.length-1;i++)
	       {
	    	  System.out.println("Enter the value of index:-> "+i);
	    	  age[i]= s1.nextFloat();
	    	  sum=sum+age[i];
	       }
	       System.out.println("The sum of values in Array are:-> "+sum);
	       average=sum/age.length;
	       System.out.println("Average of the array is:-> "+average);
	s1.close();

	}

}
