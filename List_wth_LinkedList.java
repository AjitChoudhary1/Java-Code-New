package core_java_new3;

import java.util.LinkedList;
import java.util.List;

public class List_wth_LinkedList 
{
	public static void main(String[] args)
	{
	     List<Integer> a1= new LinkedList<Integer>();    //Upcasting
	               a1.add(95);
	               a1.add(0, 36);                                         //In List same for vector stack and ArrayList
	                System.out.println("a1-> "+a1);
	               
	     List<Object> a2= new LinkedList<Object>();      //Upcasting
	                 a2.add("Jat");
	                  System.out.println("a2-> "+a2);
	                a2.addAll(a1);
	                 System.out.println("a2 and a1-> "+a2);
	                 
	                 a2.addAll(3, a2);
	                  System.out.println("New a2-> "+a2);
	                  
	                  a2.remove(4);
	                   System.out.println(a2);
	                   
	                   a2.remove("Jat");
	                    System.out.println(a2);
	                    
	                    a2.removeAll(a1);
	                     System.out.println(a2);
	                 
	                  
	     
	     
	     
	     
	     
	}
}
