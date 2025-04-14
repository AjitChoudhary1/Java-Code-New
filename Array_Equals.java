package core_java_new3;

import java.util.Arrays;

public class Array_Equals 
{
	public static void main(String[] args)                     //simple array equals
	{
		  String[] name= new String[4];
		     name[0]="Ajit";
		     name[1]="Rupa";
		     name[2]="Vikyo";
		     name[3]="Rupa";
		     
		  String name1[]= new String[4];
		       name1[0]="Ajit";
		       name1[1]="Rupa";
		       name1[2]="Vikyo";
		       name1[3]="Rupa";
		       
		   System.out.println("First array:-> "+Arrays.toString(name));
		   System.out.println("Second array:-> "+Arrays.toString(name1));
		   
		          boolean b1=   Arrays.equals(name, name1);
		           System.out.println("Both arrays are EQUALS:-> "+b1);
		     
		
	}

}
