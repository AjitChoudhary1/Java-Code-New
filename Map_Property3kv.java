package core_java_new4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Property3kv 
{                                                            //key, values without using for each loop
	   public static void main(String[] args) 
	   {
		       Map<String, Integer> m1= new HashMap<String, Integer>();       //Upcasting
		                 m1.put("pen", 50);
		                 m1.put("Book", 60);
		                 m1.put("file", 45);
		                 m1.put("Bag", 100);
		                    System.out.println("Main m1-> " +m1);
		                    
		               Set<String> s1=  m1.keySet();
		                  System.out.println("Keyset-> " +s1);
		                  
		              Collection<Integer> c1=   m1.values(); 
		                  System.out.println("Values-> " +c1);
		                  
		         Set<Entry<String, Integer>> s2=     m1.entrySet();  
		                   System.out.println("Entryset-> " +s2);
		              
		              
		              
		
	}

}
