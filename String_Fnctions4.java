package core_java_new2;
public class String_Fnctions4 
{
	public static void main(String[] args) 
	{
		  //**11. Replace(char sequence, char sequence ***********************************
		
		String name="Ajit Ji Choudhary";
		String name1="Jat Sahab Ji";
		
		 String output=    name.replace("Ji", "");
		  System.out.println(output);
		 
		 String output1=   name1.replace("Jat Sahab Ji", "Aj Rj Bhai Bhai");
		  System.out.println(output1);
		  
		String output2=   name.replace("Ji", "Bhai");
		 System.out.println(output2);
		
		
		//**12. Replace All(String regex, String********************************************
		 
		 String name2="Ajit Mobile Number 9599850867";
		 
		  String output3=   name2.replaceAll("[0-9]", "8031");
		   System.out.println(output3);                              //Removes Numeric values
		  String output4=   name2.replaceAll("[0-9]", "");
		   System.out.println(output4);
		 
		   
		String output5=    name2.replaceAll("[a-z]", "");           //Removes Lower letters
		 System.out.println(output5);
		 
		 
		String output6=    name2.replaceAll("[A-Z]", "");           //Removes Capital letters
		 System.out.println(output6);
		
		 
		 
		 
		 
	}

}
