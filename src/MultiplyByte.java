
// Chapter 2, exercise 1
// Initialize a variable of type byte, then multiply it by 2 8 times. 
// explain last result (MSB signifies the sign of the byte, positive vs negative.)

public class MultiplyByte {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte myByte = 1;
		System.out.println("myByte = " + myByte); // 1
		myByte = (byte)(myByte * 2);
		System.out.println("myByte = " + myByte); // 2
		myByte = (byte)(myByte * 2);
		System.out.println("myByte = " + myByte);// 3
		myByte = (byte)(myByte * 2);
		System.out.println("myByte = " + myByte);// 4
		myByte = (byte)(myByte * 2);
		System.out.println("myByte = " + myByte);// 5
		myByte = (byte)(myByte * 2);
		System.out.println("myByte = " + myByte);// 6
		myByte = (byte)(myByte * 2);
		System.out.println("myByte = " + myByte);// 7
		myByte = (byte)(myByte * 2);
		System.out.println("myByte = " + myByte);// 8
		
		
	}

}
