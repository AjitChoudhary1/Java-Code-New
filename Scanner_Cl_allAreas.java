package core_java_new;

import java.util.Scanner;

public class Scanner_Cl_allAreas 
{
	static double pi_value=Math.PI;
            
	public static void main(String[] args) 
	{ 
		Scanner s1=new Scanner(System.in);
		 
		 double r= s1.nextDouble();
		  double circle=pi_value*r*r;
		 
		      System.out.println("Area of circle is -> "+circle);
		      
		      
		 int base=  s1.nextInt();
		 int height= s1.nextInt();
		  float  triangle= 1f / 2f*base*height;
		   
		      System.out.println("Area of triangle is -> "+triangle);
		      
		      
		  int l= s1.nextInt();
		  int b= s1.nextInt();
		   int reactangle= l*b;
		   
		   System.out.println("area of reactangle is -> "+reactangle);
		      
		
		double a= s1.nextDouble();
		   double Square= a*a;
		   
		   System.out.println("area of square is -> "+Square);
		
		s1.close();
		
	}

}
