package core_java_new;

public class StaticM_InMainM 
{
	static void addition()
	{                                     // Static methods Accessed inside main method
		System.out.println("Add");
	}
	static void subtraction()
	{
		System.out.println("Sub");
	}
	static void multiplication()
	{
		System.out.println("Multi");
	}
	static void division()
	{
		System.out.println("Div");
	}

	public static void main(String[] args) 
	{
		
		System.out.println("Main M");
		addition();
		subtraction();
		multiplication();
		division();
		
		

	}

}
