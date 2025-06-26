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
	    	     @SuppressWarnings("unused")
				Map<Object,Object> m1= new HashMap<>();

	    	     @SuppressWarnings("unused")
				Map<String,String> m2= new LinkedHashMap<>();

	    	     @SuppressWarnings("unused")
				Map<Integer, Integer> m3= new IdentityHashMap<>();

	    	     @SuppressWarnings("unused")
				Map<String, Integer> m4= new WeakHashMap<>();

	    	     @SuppressWarnings("unused")
				Map<String, Object> m5= new TreeMap<>();

	    	     @SuppressWarnings({ "unused", "rawtypes" })
				Map m6= new Properties();              //Till here Map Interface



	    	     @SuppressWarnings("unused")
				SortedMap<String, Integer> m7= new TreeMap<>();           // Here Sorted Map Interface

	    	     @SuppressWarnings("unused")
				NavigableMap<Integer, String> m8= new TreeMap<>();          //Here Navigable MAp Interface



		}

}
