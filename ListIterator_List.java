package core_java_new3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_List 
{                                                         //Like this with listiterator we can iterate only list all clses
	public static void main(String[] args) 
	{
		List<Integer> a1= new ArrayList<Integer>();     //Upcasting
        a1.add(8031);
        a1.add(52);
        a1.add(98);
        a1.add(null);
           System.out.println(a1);
           
           ListIterator<Integer> i1= a1.listIterator();
               System.out.println("Forward iteration->");
                  while(i1.hasNext())
                  {
                	  System.out.println(i1.next());
                  }
           
               System.out.println("Backward iteration->");
                  while(i1.hasPrevious())
                  {
                	  System.out.println(i1.previous());
                  }
           
		
	}

}
