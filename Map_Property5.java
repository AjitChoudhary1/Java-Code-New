package core_java_new4;

import java.util.HashMap;
import java.util.Map;

public class Map_Property5
{
	    public static void main(String[] args)
	    {
	    	    Map<String, String> m1= new HashMap<>();              //Upcasting
	    	              m1.put("Ajit", "Choudhary");
	    	              m1.put("Jat", "ji");
	    	              m1.put("Divanshu", "Choudhary");
	    	              m1.put("Richhpal", "Rupa");
	    	                 System.out.println("This is m1-> " +m1);
	    	                      System.out.println("Size m1-> " +m1.size());

	    	                                                                            // Size and equals method here
	    	    Map<String, String> m2= new HashMap<>();
		    	          m2.put("Ajit", "Choudhary");
		    	          m2.put("Jat", "ji");
		    	          m2.put("Divanshu", "Choudhary");
		    	          m2.put("Richhpal", "Rupa");
		    	              System.out.println("This is m2-> " +m2);
		    	                  System.out.println("Size m2-> " +m2.size());


		    	            boolean equl=  m1.equals(m2);
		    	               System.out.println("Both are equals-> " +equl);




		}

}
