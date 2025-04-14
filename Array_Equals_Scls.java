package core_java_new3;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Equals_Scls
{
	public static void main(String[] args)      //check array equals using input at scanner class
	{
		  Scanner s1= new Scanner(System.in);
		   System.out.println("Enter size of Array:- ");
		    double[] laptopsale= new double[s1.nextInt()];
		    double mobilesale[]= new double[laptopsale.length];
		    
		    for(int i=0;i<=laptopsale.length-1;i++)
		    {
		    	System.out.println("Enter the value of laptopsale at index:- "+i);
		    	laptopsale[i]= s1.nextDouble();
		    	System.out.println("Enter the value of mobilesale at index:- "+i);
		    	mobilesale[i]= s1.nextDouble();
		    }
		    System.out.println("Sale of laptops:-> "+Arrays.toString(laptopsale));
		    System.out.println("Sale of mobiles:-> "+Arrays.toString(mobilesale));
		    s1.close();
		    
		    boolean b1= Arrays.equals(laptopsale, mobilesale);
		    if(b1==true)
		    {
		    	System.out.println("Both arrays are equals");
		    }
		    else
		    {
		    	System.out.println("Arrays are not equals");
		    }
		    
		    
		    
	}

}
