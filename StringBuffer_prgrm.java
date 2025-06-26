package core_java_new3;
public class StringBuffer_prgrm
{
	public static void main(String[] args)                       //String Buffer and String Builder both method same like this prg
	{
		StringBuffer s= new StringBuffer("Ajit Choudhary");
		           s.append(" Bhai");
		           System.out.println(s);

		           s.delete(15, 19);
		           System.out.println(s);
		           s.deleteCharAt(11);
		           System.out.println(s);

		           s.replace(11, 15, " Jat");
		           System.out.println(s);

		    String s1= s.substring(8);
		         System.out.println(s1);

		    String s2= s.substring(11, 15);
		         System.out.println(s2);





	}

}
