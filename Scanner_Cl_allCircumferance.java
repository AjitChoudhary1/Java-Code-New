package core_java_new;

import java.util.Scanner;

public class Scanner_Cl_allCircumferance
{
	       static double pi_value=Math.PI;

	public static void main(String[] args)
	{
		    Scanner s1=new Scanner(System.in);


		    double r= s1.nextDouble();
		       double circle=2*pi_value*r;

		      System.out.println("Circumferance of circle is -> "+circle);


		    int a=  s1.nextInt();
		       int b= s1.nextInt();
		       int c= s1.nextInt();
		     int  triangle=a+b+c;

		        System.out.println("Circumferance of triangle is -> "+triangle);



		     int l= s1.nextInt();
		      int br= s1.nextInt();
		        int reactangle= 2*(l+br);

		         System.out.println("Circumferance of reactangle is -> "+reactangle);



		          int ar= s1.nextInt();
		        int Square= 4*ar;

		             System.out.println("Circumferance of square is -> "+Square);

		         s1.close();
	}

}
