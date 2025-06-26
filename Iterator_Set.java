package core_java_new3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterator_Set
{
	public static void main(String[] args)
	{
		      Set<Object> s1= new HashSet<>();    //Upcasting
		         s1.add(98);
		         s1.add("Jat");                                //all set clses we can iterate like this
		         s1.add(true);
		         s1.add(24);
		         s1.add("ajit");
		            System.out.println(s1);

		            System.out.println("Forward Iteration--");
		      Iterator<Object> i1= s1.iterator();
	             while(i1.hasNext())
	             {
	            	 System.out.println(i1.next());
	             }






	}

}
