package kr.ac.joongboo.is.edu.test.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
	      Set mySet = new HashSet();

	      mySet.add("A");
	      mySet.add("C");
	      mySet.add("A");
	      mySet.add("B");
	      
	      System.out.println("mySet: " + mySet);

	      // Compare the two sets
	      System.out.println("mySet matches mySet: " + mySet.equals(mySet));

	      // Now we will remove one element from mySet and compare again
	      mySet.remove("A");
	      
	      System.out.println("mySet: " + mySet);
	      System.out.println("mySet matches mySet: " + mySet.equals(mySet));


	      // Use of Iterator in Set
	      Iterator iterator = mySet.iterator();
	      while (iterator.hasNext()) {
	          System.out.println("Iterator loop: " + iterator.next());
	      }

	      // Use of for-each in Set
	      for (Object str : mySet) {
	          System.out.println("for-each loop: " + str);
	      }

	      // Clearing all the elements
	      mySet.clear();
	      System.out.println("mySet is Empty: " + mySet.isEmpty());

	      // Checking the number of elements
	      System.out.println("mySet has: " + mySet.size() + " Elements");
	      System.out.println("mySet has: " + mySet.size() + " Elements");
		
	}

}
