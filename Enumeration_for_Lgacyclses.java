package core_java_new3;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_for_Lgacyclses 
{
	   public static void main(String[] args) 
	   {                                                           //same we can iterate all Legacy clases stack and 3more from map
		      Vector<String> v1= new Vector<String>();  //Object creation
		            v1.addElement("Jat Bhai");
		            v1.addElement("Choudhary Ji");
		            v1.addElement("Jayal Ra Jat");
		            v1.addElement("Nagauri");
		             
		            System.out.println(v1);
		            
		            System.out.println("Forward Direction Iteration---");
		              
		             Enumeration<String> e= v1.elements();
		                  while(e.hasMoreElements())
		                  {
		                	  System.out.println(e.nextElement());
		                  }
		             
		             
		             
		             
		
	}

}
