package core_java_new;
public class Logical_Operators
{
	public static void main(String[] args)
	{

		        // And Operator

		 char gender='M';
		  int age2=26;
		  int age3=12;

		  if(gender=='M' && age2==26)
		  {
			  System.out.println("Full Ticket");

			   if(gender=='F' && age3<=12)
			   {
				   System.out.println("For child free ticket");
			   }
			   else
			   {
				   System.out.println("For Sr Citizen Free ticket");
			   }
		  }
		  else
		  {
			  System.out.println("For Female free Ticket");
		  }

	//***************************************************************************************


		                   // OR Operator

		  int a=10;
		  int b=20;
		  int c=30;

		  if(a>5 || b==20)
		  {
			  System.out.println(a+b+c);
		  }

 //********************************************************************************************

		                // AND Operator With Not Operator

		  int a1=10;
		  int b1=20;
		  if(!(a1==11 && b1==20))
		  {
			  System.out.println("First");
		  }


//**************************************************************************************



		               // Or Operator with Not Operator

		  int a2=25;
		  int b2=35;
		  if(!(a2==26 || b2==36))
		  {
			  System.out.println("Second");
		  }

	}

}
