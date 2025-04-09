package core_java_new;
public class Constructor_Overload 
{
	Constructor_Overload()
	{
		System.out.println("Csntr1 overload with non para");
	}
	
	Constructor_Overload(int a)
	{
		System.out.println("Csntr2 overload with para");
	}
	
	Constructor_Overload(int a, int b)
	{
		System.out.println("Csntr3 overload with para");
	}
	
	Constructor_Overload(String s)
	{
		System.out.println("Csntr4 overload with para");
	}
	
	Constructor_Overload(char a)
	{
		System.out.println("Csntr5 overload with para");
	}
	
	public static void main(String[] args) 
	{
		
		Constructor_Overload c1=new Constructor_Overload();
		
		new Constructor_Overload(31);
		new Constructor_Overload(80, 31);
		new Constructor_Overload("Ajit Choudhary");
		new Constructor_Overload('A');
		
	}

}
