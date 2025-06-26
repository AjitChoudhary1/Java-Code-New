package core_java_new3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
                                          //Upcasting with collection by all the classes
public class Collection_With_AllClses
{
	@SuppressWarnings("unused")
	public static void main(String[] args)                   //All method in these classes work same for entire collection
	{
	//********** List(i) Classes ************************

		Collection<String> c1= new ArrayList<>();

		Collection<String> c2= new LinkedList<>();

		Collection<Object> c3= new Vector<>();

		Collection<Integer> c4= new Stack<>();


	//********** Queue(i) Classes *****************************

		Collection<Object> c5= new LinkedList<>();

		Collection<Integer> c6= new ArrayDeque<>();

		Collection<String> c7= new PriorityQueue<>();

 //**************** Set(i) Classes ****************************************

		Collection<Integer> c8 = new HashSet<>();

		Collection<String> c9= new LinkedHashSet<>();

		Collection<Object> c10 = new TreeSet<>();




	}

}
