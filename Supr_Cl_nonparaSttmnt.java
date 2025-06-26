package core_java_new2;
class Google1
{
	Google1()
	{                                                 //Implicitly present
		System.out.println("constructor 1st");
	}
}
public class Supr_Cl_nonparaSttmnt  extends Google1
{
	Supr_Cl_nonparaSttmnt()
	{
		super();                                           //Explicitly written
		System.out.println("constructor 2nd");
	}

	  public static void main(String[] args)
	  {
		    new Supr_Cl_nonparaSttmnt();

	}


}
