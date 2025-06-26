package core_java_new;
public class NonStatic_Para_NoPara
{
	public void village()
	{
		System.out.println("Tatarwi");
	}
	private void Tehsil()
	{
		System.out.println("Jayal");
	}                                                    // non para
	protected void Zipcode()
	{
		System.out.println(341301);
	}
	void State()
	{
		 System.out.println("Rajasthan");
	}

//******************************************************


	    public void add(int a, int b)
		{
			System.out.println(a+b);
		}
		private void sub(int a, int b)
		{
			System.out.println(a-b);
		}                                                    // para
		protected void multi(double a, double b)
		{
			System.out.println(a*b);
		}
		void divide(long a, long b)
		{
			 System.out.println(a/b);
		}


	public static void main(String[] args)
	{

		NonStatic_Para_NoPara n1=new NonStatic_Para_NoPara();
		n1.village();
		n1.Tehsil();
		n1.Zipcode();
		n1.State();

		n1.add(5, 5);
		n1.sub(8, 2);
		n1.multi(6.1, 5.1);
		n1.divide(445, 44);


	}

}
