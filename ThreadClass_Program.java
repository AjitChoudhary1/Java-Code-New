package core_java_new;
public class ThreadClass_Program 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		for(int i=1;i<=10;i++)
		{
		Thread.sleep(1000);
		 System.out.println("Ajit Choudhary");
		 Thread.sleep(3000);
		 System.out.println(i);
		}
		
	}

}
