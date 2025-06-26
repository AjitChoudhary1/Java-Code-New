package core_java_new4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections_Class_Method
{
	public static void main(String[] args)
	{
		// 1  Min, 2 Max, 3 Frequency methods

		Collection<Integer> list= new ArrayList<>(Arrays.asList(10, 20, 30, 40, 10, 20, 10));

		     System.out.println("Main list-> " + list);

		     System.out.println("Min numbers-> " + Collections.min(list));

		     System.out.println("Max numbers-> " + Collections.max(list));

		     System.out.println("Frequency of 10-> " + Collections.frequency(list, 10));



		// 4 Sort, 5 Reverse, 6 Shuffle Methods


		     List<Integer> list1= new ArrayList<>(Arrays.asList(5, 2, 9, 1, 5, 6));

		             System.out.println("Main list 1-> " + list1);

		        Collections.sort(list1);
		           System.out.println("Sorted List 1-> " + list1);


		        Collections.reverse(list1);
		           System.out.println("Reversed List 1-> " + list1);


		        Collections.shuffle(list1);
		           System.out.println("Shuffled List 1-> " + list1);



		 // 7 BinarySearch Method


		         List<Integer> list2= Arrays.asList(1, 3, 5, 7);

		                System.out.println("Main list 2-> " + list2);

		           int index= Collections.binarySearch(list2, 5);
		                  System.out.println("Index of 5-> " + index);



		// 8 Rotate Method


		                    // Positive Numbers
		        List<Integer> list3=Arrays.asList(1, 2, 3, 4, 5);

		               System.out.println("Main list 3-> " + list3);

		             //Rotating right by index 2 position
		           Collections.rotate(list3, 2);
		               System.out.println("Right Rotation by 2-> " + list3);



		               // Negative Numbers
				        List<Integer> list4=Arrays.asList(-1, -2, -3, -4, -5);

				               System.out.println("Main list 4-> " + list4);

				             //Rotating left by index -2 position
				           Collections.rotate(list4, -4);
				               System.out.println("Left Rotation by -2-> " + list4);



	      // 9  unmodifiableMap Method

		                    //Modifiable Map
		            Map<Integer, String> a1= new HashMap<>();
		                 a1.put(1, "Java");
		                 a1.put(2, "Python");
		                 a1.put(3, "C++");
		                 System.out.println("Unmodifiable map-> " + a1);

		           Map<Integer, String> a2= Collections.unmodifiableMap(a1);
		                a2.put(4, "JavaScript");







	}

}
