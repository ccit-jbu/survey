package kr.ac.joongboo.is.edu.car;

import java.awt.List;
import java.util.Date;

public class Truck extends Car {
	
	private String carrageName;
	
	public void turn(){
		
		super.turn();
		System.out.println("handling");
		
	} 
	
	public void loadCarrage(String carrageName){
		this.carrageName = carrageName;
		List list = new List();
		Date date = new Date();
		
		list = null;
		date = null;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck = new Truck();
		System.out.println("hi " + truck.getColor());
		
		truck.turn();
		
	}

}
