package core_java_new3;

import java.util.Scanner;

public class Array_AverageValue
{
	public static void main(String[] args)                  //avrage value of int array using scnr cls
	{
		     int sum=0;
		     double average;
		      Scanner s1= new Scanner(System.in);
		       System.out.println("Enter the size of array:-> ");
		      int[] age= new int[s1.nextInt()];
		       for(int i=0;i<=age.length-1;i++)
		       {
		    	  System.out.println("Enter the value of index:-> "+i);
		    	  age[i]= s1.nextInt();
		    	  sum=sum+age[i];
		       }
		       System.out.println("The sum of values in Array are:-> "+sum);
		       average=sum/age.length;
		       System.out.println("Average of the array is:-> "+average);
		s1.close();
	}

}
