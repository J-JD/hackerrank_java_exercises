import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryNumbersTest {

	@Test
	public void testBinaryNumbers() {
		assertEquals(1, BinaryNumbers.solution(5));
		assertEquals(3, BinaryNumbers.solution(951));
	}
}