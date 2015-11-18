// Breakfast.java -- Horton: CH3, EX1
// Display random choice of six breakfast choices.

import static java.lang.Math.*;

public class Breakfast {

	
	public static void main(String[] args) {
	
		int choice = 0;
		
		choice = 1 + (int)(6 * random());  // Returns (0.0 - 1.0) * 6
		// db System.out.println("Random choice is: " + choice);
		
		switch(choice) {
		case 1:
			System.out.println("Your breakfast choice is: " + choice + " Waffles");
			break;
		case 2:
			System.out.println("Your breakfast choice is: " + choice + " Cereal");
			break;
		case 3:
			System.out.println("Your breakfast choice is: " + choice + " Pancakes");
			break;
		case 4:
			System.out.println("Your breakfast choice is: " + choice + " Eggs");
			break;
		case 5:
			System.out.println("Your breakfast choice is: " + choice + " Oatmeal");
			break;
		case 6:
			System.out.println("Your breakfast choice is: " + choice + " Bagel");
			break;
		default:
			System.out.println("Whoops, sorry nothing is available for your choice of: " + choice);
			break;
		
		}
		

		
		

	}

}
