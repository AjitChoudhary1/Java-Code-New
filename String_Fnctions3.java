package core_java_new2;
public class String_Fnctions3
{
	public static void main(String[] args)
	{
		   //**9. Subtring(Double para ****************************

		String name="Ajit Ji Choudhary";
		 String output=       name.substring(2, 11);           //11-1 result give till 15
		System.out.println(output);
		 String output1=    name.substring(5, 17);              //17-1 result give till 16
		  System.out.println(output1);

		     //**10. Replace(char,char *****************************

		 String name1="Ajit Jat";
		  String output2=    name1.replace('A', 'E');
		   System.out.println(output2);

		 String name2="ajit jat";
		  String output3=   name2.replace('a', 'e');
		   System.out.println(output3);

		 String name3="Computer";
		  String output4=    name3.replace('C', 'k');
		   System.out.println(output4);

	}

}
