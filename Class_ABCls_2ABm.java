package core_java_new2;
abstract class Google_Auth
{
	abstract void login();
	abstract void registration();
}
public class Class_ABCls_2ABm   extends Google_Auth
{
	
	void login() 
	{
		System.out.println("Api real logic");
	}

	
	void registration() 
	{
		System.out.println("Api real logic2");
	}
	   public static void main(String[] args) 
	   {
		         
		   Class_ABCls_2ABm c1=new Class_ABCls_2ABm();
		   c1.login();
		   c1.registration();
		   
		   
		
	}

	
	

}
