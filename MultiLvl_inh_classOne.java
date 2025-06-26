package inheritance_programs;
class classs_Three
{
	static void login()
	{
		System.out.println("Nonpara S");
	}

	void login2(String gmail)
	{
		System.out.println(gmail);
	}
}
class classs_Two extends classs_Three
{
	static void logout(String pass)
	{
		System.out.println(pass);
	}

	void logout2()
	{
		System.out.println("Nonpara NS");
	}
}
public class MultiLvl_inh_classOne extends classs_Two
{
	     static void otp()
	     {
	    	 System.out.println("Otp Wrong");
	     }

	     void otp2(int a)
	     {
	    	 System.out.println("otp correct");
	     }


	 public static void main(String[] args)
	 {
		      login();

		      MultiLvl_inh_classOne m1=new MultiLvl_inh_classOne();
		      m1.login2("aj@2631gmail.com");

		      logout("@a8031");

		      m1.logout2();

		      otp();

		      m1.otp2(8031);

	}


}
