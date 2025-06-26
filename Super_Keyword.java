package core_java_new2;
class super_one
{
	void login()
	{
		System.out.println("By email id");
	}                                                   //can't override after using super keyword
}
public class Super_Keyword   extends super_one
{
	     @Override
		 void login()
	     {
	    	// super.login();
	    	 System.out.println("By mobile number");
	    	 super.login();
	     }


	public static void main(String[] args)
	{
		      Super_Keyword s1=new Super_Keyword();
		      s1.login();


	}

}
