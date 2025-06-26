package core_java_new4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Class_Method2
{
	public static void main(String[] args)
	{

		   // 10  unmodifiableList Method

                            //Modifiable List
                   List<String> a1= new ArrayList<>();
                          a1.add("Java");
                          a1.add("Python");
                          a1.add("C++");
                         System.out.println("Unmodifiable map-> " + a1);

                   List<String> a2= Collections.unmodifiableList(a1);
                           a2.add("JavaScript");




	}

}
