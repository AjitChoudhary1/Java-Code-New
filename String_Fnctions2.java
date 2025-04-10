package core_java_new2;
public class String_Fnctions2 
{
	public static void main(String[] args) 
	{
		   //**5. Equals *****************************************
		
		String name1=" Jat Sahab Ji";
		String name2="Jat Sahab Ji ";
		boolean output=       name1.equals(name2);
		System.out.println(output);
		
		
		   //**6. EqualsIgnoreCase ***********************************
		
		String name3="ajit choudhary";
		String name4="Ajit Choudhary";
		boolean output2=    name3.equalsIgnoreCase(name4);
		System.out.println(output2);
		
		
		  //**7. Contains **********************************************
		
		boolean output3=   name1.contains("Ji");
		System.out.println(output3);
		
		
		   //**8. SubString(single para *********************************
		
		String output4=   name4.substring(4);
		System.out.println(output4);
		String output5=   name3.substring(6);
		System.out.println(output5);
		
		
		
		
		
	}

}
