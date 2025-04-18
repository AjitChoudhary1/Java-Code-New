package core_java_new4;
public class Exception_Handling_array 
{
	    public static void main(String[] args) 
	    {
	    	
	    	    int [] rollno= new int[3];
	    	     rollno[0]=10;
	    	     rollno[1]=15;
	    	     rollno[2]=25;
	    	     try
	    	     {
	    	     rollno[3]=30;
	    	     }
	    	     catch(ArrayIndexOutOfBoundsException a1)
	    	     {
	    	    	 System.out.println("Handled exception");
	    	     }
	    	
	    	
			
		}

}
