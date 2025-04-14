package core_java_new3;
public class String_SBF_SBD_prg 
{
	public static void main(String[] args) 
	{
		 String name="Ajit";
		     name.concat("Choudhary");
		      System.out.println("String Not modified it:- "+name);
		
		      
		   StringBuffer name1= new StringBuffer("Ajit");
		           name1.append(" Choudhary");
		            System.out.println("SBuffer moified it:- " +name1);
		            
		            
		   StringBuilder name2= new StringBuilder("Rupa");
		            name2.append(" Choudhary");
		              System.out.println("SBuilder also modified it:- " +name2);
		      
		      
		      
		      
		      
		      
	}

}
