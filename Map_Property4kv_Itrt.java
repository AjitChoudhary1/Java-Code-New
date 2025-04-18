package core_java_new4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Property4kv_Itrt 
{                                                             //key, values using for each loop
	     public static void main(String[] args)
	     {
	    	 Map<String, Integer> m1= new HashMap<String, Integer>();       //Upcasting
                       m1.put("Marker", 50);
                       m1.put("copy", 60);
                       m1.put("kitab", 45);
                       m1.put("thelo", 100);
                           System.out.println("Main m1-> " +m1);
                           
                       System.out.println("Iterating all keys--");
                        for(String key : m1.keySet())
                        {                                            //For each loop
                        	System.out.println(key);
                        }
                        
                      System.out.println("Iterating all values--");  
                        for(Integer value : m1.values())
                        {
                        	System.out.println(value);
                        }
                        
                      System.out.println("Iterating key&value pair--");  
                         for(Entry<String, Integer> keyvalue : m1.entrySet())
                         {
                        	System.out.println(keyvalue);
                         }
                      
                      
                      
              
		}

}
