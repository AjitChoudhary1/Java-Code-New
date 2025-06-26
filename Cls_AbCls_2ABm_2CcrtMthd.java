package core_java_new2;
abstract class SecondAB
{
	abstract void name();
	abstract void number();
	static void village()
	{

	}
	void city()
	{

	}

}
public class Cls_AbCls_2ABm_2CcrtMthd  extends SecondAB
{
	@Override
	void name()
	{
		System.out.println("Aj Choudhary");
	}


	@Override
	void number()
	{
		System.out.println("8031");
	}
	static void village()
	{
		System.out.println("Tayri");
	}
	@Override
	void city()
	{
		System.out.println("Jayal");
	}

	     public static void main(String[] args)
	     {

	    	 Cls_AbCls_2ABm_2CcrtMthd c1=new Cls_AbCls_2ABm_2CcrtMthd();
	    	 c1.name();
	    	 c1.number();
	    	 village();
	    	 c1.city();



		}



}
