package core_java_new3;

import java.util.Arrays;

public class Array_SpeclChrctr_Count1
{
	public static void main(String[] args)
	{
		  String name="#ajit & Rj #rupa 8067 .";
		   char c1[]= name.toCharArray();
		    System.out.println("My array is:- "+Arrays.toString(c1));

		   int Letters=0, digits=0, whitespace=0, special=0;
		    for(char c2 : name.toCharArray())
		    {
		    	if(Character.isLetter(c2))
		    	{
		    		Letters++;
		    	}
		    	else if(Character.isDigit(c2))
		    	{
		    		digits++;
		    	}
		    	else if(Character.isWhitespace(c2))
		    	{
		    		whitespace++;
		    	}
		    	else
		    	{
		    		special++;
		    	}

		    }
		    System.out.println("count of letters:- " +Letters);
		    System.out.println("count of digits:- " +digits);
		    System.out.println("count of whitespace:- " +whitespace);
		    System.out.println("count of special chrctr:- " +special);

	}

}
