package src;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class XbonacciTest {

	private Xbonacci variabonacci;

	@Before
	public void setUp() throws Exception {
		variabonacci = new Xbonacci();
	}

	@After
	public void tearDown() {
		variabonacci = null;
	}

	private double precision = 1e-10;

	@Test
	public void sampleTests() {
		assertArrayEquals(new double[]{1, 1, 1, 3, 5, 9, 17, 31, 57, 105}, variabonacci.tribonacci(new double[]{1, 1, 1}, 10), precision);
		assertArrayEquals(new double[]{0, 0, 1, 1, 2, 4, 7, 13, 24, 44}, variabonacci.tribonacci(new double[]{0, 0, 1}, 10), precision);
		assertArrayEquals(new double[]{0, 1, 1, 2, 4, 7, 13, 24, 44, 81}, variabonacci.tribonacci(new double[]{0, 1, 1}, 10), precision);
	}

	@Test
	public void weirdTests() {
		assertArrayEquals(new double[]{}, variabonacci.tribonacci(new double[]{17, 5, 11}, 0), precision);
		assertArrayEquals(new double[]{20, 7}, variabonacci.tribonacci(new double[]{20, 7, 9}, 2), precision);
	}

}
