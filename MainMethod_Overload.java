package core_java_new4;
public class MainMethod_Overload 
{
	      public static void main()                                 //Overloading main method
	      {
		           System.out.println("Its me main method");
	        	  
	      }
	
	      public void main(String name, int Mnumber)
	      {
	        	  System.out.println("Name is-> " +name);
	        	  System.out.println("Number is-> " +Mnumber);
	      }
	
	
	      
	  public static void main(String[] args) 
	  {
	    	     main();
	    	     
	    	     MainMethod_Overload m1= new MainMethod_Overload();
	    	           m1.main("Choudhary", 8031);
			       
	    	 
     }

}
