package core_java_new2;
public class String_Fnctions1 
{
	public static void main(String[] args) 
	{
		    //**1.Length  ******************************************
		
		String name="Ajit Choudhary";
		int size=    name.length();
		System.out.println(size);
		
		
		    //**2. ToLowerCase ************************************
		
	    String lower=	  name.toLowerCase();
		System.out.println(lower);
		
		
		    //**3. ToUpperCase ***************************************
		
		String upper=  name.toUpperCase();
		System.out.println(upper);
		
		
		    //**4. Trim ************************************************
		
		String name2=" ajit choudhary jat  ";
		System.out.println(name2);
		    String  trim=     name2.trim();
		  System.out.println(trim);
		
	}

}
