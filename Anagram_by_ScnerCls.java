package core_java_new3;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_by_ScnerCls 
{
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		
		 System.out.println("Enter the 1st String");
		  String a= s1.next();
		 
		 System.out.println("Enter the 2nd String");
		  String b= s1.next();
		s1.close();
		  if(a.length()==b.length())
			 {
				 System.out.println("Okay the length of the 2 STRINGs are same");
			 }
			 else
			 {
				 System.out.println("Not okay the length of the 2 STRINGs are not same");
			 }
			  char c1[]= a.toCharArray();
			  char c2[]= b.toCharArray();
			  System.out.println("Before sorting c1:- " +Arrays.toString(c1));
			  System.out.println("Before sorting c2:- " +Arrays.toString(c2));
			  
			  Arrays.sort(c1);
			  Arrays.sort(c2);
			  System.out.println("After sorting c1:- " +Arrays.toString(c1));
			  System.out.println("After sorting c2:- " +Arrays.toString(c2));
			  
			  boolean b1= Arrays.equals(c1, c2);
			    if(b1==true)
			    {
			         System.out.println("They are anagram");	
			    }
			    else
			    {
			    	System.out.println("Sorry, they are not an anagram");
			    }
		  
		  
	}

}
