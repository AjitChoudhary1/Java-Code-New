package core_java_new2;
public class AccsSpf_InCls 
{
	       private void add()
	       {
	    	    System.out.println("Private"); 
	       }
	       public void sub()
	       {
	    	    System.out.println("Public");      // we can access all
	       }
	       protected void mul()
	       {
	    	    System.out.println("Protetcted"); 
	       }
	       void div()
	       {
	    	    System.out.println("Def/Pkg"); 
	       }
	
	       
	   public static void main(String[] args)
	   {
		   
		   
		   AccsSpf_InCls a1=new AccsSpf_InCls();
		   a1.add();
		   a1.sub();
		   a1.mul();
		   a1.div();
		   
		   
		
	}
	  

}
