package core_java_new2;

public class This_Keyword
{
	String name;
	int age;
	float rollno;
	void student_details(String name, int age, float rollno)
	{
		this.name=name;
		this.age=age;                              // assign values local(right) to global(left) ... right to left
		this.rollno=rollno;
	}

	public static void main(String[] args)
	{

		This_Keyword t1=new This_Keyword();
		t1.student_details("Ajit", 26, 80.31f);

		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.rollno);

	}

}
