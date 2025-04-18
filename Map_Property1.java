package core_java_new4;

import java.util.HashMap;
import java.util.Map;

public class Map_Property1              
{
	   public static void main(String[] args) 
	   {
		        Map<String, Long> m1= new HashMap<String, Long>();       //Upcasting
		                m1.put("Ajit", 9599850867l);
		                m1.put("Rupa", 8290654399l);
		                
		                System.out.println("m1--> "+m1);                   //Methods of Map
		                
		                
		        Map<String, Long> m2= new HashMap<String, Long>();  
		                m2.put("Richhpal", 8003275524l);
		                m2.put("Chhota Ram", 8128634586l);
		                
		                System.out.println("m2--> "+m2);
		                
		                m2.putAll(m1);
		                 System.out.println("new m2-> "+m2);
		                 
		              boolean b1=   m2.isEmpty();
		                  System.out.println("isempty-> " +b1);
		
	}

}
