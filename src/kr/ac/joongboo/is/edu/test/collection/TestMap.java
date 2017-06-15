package kr.ac.joongboo.is.edu.test.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {

	      Map myMap = new HashMap();

	      myMap.put("key1", "A");
	      myMap.put("key2", "C");
	      myMap.put("key3", "A");
	      myMap.put("key4", "B");
	      
	      System.out.println("myMap: " + myMap);

	      // Compare the two Maps
	      System.out.println("myMap matches myMap: " + myMap.equals(myMap));

	      // Now we will remove one element from myMap and compare again
	      myMap.remove("A");
	      
	      System.out.println("myMap: " + myMap);
	      System.out.println("myMap matches myMap: " + myMap.equals(myMap));


	      // Use of Iterator in Map
	      Iterator iterator = myMap.keySet().iterator();
	      while (iterator.hasNext()) {
	    	  String key = (String) iterator.next();
	          System.out.println("Iterator loop: " + myMap.get(key));
	      }

	      // Use of for-each in Map
	      for (Object key : myMap.keySet()) {
	          System.out.println("for-each loop: " + key);
	          System.out.println("Iterator loop: " + myMap.get(key));
	      }

	      // Use of for-each in Map
//	      for (Map.Entry entry : myMap.entrySet()) {
//	          System.out.println("for-each loop: " + entry.getKey());
//	          System.out.println("Iterator loop: " + entry.getValue());
//	      }

	      // Clearing all the elements
	      myMap.clear();
	      System.out.println("myMap is Empty: " + myMap.isEmpty());

	      // Checking the number of elements
	      System.out.println("myMap has: " + myMap.size() + " Elements");
	      System.out.println("myMap has: " + myMap.size() + " Elements");


	}

}
