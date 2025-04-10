package core_java_new2;
interface Address
{
	void Village_name();
	void City_name();
	void Zipcode();
}
public class Class_Wth_1Intrfc implements Address
{
	static void Name()
	{
		System.out.println("PinTu");                           //Sngl Lvl INH
	}
	public static void main(String[] args) 
	{
		Name();
		Class_Wth_1Intrfc c1=new Class_Wth_1Intrfc();
		c1.City_name();
		c1.Village_name();
		c1.Zipcode();
		
		
	}

	@Override
	public void Village_name() 
	{
		// TODO Auto-generated method stub
		System.out.println("Tatarwi");
	}

	@Override
	public void City_name() 
	{
		// TODO Auto-generated method stub
		System.out.println("tatarwi");
	}

	@Override
	public void Zipcode() 
	{
		// TODO Auto-generated method stub
		System.out.println(341301);
	}

}
