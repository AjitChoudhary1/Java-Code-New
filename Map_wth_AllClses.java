package core_java_new4;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class Map_wth_AllClses 
{
	    public static void main(String[] args)                           //Upcasting with all map classes
	    {
	    	     Map<Object,Object> m1= new HashMap<Object,Object>();
	    	     
	    	     Map<String,String> m2= new LinkedHashMap<String,String>();
	    	     
	    	     Map<Integer, Integer> m3= new IdentityHashMap<Integer, Integer>();
	    	     
	    	     Map<String, Integer> m4= new WeakHashMap<String, Integer>();
	    	     
	    	     Map<String, Object> m5= new TreeMap<String, Object>();
	    	     
	    	     Map m6= new Properties();              //Till here Map Interface
	    	     
	    	     
	    	     
	    	     SortedMap<String, Integer> m7= new TreeMap<String, Integer>();           // Here Sorted Map Interface
	    	     
	    	     NavigableMap<Integer, String> m8= new TreeMap<Integer, String>();          //Here Navigable MAp Interface
	    	     
	    	   
			
		}

}
