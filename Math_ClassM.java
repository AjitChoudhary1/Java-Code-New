package core_java_new;
public class Math_ClassM
{

	       static double pivalue2=Math.PI;             // for math.pi

	public static void main(String[] args)
	{
		        // To perform Addition

		System.out.println(Math.addExact(20, 30));
		System.out.println(Math.addExact(80312552, 25631463));

	//*****************************************************************

		         // To perform Subtraction

		System.out.println(Math.subtractExact(25, 15));
		System.out.println(Math.subtractExact(36521254, 25143611));

	//***********************************************************************

		          // To perform Multiplication

		System.out.println(Math.multiplyExact(5, 5));
		System.out.println(Math.multiplyExact(25364102, 22));
		System.out.println(Math.multiplyExact(251463, 114));

	//***********************************************************************

		          // To check max(bigger) values

		System.out.println(Math.max(25, 30));
		System.out.println(Math.max(2546, 2123));
		System.out.println(Math.max(543.123, 414.1230));
		System.out.println(Math.max(2563.12452, 11478.21456));

	//*********************************************************************

		         // To check min(smaller) values

		System.out.println(Math.min(25, 30));
		System.out.println(Math.min(2546, 2123));
		System.out.println(Math.min(543.123, 414.1230));
		System.out.println(Math.min(2563.12452, 11478.21456));

	//********************************************************************

		          // it gives values in positive

		System.out.println(Math.abs(-5261.2123));
		System.out.println(Math.abs(23456.24566));
		System.out.println(Math.abs(-25));
		System.out.println(Math.abs(-256398745));

	//**********************************************************************

		     // it generates any random values

		for(int i=1;i<=5;i++)
		{
		System.out.println(Math.random());
		}

	//********************************************************


		     // math.pi

		 double pivalue= Math.PI;
		  System.out.println(pivalue);

	//*****************************************************


		  int r=10;
		  double area=pivalue2*r*r;
		 int area2=10*r*r;
		      System.out.println(area);
		      System.out.println(area2);


	}

}
