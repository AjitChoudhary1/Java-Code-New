package core_java_new2;
public class String_Palindrome
{
	public static void main(String[] args)
	{
		  String input="MOM";
		  String output="";

		  for(int i=input.length()-1;i>=0;i--)
		  {
	           char c=  input.charAt(i);
	           output=output+c;
		  }
		  System.out.println("The output of the given input is-> "+output);      //Palindrome

		 if(input.equals(output))
		 {
			 System.out.println("The input String is a palindrome");
		 }
		 else
		 {
			 System.out.println("The input string is not a palindrome");
		 }


	//************************************************************************************************************************


		 String input1="Mom";
		  String output1="";

		  for(int i=input1.length()-1;i>=0;i--)
		  {
	           char c=  input1.charAt(i);
	           output1=output1+c;
		  }
		  System.out.println("The output1 of the given input1 is-> "+output1);      //Not Palindrome

		 if(input.equals(output1))
		 {
			 System.out.println("The input1 String is a palindrome");
		 }
		 else
		 {
			 System.out.println("The input1 string is not a palindrome");
		 }



	}

}
