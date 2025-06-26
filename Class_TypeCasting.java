package core_java_new4;
class Google_Auth
{
	public static String Village()
	{
		System.out.println("My Village is-> " + "Tatarwi");
		return "My Village";
	}

	int Zipcode()
	{
		System.out.println("My Pincode is-> " +341301);
		return 0;
	}

}

public class Class_TypeCasting extends Google_Auth
{
    protected double salary()
	{
		System.out.println("My Salary is-> " +99000.654);
		return 0;
	}

	private static long Mnumber()
	{
		System.out.println("My Mobile Number is -> " +9599850867l);
		return 0;
	}


	     public static void main(String[] args)
	     {

	    	    Google_Auth g1= new Class_TypeCasting();                          //Upcasting implicit
	    	                  g1.Zipcode();
	    	                     Village();
	    	                     Mnumber();


	    	    Google_Auth g2= new Class_TypeCasting();             //Upcasting explicit
	    	                  g2.Zipcode();
	    	                     Village();
	    	                     Mnumber();




	    	    Class_TypeCasting c1= (Class_TypeCasting) g1;                      //Downcasting explicit
	    	                        c1.salary();
	    	                        c1.Zipcode();
	    	                           Mnumber();
	    	                           Village();


		}

}
