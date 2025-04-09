package core_java_new;

import java.util.Scanner;

public class Scanner_Cl_logcloprtrs 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
	  System.out.println("Enter the value of A-> ");
		      int a=  s1.nextInt();
		 System.out.println("Enter the value of B-> ");
		      int b=  s1.nextInt();
		      
		      int add=a+b;
		      System.out.println("The sum of 2 number is-> "+add);
		      
	//****************************************************************************
		      
		      System.out.println("Enter the value of A1-> ");
		      double a1=  s1.nextDouble();
		 System.out.println("Enter the value of B1-> ");
		      double b1=  s1.nextDouble();
		      
		      double sub=a1-b1;
		      System.out.println("The sub of 2 number is-> "+sub);
		      
	//*********************************************************************************	      
		      
		 System.out.println("Enter the value of A2-> ");
	      byte a2=  s1.nextByte();
	 System.out.println("Enter the value of B2-> ");
	      byte b2=  s1.nextByte();
	      
	      double mul=a2*b2;
	      System.out.println("The multiply of 2 number is-> "+mul);
	      
	 //**************************************************************************   
	      
	      System.out.println("Enter the value of A3-> ");
	      short a3=  s1.nextShort();
	 System.out.println("Enter the value of B3-> ");
	      short b3=  s1.nextShort();
	      
	      double divide=a3/b3;
	      System.out.println("The divide of 2 number is-> "+divide);
	      
	//********************************************************************************
		      
	      System.out.println("Enter the value of A4-> ");
	      long a4=  s1.nextLong();
	 System.out.println("Enter the value of B4-> ");
	      long b4=  s1.nextLong();
	      
	      double modu=a4%b4;
	      System.out.println("The modulus of 2 number is-> "+modu);
		      
		s1.close();
	}

}
