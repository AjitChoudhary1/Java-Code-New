package core_java_new4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections_Class_Method4
{
	public static void main(String[] args)
	{

		 // 15 Singleton (Set) Method,    16 SingletonList Method,     17 SingletonMap Method


		       // Singleton Set

		                Set<String> singletonSet= Collections.singleton("Automation");
		                       System.out.println("Singleton Set-> " + singletonSet);

		                       try
		                       {
		                       singletonSet.add("Ajit");
		                       }
		                       catch(UnsupportedOperationException uE)
		                       {
		                    	   System.out.println("Exception Handled-> " + "Cannot Modify Singleton Set");
		                       }


		       // Singleton List


		                List<String> singletonList= Collections.singletonList("Java");
		                        System.out.println("Singleton List-> " + singletonList);

		                        try
		                        {
		                        singletonList.add("Ajit");
		                        }
		                        catch(UnsupportedOperationException uE)
		                        {
		                        	System.out.println("Exception Handled-> " + "Cannot Modify Singleton List");
		                        }

               // Singleton Map

		                Map<String, Integer> singletonMap= Collections.singletonMap("Selenium", 100);
		                      System.out.println("Singleton Map-> " + singletonMap);

		                      try
		                        {
		                        singletonMap.put("Ajit", 200);
		                        }
		                        catch(UnsupportedOperationException uE)
		                        {
		                        	System.out.println("Exception Handled-> " + "Cannot Modify Singleton Map");
		                        }





        // 18 SynchronizedList Method     19 SynchronizedSet Method     20 SynchronizedMap Method


		       // SynchronizedList


                           List<String> list= new ArrayList<>();
                           List<String> syncList= Collections.synchronizedList(list);

                                syncList.add("Automation");
                                syncList.add("Java");

                                synchronized (syncList)
                                {
                                	for(String s : syncList)
                                	{
                                		System.out.println("The SyncList-> " + s);
                                	}
                                }





		    // SynchronizedSet


                          Set<Integer> set= new HashSet<>();
                          Set<Integer> syncSet= Collections.synchronizedSet(set);

                                 syncSet.add(10);
                                 syncSet.add(20);

                                   synchronized (syncSet)
                                   {
                                       for(int num : syncSet)
                                        {
                                     		System.out.println("The SyncSet-> " + num);
                                     	}
                                    }



		    // SynchronizedMap


                    Map<String, Integer> map= new HashMap<>();
                    Map<String, Integer > syncMap= Collections.synchronizedMap(map);

                          syncMap.put("Automation", 10);
                          syncMap.put("Java", 20);

                          synchronized (syncMap)
                          {
                             for(Map.Entry<String, Integer> entry : syncMap.entrySet())
                             {
                               System.out.println("The SyncMap-> " + entry.getKey() + " -> " + entry.getValue());
                             }
                          }


	}

}
