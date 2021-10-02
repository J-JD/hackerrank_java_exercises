/**
 * JavaDoc not yet implemented!!!
 *
 * @author gml
 * @version 1.0
 */
public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("HELLO WORLD!!!");

		// 30 Days of Code in Java Day 10. Binary Numbers
		BinaryNumbers binaryNumbers = new BinaryNumbers();
		System.out.println("Day 10. Binary Numbers solution is: " + binaryNumbers.solution(951));

		// 30 Days of Code in Java Day 22. Binary Search Trees
		// Variables:
		int[] arrayBTS = { 3, 5, 2, 1, 4, 6, 7 };
		Node root = null;
		for (int i = 0; i < arrayBTS.length; i++) {
			root = Node.insert(root, arrayBTS[i]);
		}
		System.out.println("L22 NODE: " + root);

	} // END main
} // END class App