package core_java_new4;

public class This_Keyword_New 
{
	    String name;
	     int age;
	      double salary;
	     void Employee_details(String name, int age, double salary)
	     {
	    	   System.out.println("Emp name is-> " +name);
	    	    System.out.println("Emp age is-> " +age);                  //Local Variable
	    	     System.out.println("Emp salary is-> " +salary);
	    	     
	        	this.name=name;
		        this.age=age;                              // assign values local(right) to global(left) ... right to left
		        this.salary=salary;
	     }
	     
	
	  public static void main(String[] args) 
	  {
		      
		  This_Keyword_New t1=new This_Keyword_New();
			t1.Employee_details("Ajit Choudhary", 27, 97000.927);
			
			System.out.println(t1.name);
			System.out.println(t1.age);
			System.out.println(t1.salary);                             //Global Variable
		  
		  
		       
		
	  }

}
