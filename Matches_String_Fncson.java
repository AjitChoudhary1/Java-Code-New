package core_java_new3;
public class Matches_String_Fncson
{
	public static void main(String[] args)
	{
		 String input="Aj Bhai";
		boolean b1=  input.matches(".......");             //checking exact character
		   System.out.println("Matching:- " +b1);


		   boolean b2= input.matches("(.*)i");
		    System.out.println("Ending with i:- " +b2);      //checking ends with i


		    boolean b3= input.matches("A(.*)");
		     System.out.println("Starting with A:- " +b3);       //checking start with A



		     boolean b4= input.matches("(.*)j(.*)");
		      System.out.println("Present:- " +b4);                         //checking start,middle,or end presence


	}

}
