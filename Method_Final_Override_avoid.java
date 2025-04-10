package core_java_new2;
class Wifi
{
	final void passcode()
	{
		System.out.println("@ajit8031");
	}
}
public class Method_Final_Override_avoid extends Wifi
{
	void passcode1()
	{
		System.out.println("ajit8031");
	}
	
	public static void main(String[] args) 
	{
		
		Method_Final_Override_avoid m1= new Method_Final_Override_avoid();
		m1.passcode();
		m1.passcode1();
	}

}
