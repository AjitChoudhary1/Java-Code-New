package core_java_new3;

import java.util.Collections;
import java.util.Stack;                       // This is Legacy Class

public class Stack_cls_Property
{
	  public static void main(String[] args)
	  {

		     Stack<Integer> s1= new Stack<>();     //Object creation
		             s1.addElement(65);
		             s1.addElement(82);
		             s1.addElement(25);
		             s1.addElement(36);
		             s1.addElement(75);
		             s1.addElement(44);
		             System.out.println("Before Sorting-");
		              System.out.println("S1->" +s1);

		              Collections.sort(s1);
		              System.out.println("After Sorting-");
		               System.out.println("s1-> "+s1);

		               Object frstelm=   s1.firstElement();
			              System.out.println("Fstelm--> "+frstelm);

			             Object lstelm=   s1.lastElement();
			              System.out.println("Lstelm--> "+lstelm);

			            int cap=   s1.capacity();
			              System.out.println("capcty--> "+cap);

			              s1.remove(2);
			               System.out.println(s1);

			               s1.remove(3);
			                System.out.println(s1);

			              int ro=  s1.pop();                                  //we can pass int or object both
			                 System.out.println("rmvelstOBjct-> "+ro);

			                Object lo= s1.peek();
			                  System.out.println(lo);

			                  int push= s1.push(8067);
			                   System.out.println(push);

			                  System.out.println(s1);

			                s1.removeAllElements();
			                 System.out.println(s1);


	}

}
