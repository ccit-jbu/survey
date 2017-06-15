package kr.ac.joongboo.is.edu.test.collections;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	/*
	public String sayHello(String str){
		
		return str;
	}

	public Integer sayHello(Integer integer){
		
		return integer;
	}
	
	public Long sayHello(Long lng){
		
		return lng;
	}
	*/
	
	
	public <Y> Y sayHello(Y str){
		
		return str;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		TestSet testSet = new TestSet();
//		String str = testSet.sayHello("ffddd");
		
		
		
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        
        for (String o : set){
        	System.out.println(o);
        }
        
        Set<String> set2 = new HashSet<String>();
        set2.addAll(set);
        
        for (String o : set2){
        	System.out.println(o);
        }
        
        System.out.println(set2.contains("A"));  
        System.out.println(set2.equals(set));  
	}

}
