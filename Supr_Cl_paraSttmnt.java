package core_java_new2;
class supr_para
{
	supr_para(String name)
	{
		System.out.println("constructor para");
	}
}
public class Supr_Cl_paraSttmnt  extends supr_para
{
	Supr_Cl_paraSttmnt()
	{
		super("Ajit");                                            //para supr cl sttmnt  explicitly written
		System.out.println("constructor nonpara");
	}

	public static void main(String[] args)
	{
		new Supr_Cl_paraSttmnt();

	}

}
