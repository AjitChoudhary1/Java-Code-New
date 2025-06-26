package core_java_new;

import java.util.Scanner;

public class Scanner_Cl_withSwitchcase
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);

		System.out.println("Press 1 to launch Chrome");
		System.out.println("Press 2 to launch Edge");
		System.out.println("Press 3 to launch Mozzila");
		System.out.println("Press 4 to launch IE");

		int input=s1.nextInt();

		switch(input)
		{
		case 1:
			System.out.println("Chrome browser launch");
			            break;
	    case 2:
			System.out.println("Edge browser launch");
		               // break;
	    case 3:
	    	System.out.println("Mozzila browser launch");
	    	           break;
	    case 4:
	    	System.out.println("IE browser launch");
		               break;
		 default:
			 System.out.println("Uhoh your selection is wrong, press only 1, 2, 3 and 4");

		s1.close();


		}


	}
}
