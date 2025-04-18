package core_java_new4;
class Instagram
{
	  String login(String user_name)                                   //RunTime polymorphism by Method OverRiding
	  {
		  System.out.println("Login by User Name-> " +user_name);
		return user_name;
		  
	  }
	
}


public class RunTime_Polymorphism_byOvrriding  extends Instagram
{
	      String login(String email_id)
	      {
		        System.out.println("Login by Email id-> " +email_id);
		      return email_id;
		
	      }
	    public static void main(String[] args) 
	    {
	    	    Instagram i1= new Instagram();
	    	     i1.login("iajitchoudhary");
	    	        
	    	     RunTime_Polymorphism_byOvrriding r1= new RunTime_Polymorphism_byOvrriding();
	    	       r1.login("ajit@grotechminds.com");
	    	   
	    	      
			
		}

}
