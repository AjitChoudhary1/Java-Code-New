package core_java_new3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_List
{
	public static void main(String[] args)
	{
		  List<String> c1= new ArrayList<>();      //Upcasting                          //we can sort only list
		            c1.add("C");
		            c1.add("B");
		            c1.add("A");
		              System.out.println("Before Sorting->");
		                System.out.println(c1);

		              System.out.println("After Sorting->");
		                Collections.sort(c1);
		                System.out.println(c1);

	}

}
