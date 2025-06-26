package core_java_new3;

import java.util.Arrays;

public class Array_SpeclChrctr_Count
{
	public static void main(String[] args)
	{
		 String city= "Tatarwi || 341301 && Gav!";

		 int Alphabet =0, Numeric =0, Space =0, Specialchr= 0;
		  char array[]= city.toCharArray();
		   System.out.println("The array is: "+Arrays.toString(array));
		 for(int i=0;i<city.length();i++)
		 {
			 char c1= city.charAt(i);

			 if(c1>='A' && c1<='Z')
			 {
				 Alphabet++;
			 }
			 else if(c1>='a' && c1<='z')
			 {
				 Alphabet++;
			 }
			 else if(c1>='0' && c1<='9')
			 {
				 Numeric++;
			 }
			 else if(c1<=' ')
			 {
				 Space++;
			 }
			 else
			 {
			       Specialchr++;
			 }

		 }
		 System.out.println("Count of alphabet is: " +Alphabet);
		 System.out.println("Count of Number is: " +Numeric);
		 System.out.println("Count of Space is: " +Space);
		 System.out.println("Count of special chrctr is: " +Specialchr);


	}

}
