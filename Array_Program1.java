package core_java_new2;
public class Array_Program1
{
	public static void main(String[] args)
	{
		String [] name=new String[4];

		name[0]="richhpal";
		name[1]="ajit";                                   // this way is not for interview best ...only for practice
		name[2]="rupa";
		name[3]="divanshu";



	//**********************************************************************

		int [] age= new int[4];

		 age[0]=28;
		 age[1]=26;
		 age[2]=50;
		 age[3]=5;

		 System.out.println("My name is -> "+name[0]);
		 System.out.println(name[0]+ " age is -> "+age[0]);
		 System.out.println("My name is -> "+name[1]);
		 System.out.println(name[1]+ " age is -> "+age[1]);
		 System.out.println("My name is -> "+name[2]);
		 System.out.println(name[2]+ " age is -> "+age[2]);
		 System.out.println("My name is -> "+name[3]);
		 System.out.println(name[3]+ " age is -> "+age[3]);

	}

}
