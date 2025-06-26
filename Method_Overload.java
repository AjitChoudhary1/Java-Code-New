package core_java_new;
public class Method_Overload
{
	static void add()
	{
		System.out.println("1");
	}

	static void add(int a)
	{
		System.out.println("2");
	}

	void add(String a)
	{
		System.out.println("3");
	}

	void add(double b)
	{
		System.out.println("4");
	}


	public static void main(String[] args)
	{


		add();
		add(31);

		Method_Overload m1=new Method_Overload();
		m1.add("jat");
		m1.add(80.31);


	}

}
