package core_java_new;

import java.util.Scanner;

public class Scanner_Cl_Varibland_Logcloprtrs 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of A");
	    int a= s1.nextInt();
	    System.out.println("Enter the value of B");
	    int b= s1.nextInt();
	    
	    int sum=a+b;
	    System.out.println("The sum is-> "+sum);
	    
	    int sub=a-b;
	    System.out.println("The sub is-> "+sub);
	    
	    int multi=a*b;
	    System.out.println("The multi is-> "+multi);
	    
	    int div=a/b;
	    System.out.println("The divide is-> "+div);
	    
	    int modu=a%b;
	    System.out.println("The modulus is-> "+modu);
		
	    s1.close();
	}

}
