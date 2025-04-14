package core_java_new3;
public class StringBuilder_Constrctrs 
{
	   public static void main(String[] args) 
	   {
		   StringBuilder sb= new StringBuilder();                                        //Constructor 1
		   
	         System.out.println("1st cnstrctr length:- "+sb.length());
	         System.out.println("1st cnstrctr capacity:- "+sb.capacity());
	         
	         
	  StringBuilder sb1= new StringBuilder("Ajit Jat Tatarwi Jayal");                        //Constructor2
	  
	       System.out.println("2nd cnstrctr length:- "+sb1.length());
	       System.out.println("2nd cnstrctr capacity:- "+sb1.capacity());
	       
	       
	  StringBuilder sb2= new StringBuilder(100);                                      //Constructor3
	  
	       System.out.println("3rd cnstrctr length:- "+sb2.length());
	       System.out.println("3rd cnstrctr capacity:- "+sb2.capacity());   
		   
		   
		   
		   
		   
		   
		
	   }
	
	
}
