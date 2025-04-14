package core_java_new3;

public class String_Buffer_prgrm2 
{
	public static void main(String[] args) 
	{
		StringBuffer story= new StringBuffer("Once upon a time");
		      story.append(", there was a craw.");
		      story.insert(30, "thursty ");
		      story.append(" who tried to take water.");
		      System.out.println(story);
		
	}

}
