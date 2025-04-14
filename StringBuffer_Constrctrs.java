package core_java_new3;
public class StringBuffer_Constrctrs 
{
	public static void main(String[] args) 
	{
		   StringBuffer sb= new StringBuffer();                                        //Constructor 1
		   
		         System.out.println("1st cnstrctr length:- "+sb.length());
		         System.out.println("1st cnstrctr capacity:- "+sb.capacity());
		         
		         
		  StringBuffer sb1= new StringBuffer("Ajit Choudhary");                        //Constructor2
		  
		       System.out.println("2nd cnstrctr length:- "+sb1.length());
		       System.out.println("2nd cnstrctr capacity:- "+sb1.capacity());
		       
		       
		  StringBuffer sb2= new StringBuffer(50);                                      //Constructor3
		  
		       System.out.println("3rd cnstrctr length:- "+sb2.length());
		       System.out.println("3rd cnstrctr capacity:- "+sb2.capacity());
		       
		       
	}

}
