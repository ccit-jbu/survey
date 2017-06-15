package com.qpick.survey.admin;

public class Calculator {
	public Integer calc(){
		
		//return getResult(new InstSubCalculator());
		return getResult(new SubCalculator(){

			@Override
			public Integer getSubResult(Integer i) {
				i = i * 5;
				i = i * 6;
				i = i * 7;
				i = i * 8;
				return i;
			}
			
		});
		
	}
	
	public Integer getResult(SubCalculator subCalc){
		Integer i = 1;
		
		i = i * 2;
		i = i * 3;
		i = i * 4;
		
		
		i = subCalc.getSubResult(i);
		
		
		i = i * 9;
		i = i * 10;
		
		
		return i;

	}

	public class InstSubCalculator implements SubCalculator{

		@Override
		public Integer getSubResult(Integer i) {
			i = i * 5;
			i = i * 6;
			i = i * 7;
			i = i * 8;
			return i;
		}

		
	}

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
        System.out.println( calculator.calc()) ;
	}

}
