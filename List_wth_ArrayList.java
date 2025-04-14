package core_java_new3;

import java.util.ArrayList;
import java.util.List;

public class List_wth_ArrayList 
{
	public static void main(String[] args) 
	{
		List a1= new ArrayList();        //Upcasting                          //In List same for vector stack and LinkedList
		      a1.add("Jay Balaji");
		      a1.add(341301);
		      a1.add(true);
		      a1.add(3.14);
		      a1.add('F');
		       System.out.println(a1);
		      
		      a1.add(5, "jat");
		       System.out.println(a1);
		      
		
	}

}
