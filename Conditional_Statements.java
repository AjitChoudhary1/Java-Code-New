package core_java_new;
public class Conditional_Statements 
{
	public static void main(String[] args) 
	{
		
		               //   IF Block
		
		 int a=10;
		 int b=20;
		 int c=30;
		 
		//if(a>b)
		 if(b<c)	 
		 {
			// System.out.println("No");
			 System.out.println("Yes");
		 }
		
		 //System.out.println("Outside the if block");
		
//************************************************************************************************
		 
		 
		               // IF ELSE
		 
		 int age=26;
		 
		// int age1=16;
		 
		 if(age>=18)
			 
		// if(age1>=18)
		 {
			 System.out.println("I can play Cricket");
			 
		 }
		 else
		 {
			 System.out.println("I Can't play cricket");
		 }
		
//*********************************************************************************************	
		
		
		                  // IF ELSE IF
		 
		 int a1=100;
		 int b1=200;
		 
		//if(a1>b1)
		 
		 if(b1>=a1)                    // which ever first got true only that will execute first 
		 {
			System.out.println("First 1 1"); 
		 }
		 else if(b1<=a1)
		 {
			 System.out.println("Second 2 2");
		 }
		 else
		 {
			 System.out.println("Third 3 3");
		 }
		
//***************************************************************************************************************
		 
		 
		 
		                  // NESTED IF ELSE
		 
		    int a3=10;
			int b3=20;
			int c3=30;
			if(a3<c3)
			//if(a3>b3)
			{
				 if(b3!=20)
				// if(b3==20)
				 {
					 System.out.println("First 1");
				 }
				 else
				 {
					 System.out.println("Second 2");
				 }
				
			}
			else
			{
				System.out.println("Third 3");
			}
			
		
	}

}
