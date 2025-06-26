package core_java_new3;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_ArrayList
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		Collection c1= new ArrayList();     //Upcasting
		       c1.add("Ajit");
		       c1.add("Jat124");                                     //for entire collection use like this .....set, queue all clses
		       c1.add(500423);
		       c1.add(true);                                     //Collection prprty by Arraylist this prgrm
		       c1.add('M');                                      //LinkedList also same like this in List
		       c1.add(21.236);                                   //Vector and Stack also same like this in List
		        System.out.println("C1-> "+c1);

	   @SuppressWarnings("rawtypes")
	Collection c2= new ArrayList();
	          c2.addAll(c1);
	          System.out.println("C2-> "+c2);



	}

}
