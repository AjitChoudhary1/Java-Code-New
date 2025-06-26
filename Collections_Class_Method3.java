package core_java_new4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections_Class_Method3
{
	public static void main(String[] args)
	{

		 // 11 Disjoint Method


                        List<Integer> list1= Arrays.asList(1, 2, 3, 4, 5);
                              System.out.println("Main list1-> " + list1);

                        List<Integer> list2= Arrays.asList(6, 7, 8, 9, 10);
                             System.out.println("Main list2-> " + list2);

                        List<Integer> list3= Arrays.asList(4, 7, 9);
                             System.out.println("Main list3-> " + list3);

                  // Check if list1 and list2 are disjoint
                       boolean result1= Collections.disjoint(list1, list2);
                          System.out.println("list1 and list2 are disjoint-> " + result1);



                     // Check if list2 and list3 are disjoint
                          boolean result2= Collections.disjoint(list2, list3);
                             System.out.println("list2 and list3 are disjoint-> " + result2);




        // 12 Fill Method

                      List<String> list= new ArrayList<>(Arrays.asList("Java", "python", "C++", "JavaScript"));
                             System.out.println("List before fill-> " + list);

                              //Replace all elements with "Ajit Choudhary"
                       Collections.fill(list, "Ajit Choudhary");

                           System.out.println("List after fill-> " + list);




       // 13 Copy Method

                   List<String> source= Arrays.asList("Java", "Python", "C++");
                         System.out.println("Source list-> " + source);

                   List<String> destination= new ArrayList<>(Arrays.asList("A", "B", "C"));
                         System.out.println("Destination list-> " + destination);

                     //copy source into destination
                   Collections.copy(destination, source);

                      System.out.println("Destination after copy-> " + destination);




        // 14 ReplaceAll Method

                      List<String> list4= new ArrayList<>(Arrays.asList("Java", "Selenium", "Java", "Automation", "Java"));
                            System.out.println("Rpls List 4-> " + list4);
                          //replace "java" with "ajit"

                      Collections.replaceAll(list4, "Java", "Ajit");
                           System.out.println("After replace list 4-> " + list4);






	}

}
