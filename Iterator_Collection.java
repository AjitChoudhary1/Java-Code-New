package core_java_new3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator_Collection
{
	public static void main(String[] args)
	{
		Collection<String> c1= new ArrayList<>();    //Upcasting
		             c1.add("Jat");
		             c1.add("Choudhary");
		             c1.add("mobile");                  //like this we can iterate for entire collection
		                                                  //with set ,queue ,list for all classes
		              System.out.println(c1);

		            Iterator<String> i1= c1.iterator();
		                  while(i1.hasNext())
		                  {
		                	  System.out.println(i1.next());
		                  }





	}

}
