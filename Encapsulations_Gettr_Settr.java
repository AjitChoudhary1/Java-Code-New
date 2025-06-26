package core_java_new4;
class LoginApp
{
	private String username="Login to Application";

	   public String getUsername()
	   {
		   return username;
	   }

	   public void setUsername(String username)                  //1
	   {
		   this.username = username;
	   }


	private int age=26;

	   public int getAge()
	   {
		   return age;
	   }                                                      //2

	   public void setAge(int age)
	   {
		   this.age=age;
	   }


}
public class Encapsulations_Gettr_Settr
{
	    public static void main(String[] args)
	    {
	    	  LoginApp l1= new LoginApp();

	    	    l1.setUsername("ajit@gmail.com");
	    	      System.out.println(l1.getUsername());

	    	    l1.setAge(27);
	    	      System.out.println(l1.getAge());


		}

}
