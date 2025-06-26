package core_java_new4;

public class SIB_IIB_Blocks1
{                                                           //We can have multiple sib n iib in one program

	   public static void main(String[] args)
	   {
		                                                           //1st sib
		         System.out.println("Main method");                //2nd main method
		         new SIB_IIB_Blocks1();                            //3rd iib
		                                                           //4th Constructor
	   }

	        SIB_IIB_Blocks1()
	        {
	        	System.out.println("Constructor");
	        }

	        static
	        {
	        	System.out.println("SIB 1");
	        }

	        {
	        	System.out.println("IIB 1");
	        }

	        static
	        {
	        	System.out.println("SIB 2");
	        }

	        {
	        	System.out.println("IIB 2");
	        }




}
