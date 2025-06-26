package core_java_new2;
public class AccsSpf_InPckge2
{

	 @SuppressWarnings("unused")
	private void add()
     {
  	    System.out.println("Private");
     }
     public void sub()                         //Within package
     {
  	    System.out.println("Public");
     }
     protected void mul()
     {
  	    System.out.println("Protected");
     }
     void div()
     {
  	    System.out.println("Def/Pkg");
     }


}
