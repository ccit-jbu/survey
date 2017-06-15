package kr.ac.joongboo.is.edu.test.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
	      List myList = new ArrayList();

	      myList.add("A");
	      myList.add("C");
	      myList.add("A");
	      myList.add("B");
	      
	      System.out.println("myList: " + myList);

	      // Compare the two Lists
	      System.out.println("myList matches myList: " + myList.equals(myList));

	      // Now we will remove one element from myList and compare again
	      myList.remove("A");
	      
	      System.out.println("myList: " + myList);
	      System.out.println("myList matches myList: " + myList.equals(myList));


	      // Use of Iterator in List
	      Iterator iterator = myList.iterator();
	      while (iterator.hasNext()) {
	          System.out.println("Iterator loop: " + iterator.next());
	      }

	      // Use of for-each in List
	      for (Object str : myList) {
	          System.out.println("for-each loop: " + str);
	      }

	      // Clearing all the elements
	      myList.clear();
	      System.out.println("myList is Empty: " + myList.isEmpty());

	      // Checking the number of elements
	      System.out.println("myList has: " + myList.size() + " Elements");
	      System.out.println("myList has: " + myList.size() + " Elements");
		
	}

}
