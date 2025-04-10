package inheritance_programs;
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
public class Multiple_Lvl_Inhby_Intrfce implements Nanihal,Family
{
	static void Aj()
	{
		System.out.println("Pinku");
	}
	@Override
	public void Mom() 
	{
		// TODO Auto-generated method stub
		System.out.println("Rp");
	}

	@Override
	public void Papa()
	{
		// TODO Auto-generated method stub
		System.out.println("Ch");
	}

	@Override
	public void Bhai() 
	{
		// TODO Auto-generated method stub
		System.out.println("Rj");
	}

	@Override
	public void Nani() 
	{
		// TODO Auto-generated method stub
		System.out.println("Jij");
	}

	@Override
	public void Mama() 
	{
		// TODO Auto-generated method stub
		System.out.println("Jr");
	}

	@Override
	public void MamaBhai()
	{
		// TODO Auto-generated method stub
		System.out.println("Pr");
	}
	public static void main(String[] args) 
	{
		Aj();
		Multiple_Lvl_Inhby_Intrfce m1=new Multiple_Lvl_Inhby_Intrfce();
		m1.Mom();
		m1.Papa();
		m1.Bhai();
		m1.Nani();
		m1.Mama();
		m1.MamaBhai();
		Aj();
		
	}

	

}
