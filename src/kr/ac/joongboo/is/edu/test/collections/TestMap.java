package kr.ac.joongboo.is.edu.test.collections;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public class Entry{
		public int a = 1;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "C");
        
        
        int h = (new TestMap()).hashCode();
        
        String a = map.get("a");
        
        
        
        
        for (String o : map.keySet()){
        	System.out.println(o);
        	System.out.println(map.get(o));
        	
        }
        
        Map<String, String> map2 = new HashMap<String, String>();
        map2.putAll(map);
        
        for (Map.Entry<String, String> o : map2.entrySet()){
        	System.out.println(o.getKey());
        	System.out.println(o.getValue());
        }
        
        System.out.println(map2.containsValue("A"));  
        System.out.println(map2.equals(map));  

	}

}
