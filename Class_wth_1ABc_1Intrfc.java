package core_java_new2;
interface Jat1
{
	void Gav();
	void Tehsil();
}
abstract class Jat implements Jat1
{
	abstract void SchoolName();
	abstract void Me();
	
	static void Activa()                        //Mlt Lvl Inh
	{
		System.out.println("110 6G");
	}
}
public class Class_wth_1ABc_1Intrfc extends Jat
{
	void ActivaModel()
	{
		System.out.println(2022);
	}
	public static void main(String[] args)
	{
		Activa();
		Class_wth_1ABc_1Intrfc c1=new Class_wth_1ABc_1Intrfc();
		c1.ActivaModel();
		c1.Gav();
		c1.Tehsil();
		c1.SchoolName();
		c1.Me();
		
	}
	@Override
	public void Gav() {
		// TODO Auto-generated method stub
		System.out.println("Tayri");
	}
	@Override
	public void Tehsil() {
		// TODO Auto-generated method stub
		System.out.println("Jayal");
	}
	@Override
	void SchoolName() {
		// TODO Auto-generated method stub
		System.out.println("IPS Jayal");
	}
	@Override
	void Me() {
		// TODO Auto-generated method stub
		System.out.println("Choudhary Sahab");
	}

}
