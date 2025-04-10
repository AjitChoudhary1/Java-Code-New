package inheritance_programs;
class superrr
{
	     static void add(int a)
         {        
   	              System.out.println(a);
         }
	     
	     void multi()
	     {
	    	     System.out.println("mul");
	     }
}
public class SingleLvl_inh extends superrr
{
	     static void sub()
	     {
	    	    System.out.println("Child class");
	     }
	     
	     void divide()
	     {
	    	    System.out.println("div");
	     }
	public static void main(String[] args) 
	{
		     add(26);
		     sub();
		     
		     SingleLvl_inh s1= new SingleLvl_inh();
		     s1.multi();
		     s1.divide();
	}

}
