// Chapter 2, exercise 4.
// Calculate the volume of the Sun and Earth, and ratios to one another.
// Sun's diameter is 865,000 miles
// Earth's diameter is 7600 miles
//
//	V = 4/3 * PI * r3

import static java.lang.Math.*;

public class Heavens {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radiusSun = 865000/2.0;
		double radiusEarth = 7600/2.0;
			
		double fourThirds = 4.0/3.0;
		
		double volSun =  fourThirds * Math.PI * Math.pow(radiusSun, 3);
		double volEarth = fourThirds * Math.PI * Math.pow(radiusEarth, 3);
		
		System.out.println("The Sun has a radius of " + radiusSun + " miles.");
		System.out.println("The Sun has a volume of " + volSun + " Square Miles.");
		
		System.out.println("\n\nThe Earth has a radius of " + radiusEarth + " miles.");
		System.out.println("The Earth has a volume of " + volEarth + " Square Miles.");
		
		double myRatio = volSun/volEarth;
		System.out.println("\nHow many earths fit into the sun? " + myRatio );
		

	
	}

}
