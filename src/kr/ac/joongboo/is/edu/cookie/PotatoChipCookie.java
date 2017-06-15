package kr.ac.joongboo.is.edu.cookie;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mysql.jdbc.*;

public class PotatoChipCookie extends Cookie {



	private String name = "";
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public PotatoChipCookie(String name) {
		super();
		this.name = name;
	}	
	
	
	@Override
	public void bake() {
		// TODO Auto-generated method stub

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PotatoChipCookie potatoChipCookie = new PotatoChipCookie("name");
		
		potatoChipCookie.bake();
		potatoChipCookie.eat();

		
		System.out.println("보경".compareTo("보경"));
		
		
		Map<String, String> mapStudents = new HashMap<String, String>();
		mapStudents.put("강", "보경");
		mapStudents.put("정", "영호PM");
		
		
		System.out.println(mapStudents.get("강"));
		
		List<String> listStudents = new ArrayList<String>();
		listStudents.add("강보경");
		listStudents.add("정영호");
		
		for (int i = 0; i < listStudents.size();i++){
			System.out.println(listStudents.get(i)); 
		} 


		System.out.println(listStudents.get(0)); 
		System.out.println(listStudents.get(1)); 
		
		
		try {
			Driver driver = new Driver();
			driver.jdbcCompliant();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
