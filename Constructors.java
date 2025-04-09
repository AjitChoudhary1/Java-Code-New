package core_java_new;
public class Constructors 
{
	Constructors()
	{
		System.out.println("non para");
	}
	Constructors(int a, int b)
	{
		System.out.println("para");
	}
	
	
	public static void main(String[] args) 
	{
		Constructors c1=new Constructors();      // 1syntax creating object
		new Constructors(1, 2);                      // 2syntax 
	}

}
