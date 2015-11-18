// PixSix.java -- Horton CH3, EX2.  
// A program to choose lottery numbers

public class PickSix {

	public static void main(String[] args) {

		int maxNumber = 49; // Max number for lotter is 1 to 49
		
		System.out.println("Your six lucky numbers are:");
		
		for (int i = 1; i <= 6; i++) {
			
			System.out.println((1+(int)(49*Math.random())));
		}

	}

}
