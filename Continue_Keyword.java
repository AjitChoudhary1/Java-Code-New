package core_java_new;
public class Continue_Keyword
{
	public static void main(String[] args)
	{
		int a;
		for(a=1;a<16;a++)
		{
			if((a==5) || a==8 || a>13)
			{
				continue;
			}
			System.out.println(a);

		}

		int b;
		for(b=1;b<=20;b++)
		{
			if(b<=4 || b>=16 || (b==12))
			{
				continue;
			}
			System.out.println(b);


		}

	}

}
