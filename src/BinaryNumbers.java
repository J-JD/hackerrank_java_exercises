import java.util.ArrayList;

/**
 * 30 Days of Code in Java Day 10. Binary Numbers
 */
public class BinaryNumbers {

	public static int solution(int number) {
		// Variables
		int remainder = 0;
		int tempAccumulator = 1;
		int finalAccumulator = 1;

		// *** FIRST APPROACH. Step-by-step problem solvin ***
		ArrayList<Integer> binaryNum = new ArrayList<Integer>();
		// Decimal to Binary Conversion. Step-by-step
		while (number > 0) {
			remainder = number % 2;
			number = number / 2;
			binaryNum.add(0, remainder); // Insert the elements from right to left ".add(INDEX 0, element)" to construct
											// the entire binary number.
		} // Find maximum number of consecutive 1's
		for (int i = 0; i < binaryNum.size() - 1; i++) {
			if (binaryNum.get(i) == binaryNum.get(i + 1)) {
				tempAccumulator++;
			} else {
				if (finalAccumulator <= tempAccumulator) {
					finalAccumulator = tempAccumulator;
				}
				tempAccumulator = 1; // The temporary accumulator always has to be reset when two consecutive numbers
										// are not equal. ¡MEMBRILLO!
			}
		}
		// *** END FIRST APPROACH ***

		// // *** SECOND APPROACH: Use the built-in function "Integer.toBinaryString(n)"

		// // Variables
		// String binaryNum = "";
		// // Decimal to Binary Conversion
		// binaryNum = Integer.toBinaryString(number);
		// // Find maximum number of consecutive 1's
		// for (int i = 0; i < binaryNum.length() - 1; i++) {
		// if (binaryNum.charAt(i) == binaryNum.charAt(i + 1)) {
		// tempAccumulator++;
		// } else {
		// if (finalAccumulator <= tempAccumulator) {
		// finalAccumulator = tempAccumulator;
		// }
		// tempAccumulator = 1;
		// }
		// } // *** END SECOND APPROACH ***

		// Check that the final counter is up to date!
		if (finalAccumulator <= tempAccumulator) {
			finalAccumulator = tempAccumulator;
		}
		// Print the maximum number of consecutive 1's
		return finalAccumulator;
	}
} // END class BinaryNumbers