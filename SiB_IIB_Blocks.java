package core_java_new4;

public class SiB_IIB_Blocks
{                                                            //We can have multiple sib n iib in one program

	    static
	    {
	    	System.out.println("SIB");                            //1st sib called
	    }


	    {
	    	System.out.println("IIB");                          //3rd iib called
	    }



	      public static void main(String[] args)
	      {

	    	  System.out.println("Main Method");                  //2nd main method called
	    	    new SiB_IIB_Blocks();


		}

}
