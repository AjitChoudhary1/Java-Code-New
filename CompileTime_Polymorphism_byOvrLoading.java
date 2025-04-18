package core_java_new4;
public class CompileTime_Polymorphism_byOvrLoading 
{
	  static String login(String email_id)                                  //CompileTime polymorphism by Method OverLoading
	  {
		  System.out.println("Login using email id-> " +email_id);
		return "email_id";
		
	  }
	  
	  long login(long mobile_number)
	  {
		  System.out.println("Login using mobile number-> " +mobile_number);
		return 9599850867l;
	  
	  }
	  
	  String login()
	  {
		  System.out.println("Login using user name-> "+"iajitchoudhary");
		return "User Name";
		
	  }
	  
	  
	    public static void main(String[] args) 
	    {
	    	   login("ajit@grotechminds.com");
	    	   
	    	   CompileTime_Polymorphism_byOvrLoading c1= new CompileTime_Polymorphism_byOvrLoading();
	    	     
	    	      c1.login();
	    	      c1.login(9599850867l);
	    	   
	    	       
	    	
	    	
			
		}

}
