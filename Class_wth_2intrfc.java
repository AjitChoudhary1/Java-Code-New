package core_java_new2;
interface Family
{
	void Mom();
	void Papa();
	void Bhai();
}
interface Nanihal
{
	  void Nani();                                                    //Mltpl Lvl Inh
	  void Mama();
	  void MamaBhai();
}
public class Class_wth_2intrfc implements Family,Nanihal
{
	@Override
	public void Nani() {
		// TODO Auto-generated method stub
		System.out.println("Jiji");
	}

	@Override
	public void Mama() {
		// TODO Auto-generated method stub
		System.out.println("Jay");
	}

	@Override
	public void MamaBhai() {
		// TODO Auto-generated method stub
		System.out.println("Praveen");
	}

	@Override
	public void Mom() {
		// TODO Auto-generated method stub
		System.out.println("Rupa");
	}

	@Override
	public void Papa() {
		// TODO Auto-generated method stub
		System.out.println("Chhotu");
	}

	@Override
	public void Bhai() {
		// TODO Auto-generated method stub
		System.out.println("Rj");
	}
	public static void main(String[] args) 
	{
		Class_wth_2intrfc c1=new Class_wth_2intrfc();
		c1.Nani();
		c1.Mama();
		c1.MamaBhai();
		c1.Mom();
		c1.Papa();
		c1.Bhai();
		
	}

	

}
