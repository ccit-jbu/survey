package kr.ac.joongboo.is.edu.car;


public class Car {

	private String color = "BLACK";
	public static final String RED_COLOR = "RED";
	
	public class Engine {
    	public Engine(){}
    	public String moter;
    	public String plug;
    }
	
	public Car() {
		super();
	}
	
	
	public static Car getInstance(){
        return new Car();
	}
	
	public void turn(){
		
        Engine engine = new Engine();
		System.out.println("car turn");
	} 
	
	public String getColor() {
		return color;
	}

    public void addWheel(IWheel wheel){
    	System.out.println("휠 꼈음");
    }
	
	
	public void setColor(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return 100.0;
	}
	
	public static double getSpeed1() {
		return 99;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
		car.setColor("RED");
		
		System.out.println("hi " + Car.getSpeed1());
		System.out.println("hi " + car.getSpeed());

		System.out.println("hi " + Car.RED_COLOR);

        System.out.println("hi " + car.getColor());
        
        
        
        Car car1 =Car.getInstance();
        

	}

}
