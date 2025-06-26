package core_java_new2;
public class Revrse_String
{
	public static void main(String[] args)
	{
		 String name="Ajit Choudhary";
		 String output="";

		 for(int i=name.length()-1;i>=0;i--)
		 {
			 char c= name.charAt(i);
			 output=output+c;
		 }
		   System.out.println("The output of given String is >- "+output);
	}

}
