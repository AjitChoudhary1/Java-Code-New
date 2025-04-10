package core_java_new2;
public class This_Cl_nonparasttmnt 
{
	This_Cl_nonparasttmnt(String name)
	{
		
		System.out.println("para cnst");
	}
	
	This_Cl_nonparasttmnt(int a)
	{
		this("ajit");
		System.out.println("para cnst 2");
	}
	
	This_Cl_nonparasttmnt()
	{
       this(26);
		System.out.println("non para cnst");
	}
	
	public static void main(String[] args) 
	{
		   new This_Cl_nonparasttmnt();
		
	}

}
