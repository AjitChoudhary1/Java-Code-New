package core_java_new2;
public class Gb_And_Lcl_varibl
{
	String name;
	int age;
	double salary;
	void emp_details(String name, int age, double salary)
	{
		System.out.println("my name is - "+name);
		System.out.println("my age is - "+age);
		System.out.println("my salary is - "+salary);
	}
	
	public static void main(String[] args)
	{
		Gb_And_Lcl_varibl g1=new Gb_And_Lcl_varibl();
		g1.emp_details("ajit", 26, 160000);
		
		System.out.println(g1.name);
		System.out.println(g1.age);
		System.out.println(g1.salary);
		
	}

}
