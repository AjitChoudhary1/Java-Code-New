package core_java_new3;

import java.util.Collection;
import java.util.LinkedList;

public class Collection_LinkedList1 
{
	public static void main(String[] args) 
	{
		 Collection<String> c1= new LinkedList<String>();   //Upcasting
                  c1.add("Jat ji");
                  c1.add("Sahab Ji");                                  // set ,queue entire collection clses same mthd
                   System.out.println("C1-> "+c1);
                                                                   //like this Vector and stack also same work for collection prprty
        Collection<Integer> c2= new LinkedList<Integer>();
                   c2.add(8031);
                  c2.add(8067);
                   System.out.println("c2-> "+c2);
         
         Collection<Object> c3= new LinkedList<Object>();    //Upcasting
                     c3.addAll(c1);
                     c3.addAll(c2);
                      System.out.println("C3-> "+c3);
         
		           boolean b1= c3.contains("Jat ji ");
		             System.out.println(b1);
		             boolean b2= c3.containsAll(c1);
		              System.out.println(b2);
		              
		             boolean b3= c3.isEmpty();
		              System.out.println(b3);
		              
		             int size= c3.size();
		              System.out.println(size);
                      
	}

}
