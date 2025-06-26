package core_java_new4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Iterator_Map
{
	    public static void main(String[] args)
	    {
	    	      Map<String, Integer> m1= new HashMap<>();        //Upcasting
	    	              m1.put("Jat", 25);
	    	              m1.put("Gav", 10);
	    	              m1.put("Choudhary", 500);
	    	              m1.put("Girls",16);
	    	                System.out.println(m1);

	    	          System.out.println("Iteration using set Iterator--");

	    	            Set<Entry<String, Integer>> s1=    m1.entrySet();

	    	           Iterator<Entry<String, Integer>> itrt =    s1.iterator();
	    	                 while(itrt.hasNext())
	    	                 {                                                            //While loop
	    	                	 System.out.println(itrt.next());
	    	                 }





		}

}
