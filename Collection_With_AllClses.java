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
	public static void main(String[] args)                   //All method in these classes work same for entire collection
	{
	//********** List(i) Classes ************************
		
		Collection<String> c1= new ArrayList<String>();
		
		Collection<String> c2= new LinkedList<String>();
		
		Collection<Object> c3= new Vector<Object>();
		
		Collection<Integer> c4= new Stack<Integer>();
		
		
	//********** Queue(i) Classes *****************************
		
		Collection<Object> c5= new LinkedList<Object>();
		
		Collection<Integer> c6= new ArrayDeque<Integer>();
		
		Collection<String> c7= new PriorityQueue<String>();
		
 //**************** Set(i) Classes ****************************************
		
		Collection<Integer> c8 = new HashSet<Integer>();
		
		Collection<String> c9= new LinkedHashSet<String>();
		
		Collection<Object> c10 = new TreeSet<Object>();
		
		
		
		
	}

}
