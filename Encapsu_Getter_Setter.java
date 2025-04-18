package core_java_new4;
class Application
{
	    private double salary=105000.215;
	    
	        public double getSalary()
	        {
			    return salary;
	  
	        }
	    
	       public void setSalary(double salary)
	       {
	    	   this.salary=salary;
	    	   
	       }
}
public class Encapsu_Getter_Setter
{
	    public static void main(String[] args) 
	    {
	    	    Application a1= new Application();
	    	         a1.setSalary(98000.654);
	    	         System.out.println(a1.getSalary());
			
		}

}
