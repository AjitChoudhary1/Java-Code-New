package core_java_new2;
public class AccsSpf_InPckge1
{
	public static void main(String[] args)
	{
		                                                 //Within Package
		AccsSpf_InPckge2 a1=new AccsSpf_InPckge2();
		a1.sub();
		a1.mul();
		a1.div();               // we can access public, protected, def/pkg
		
		                           // Not access private
		
	}

}
