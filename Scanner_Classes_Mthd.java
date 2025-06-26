package core_java_new;

import java.util.Scanner;

public class Scanner_Classes_Mthd
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);

		    String name= s1.next();
		    int a= s1.nextInt();
		    double b= s1.nextDouble();
		    float c= s1.nextFloat();
		    boolean d= s1.nextBoolean();
		    byte e= s1.nextByte();
		    short f= s1.nextShort();
		    long g= s1.nextLong();

		    s1.close();



	}

}
