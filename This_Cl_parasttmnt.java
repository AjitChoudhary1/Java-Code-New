package core_java_new2;
public class This_Cl_parasttmnt
{
	This_Cl_parasttmnt()
	{
		this(true);
		System.out.println("non para cnst 1");
	}

	This_Cl_parasttmnt(boolean b)
	{
		this("Ajit");
		System.out.println("para cnst 1");
	}

	This_Cl_parasttmnt(String a)
	{

		System.out.println("para cnst 2");
	}

	public static void main(String[] args)
	{
		new This_Cl_parasttmnt();

	}

}
