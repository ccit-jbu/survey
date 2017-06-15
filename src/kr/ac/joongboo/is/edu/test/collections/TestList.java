package kr.ac.joongboo.is.edu.test.collections;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<String> List = new ArrayList<String>();
        List.add("A");
        List.add("B");
        List.add("C");
        
        for (String o : List){
        	System.out.println(o);
        }
        
        List<String> List2 = new ArrayList<String>();
        List2.addAll(List);
        
        for (String o : List2){
        	System.out.println(o);
        }
        
        System.out.println(List2.contains("A"));  
        System.out.println(List2.equals(List));  

	}

}
