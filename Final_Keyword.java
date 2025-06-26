package core_java_new2;
class super1
{
	final void add()
	{
		System.out.println("This is final");           //we can't override after making it final
	}
}
public class Final_Keyword   extends super1
{
	void add(int a, String b)
	{
		System.out.println("name and number");
	}

	public static void main(String[] args)
	{

		Final_Keyword f1=new Final_Keyword();
		f1.add();
		f1.add(26, "ajit");




	}

}
