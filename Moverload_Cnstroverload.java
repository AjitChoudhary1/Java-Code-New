package core_java_new;
public class Moverload_Cnstroverload
{
	Moverload_Cnstroverload()
	{
		System.out.println("Constructor 1");
	}

	Moverload_Cnstroverload(int a, int b)
	{
		System.out.println("Constructor 2");
	}

	static void add()
	{
		System.out.println("Static 1");
	}

	static void add(int a, int b)
	{
		System.out.println("Static 2");
	}

	void sub()
	{
		System.out.println("Non Static 1");
	}

	void sub(int a, int b)
	{
		System.out.println("Non Static 2");
	}




	public static void main(String[] args)
	{

		new Moverload_Cnstroverload();

		Moverload_Cnstroverload m1=new Moverload_Cnstroverload(80, 31);

		add();
		add(31, 80);

		m1.sub();
		m1.sub(80, 31);








	}

}
