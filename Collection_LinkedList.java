package core_java_new3;

import java.util.Collection;
import java.util.LinkedList;

public class Collection_LinkedList 
{
	public static void main(String[] args) 
	{
		  Collection<String> c1= new LinkedList<String>();    //Upcasting
		              c1.add("Jat ji");
		              c1.add("Sahab Ji");                           // set ,queue entire collection all clses same mthd
		               System.out.println("C1-> "+c1);
		                                                          //like this Vector and stack also same work for collection prprty
		  Collection<Integer> c2= new LinkedList<Integer>();
		             c2.add(8031);
		             c2.add(8067);
		              System.out.println("c2-> "+c2);
		              
		  Collection<Object> c3= new LinkedList<Object>();     //Upcasting
		             c3.addAll(c1);
		             c3.addAll(c2);
		              System.out.println("C3-> "+c3);
		              
		              c3.remove(8031);
		               System.out.println("New C3-> "+c3);
		               
		              c3.removeAll(c1);
		               System.out.println("New C3-> "+c3);
		
		
	}

}
