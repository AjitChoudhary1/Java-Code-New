package core_java_new3;
  
import java.util.Collections;
import java.util.Vector;                          //This is Legacy class

public class Vector_Cls_Property 
{
	  public static void main(String[] args)
	  {                                                      //Stack classes Methods are also same as 
		      
		      Vector<String> v1= new Vector<String>();    //Object Creation
		            v1.addElement("Ajit");
		            v1.addElement("Richpal");
		            v1.addElement("Divanshu");
		            
		              System.out.println("Before Sorting-");
		                System.out.println("v1--> "+v1);
		                
		               System.out.println("After Sorting-");
		            Collections.sort(v1);
		             System.out.println("v1--> "+v1);
		             
		            Object frstelm=   v1.firstElement();
		              System.out.println("Fstelm--> "+frstelm);
		              
		             Object lstelm=   v1.lastElement();
		              System.out.println("Lstelm--> "+lstelm);
		              
		            int cap=   v1.capacity();
		              System.out.println("capcty--> "+cap);
		              
		              v1.remove(2);
		               System.out.println(v1);
		               
		               v1.remove("Ajit");
		                System.out.println(v1);
		                
		                v1.removeAllElements();
		                 System.out.println(v1);
		      
		
	}

}
