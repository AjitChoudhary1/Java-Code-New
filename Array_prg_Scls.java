package core_java_new2;

import java.util.Arrays;
import java.util.Scanner;
                                              // using scanner class simple 1st prgrm...this not to use
public class Array_prg_Scls 
{
	public static void main(String[] args) 
	{
		 int rollno[]=new int[5];
		 Scanner s1=new Scanner(System.in);
		 
		 System.out.println("Enter rollno 1 by 1");
		 rollno[0]= s1.nextInt();
		 rollno[1]= s1.nextInt();
		 rollno[2]= s1.nextInt();
		 rollno[3]= s1.nextInt();
		 rollno[4]= s1.nextInt();
		 
		 System.out.println(Arrays.toString(rollno));
		 s1.close();
		
	}

}
