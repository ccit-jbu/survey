package kr.ac.joongboo.is.edu.car;


/**
 * @author ChiUhnHak
 *
 */

public class SportsCar extends Car {
	
	/* (non-Javadoc)
	 * @see kr.ac.joongboo.is.edu.car.Car#turn()
	 */
	public void turn(){
		super.turn();
		System.out.println("Drift");
		
	} 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsCar sportsCar = new SportsCar();
		sportsCar.turn();

		IWheel wheel = new Wheel();
		sportsCar.addWheel(wheel);
		
	}

}
