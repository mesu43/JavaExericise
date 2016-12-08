package day.one;

public class MethodFour {
	
	public static void main (String[] args) {
		
		System.out.println(getKilometerMile(10));
			
	}
	/**
	 *  write a method that take input as mile & return as kilometer
	 */
	public static double getKilometerMile(double mile) {
		
		double kilometer = 0;
		
		kilometer = mile * 1.6;
		
		return kilometer;
	}

}
