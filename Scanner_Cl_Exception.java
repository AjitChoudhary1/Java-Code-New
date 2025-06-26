package core_java_new;

import java.util.Scanner;

public class Scanner_Cl_Exception
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);

		int a1= s1.nextInt();

		String s2= s1.next();

		boolean b1= s1.nextBoolean();

		s1.close();



	}

}
