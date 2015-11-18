
// SplitNum.java
// Chapter 2, exercise 2
// Take a number, 1234.5678, and split it into to parts.
// Original is type double, whole part is type long, fractional is type short.

import static java.lang.Math.*;

public class SplitNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		double number = 1234.5678;
		long firstPart = (long)floor(number);
		double secondPart = (number - firstPart);
		//short secundo = (short)()
		System.out.println("The original number is : " + number);
		System.out.println("The first part is : " + firstPart);
		System.out.println("The second part is : " + secondPart);
		
		// Could not figure out how to remove fraction.
		
		

	}

}
