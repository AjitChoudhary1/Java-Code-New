package core_java_new;
public class StaticM_Para_NoPara 
{
	public static void village()
	{
		System.out.println("Tatarwi");
	}
	private static void Tehsil()
	{
		System.out.println("Jayal");
	}                                                    // non para
	protected static void login(String un, String Pss)
	{
		System.out.println("Login to my ID");
	}
	 static void State()
	{
		 System.out.println("Rajasthan");
	}
	 
//*************************************************************************
	 
	    public static void add(int a, int b)
		{
			System.out.println(a+b);
		}
		private static void sub(int a, int b)
		{
			System.out.println(a-b);
		}                                                    // para
		protected static void multi(double a, double b)
		{
			System.out.println(a*b);
		}
		static void divide(long a, long b)
		{
			 System.out.println(a/b);
		}
		 
	
	
	public static void main(String[] args) 
	{
		
		village();
		Tehsil();
		login("Ajit@8031", "aj8@031");
		State();
		
		add(15, 15);
		sub(25, 14);
		multi(11, 11);
		divide(6, 6);
		
		
	}

}
