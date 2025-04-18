package core_java_new4;

import java.util.HashMap;
import java.util.Map;

public class Map_Property2 
{
	   public static void main(String[] args) 
	   {
		      Map<String, Integer> m1= new HashMap<String, Integer>();     //Upcasting
		             m1.put("Mobile", 10);
		             m1.put("Cover", 15);
		                System.out.println("m1-> "+m1);
		                
		              m1.clear();
		               System.out.println("cleared m1-> "+m1);
		                                                                  //More methods of Map
		             m1.put("Charger", 20);
		             m1.put("Sim", 25);
		                System.out.println("new m1-> "+m1);
		                
		             m1.putIfAbsent("Cable", 15);
		               System.out.println(m1);
		               
		             m1.remove("Charger");
		               System.out.println(m1);
		               
		             m1.remove("Sim", 25);
		                System.out.println(m1);
		                
		             m1.replace("Cable", 18);
		                System.out.println(m1);
		                
		             m1.replace("Cable", 18, 26);
		                System.out.println(m1);
		                
		           int cbl=  m1.get("Cable");
		                System.out.println(cbl);
		                
		                
		             
		             
		
	}

}
