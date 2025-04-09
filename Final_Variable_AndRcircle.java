package core_java_new;
public class Final_Variable_AndRcircle
{
	
      final static double pi=3.14;              //Global variable
	
	  static void area1()
	  {
		    int r=5;                         //Local Variable
		    double area=pi*r*r;
		    System.out.println(area);
				
	  }
	  public static void main(String[] args) 
	  {
		       final int projectno=10;
		             //  projectno=11;    It's final Can't change the value
		       System.out.println(projectno);
		
		       area1();
	}


}
