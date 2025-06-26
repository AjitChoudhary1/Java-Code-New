package core_java_new3;

import java.util.Arrays;

public class Array_CountAlpbt_nmric_spce_splchrtr
{
	  static int countofAlpha=0;
	  static int countofDigit=0;
	  static int countofSpaces=0;

	public static void main(String[] args)                      // count of alphabet,numeric,spaces,spaclchrctr in string
	{
		String name="@IPS jayal 123 & 25";
		 char[] array= name.toCharArray();
		  System.out.println("The Array is:-> "+Arrays.toString(array));
		   for(int i=0;i<=array.length-1;i++)
		   {
			   boolean b1= Character.isAlphabetic(array[i]);
			     if(b1)
			     {
			    	 countofAlpha++;
			     }
			   boolean b2= Character.isDigit(array[i]);
			    if(b2)
			    {
			    	countofDigit++;
			    }
			  boolean b3= Character.isWhitespace(array[i]);
			    if(b3)
			    {
			    	countofSpaces++;
			    }
		   }
		   System.out.println("Count of alphabet is:-> "+countofAlpha);
		   System.out.println("Count of Digit/numeric is:-> "+countofDigit);
		   System.out.println("Count of Space is:-> "+countofSpaces);

		   int countofSpeclChrctr=name.length()-(countofAlpha+countofDigit+countofSpaces);
		   System.out.println("Count of Specl Chrctr is:-> "+countofSpeclChrctr);

	}

}
