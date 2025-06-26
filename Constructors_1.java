package core_java_new;
public class Constructors_1
{

	static void add()
	{
		System.out.println("static with non para");
	}
	static void sub(int a, int b)
	{
		System.out.println("static with para");
	}

	void add1()
	{
		System.out.println("non static with non para");
	}
	void sub1(int a, int b)
	{
		System.out.println("non static with para");
	}
	Constructors_1()
	{
		System.out.println("constructor with non para");
	}
	Constructors_1(int a, int b)
	{
		System.out.println("constructor with para");
	}


	public static void main(String[] args)
	{
		add();
		sub(2, 3);

		new Constructors_1(5, 7);
		Constructors_1 c1=new Constructors_1();

		c1.add1();
		c1.sub1(4, 1);


	}

}
