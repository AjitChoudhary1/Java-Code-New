package core_java_new;
public class Assert_Keyword 
{
	public static void main(String[] args) 
	{
		//With Conditional Operators
		
		    int age=20;
		    assert age>18:"Sorry your age is less";
		    
		    System.out.println("You can play");
		    
//***********************************************************		    
		  int mark=100;
		  assert mark<110:"Your mark is less";
		  
		  System.out.println(mark);
		  
//****************************************************************
		  int mark1=150;
		  assert mark1>=105;   //"Your mark is higher";
		  
		  System.out.println(mark1);
		  
//**************************************************************		  
		  int mark2=210;
		  assert mark2<=250;
		  
		  System.out.println("Your mark is lesser then ->" +mark2);
		  
//*****************************************************************************
		  int mark3=320;
		  assert mark3==320;
		  
		  System.out.println("Your mark is ->" +mark3) ;
		  
//****************************************************************
		  assert mark3!=220;
		  
		  System.out.println(mark3);
		  
//*******************************************************************
		  
		  
		  // With Logical Operators
		  
		  int height=5;
		  int age1=26;
		  assert height>=5;
		  if(height>=5 && age1<=26)
		  {
			  System.out.println("You are perfect");
		  }
		  assert age1<=26;
		  if(height<=5 || age==15)
		  {
			  System.out.println("You are not perfect");
		  }
		  
   //******************************************************************************
		  assert age>19;
		  if(!(height<5 && age>25))    // c1 false so result in true
		  {
			  System.out.println("You are short");
		  }
		  assert height>4;
		  if(!(height>4 || age<30))    // c1 c2 true so result in false and else part executed
		  {
			  System.out.println("You are selected");
		  }
		  else
		  {
			  System.out.println("You are selected height and age both okay");
		  }
		  
		  
		  
	}

}
