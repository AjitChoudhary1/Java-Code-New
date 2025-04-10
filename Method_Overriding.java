package core_java_new2;
 class Amazon                                            //we can override only non static method
 {
	 void login()
	 {
		 System.out.println("login by mobile no");           //it got suppresd
	 }
 }
public class Method_Overriding    extends Amazon
{
	    void login()
	    {
	    	System.out.println("login by email id");       
	    }
	
	public static void main(String[] args) 
	{
		   Method_Overriding m1 =new Method_Overriding();
		   m1.login();
		
	}

}
