package core_java_new3;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_ArrayList1
{
	  public static void main(String[] args)
	  {
		       Collection<String> c1= new ArrayList<>();  //Upcasting
		              c1.add("Ajit");
		              c1.add("Choudhary");                               // set ,queue entire collection clses like this
		              c1.add("Jat");
		              c1.add("Tatarwi");                            //like this Vector and stack also same work for collection prprty
		               System.out.println("C1-> "+c1);

		       Collection<Integer> c2= new ArrayList<>();
		             c2.add(96);
		             c2.add(52);
		             c2.add(14);
		             c2.add(91);
		              System.out.println("C2-> "+c2);

		       Collection<Object> c3= new ArrayList<>();    //Upcasting
		              c3.addAll(c1);
		              c3.addAll(c2);
		               System.out.println("C3-> "+c3);
		         c3.clear();
		         System.out.println("After cleared C3-> "+c3);

	}

}
