package core_java_new2;
class supr_para3
{
     supr_para3(int a)
     {
    	 System.out.println("constructor 1st");
     }
}
class supr_para2   extends supr_para3
{
	supr_para2(String name)
	{
		super(26);
		System.out.println("constructor para");
	}
}
public class Supr_Cl_paraSttmnt2   extends supr_para2
{
	Supr_Cl_paraSttmnt2()
	{
		super("Ajit");                                            //para supr cl sttmnt    explicitly written
		System.out.println("constructor nonpara");
	}

	public static void main(String[] args)
	{
		new Supr_Cl_paraSttmnt2();
	}

}
