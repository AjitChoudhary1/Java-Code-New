package core_java_new4;

import java.util.HashMap;
import java.util.Map;

public class Map_Property
{
	    public static void main(String[] args)
	    {
	    	      Map<Object, Object> m1= new HashMap<>();     //Upcasting
	    	              m1.put("Ajit age", 27);
	    	              m1.put("Richhpal age", 28);
	    	              m1.put("Divanshu age", 6);

	    	              m1.put("Ajit", "Tatarwi");                //in object can store anything
	    	              m1.put("Pincode", 341301);
	    	              m1.put(9599850867l, "My Number");
	    	              m1.put(true, "Yes");

	    	              System.out.println(m1);




		}

}
