
                                                              // left to-----> Widening ------> Right

                                                  //left side ---//byte, short, int, long, float, double ---// Right side

                                                             // left <-------Narrowing <-------- Right to

                                                       //--> 2type-->  1.Narrowing --> Right to left
package core_java_new4;
                                                               //--->  2. Widening --> Left to Right
public class Primitive_TypeCasting                      
{
	     public static void main(String[] args)
	     {
	    	     double d= 10000;                                             //widening implicit  (int into double)
	    	       System.out.println("Int into Double-> " +d);                  //Left to Right
	    	       
	    	       double d1= (double) 20000;                                   //widening explicit (int into double)
	    	         System.out.println("Int into Double -> " +d1);
	    	         
	    	         long l= 125;
	    	           System.out.println("Byte into Long-> " +l);                          // byte into long
	    	           
	    	            double d2= 123.4562f;
	    	               System.out.println("Float into Double-> " +d2);                   //float into double
	    	               
	    	               
	    	               
	    	               
	    	      
	//**************************************************************************************************************
	    	         
	    	         float f= (float) 1254.456654155647;
	    	              System.out.println("Double into Float-> " +f);               // Narrowing explicit (double into float)
	    	        	    	                                                            // Right to left
	    	              
	    	              short s= (short) 125465845642556l;                 // long into short
	    	                  
	    	              byte b= (byte) 11456398745562663l;                       // long into byte
	    	                  System.out.println("Long into Short-> " +s);         
	    	                   System.out.println("Long into byte-> " +b);         
	    	 
	    	 
			
		}

}
