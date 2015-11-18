// PayRoll.java 
// Chapter 2, exercise 3
// Define a float to define gross pay, and a float for tax rate of 35%
// Calculate the tax you pay with dollars and cents as separate values of type int

import static java.lang.Math.*;

public class PayRoll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int taxDollars = 0;
		int taxCents = 0;
		
		double grossPay = 85426.35;
		double taxRate = 0.35;
		double taxes = 0;
		
		taxes = grossPay * taxRate;
		System.out.println("Your gross income is: " + grossPay);
		System.out.println("Your tax rate is:  " + taxRate);
		System.out.println("Your taxes owed will be:  " + taxes);
		
		taxDollars = (int)floor(taxes);
		System.out.println("\n\nYour taxes owed in dollars will be:  $" + taxDollars);
		
		taxCents = (int)Math.round((taxes - taxDollars)*Math.pow(10.0, 2.0));
		System.out.println("\n\nYour taxes owed in cents will be:  " + taxCents);
		
	
	}

}
