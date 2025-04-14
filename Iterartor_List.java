package core_java_new3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterartor_List 
{
	public static void main(String[] args)                          //like this we can iterate complete list , set, queue all clses
	{
		  List<Integer> a1= new ArrayList<Integer>();   //Upcasting
		               a1.add(58);
		               a1.add(52);
		               a1.add(98);                                   //entire collection als
		                  System.out.println(a1);
		                  
		                  
		    Iterator<Integer> b1= a1.iterator();
		           while(b1.hasNext())
		           {
		        	   System.out.println(b1.next());
		           }
		                  
		                  
		                  
		                  
		
	}

}
