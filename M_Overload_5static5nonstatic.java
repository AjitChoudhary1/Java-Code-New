package core_java_new;
public class M_Overload_5static5nonstatic 
{
	
	static void add()
	{
		System.out.println("1 static");
	}
	
	static void add(int a)
	{
		System.out.println("2 static");
	}
	                                                                // static para non para
	static void add(String s)
	{
		System.out.println("3 static");
	}
	
	static void add(double b)
	{
		System.out.println("4 static");
	}
	
	static void add(char c)
	{
		System.out.println("5 static");
	}
	
	
//**************************************************************
	
	
	
    void add(float f)
	{
    	System.out.println("1  non static");
	}
	
	void add(char a, int l)
	{
		System.out.println("2 non static");
	}                                                                 // non static
	
	void add(boolean b)
	{
		System.out.println("3 non static");
	}
	
	void add(int b, long l)
	{
		System.out.println("4 non static");
	}
	
	void add(char s, double b)
	{
		System.out.println("5 non static");
	}
	
	
	public static void main(String[] args) 
	{
		
		add();
		add(31);
		add("Choudhary");
		add(80.31);
		add('J');
		
		
		M_Overload_5static5nonstatic m1=new M_Overload_5static5nonstatic();
		m1.add(31.80f);
		m1.add('A',95);
		m1.add(true);
		m1.add(67, 012345);
		m1.add('J', 99.23);
		
		
	}

}
