package core_java_new;
public class Global_Variable_AndRcircle
{
	
	static double pi=3.14;             //Global variable
	
	static void add()
	{
		double area=pi*15*15;           //Local Variable
		System.out.println(area);
	}
	
	
	public static void main(String[] args) 
	{
		
		add();
		double area1=pi*16*16;               //Local Variable
		System.out.println(area1);
		
		
	}

}
