package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Xbonacci {

	public double[] tribonacci(double[] doubles, int elements) {
		List<Double> tribonacciElements = new ArrayList<>();
		int limit;
		if (elements <= 3) {
			limit = elements;
		} else {
			limit = 3;
		}
		for (int index = 0; index < limit; index++) {
			tribonacciElements.add(doubles[index]);
		}
		for (int elementIndex = 3; elementIndex < elements; elementIndex++) {
			tribonacciElements.add(tribonacciElements.get(elementIndex - 3) + tribonacciElements.get(elementIndex - 2)
					+ tribonacciElements.get(elementIndex - 1));
		}
		return tribonacciElements.stream().mapToDouble(d -> d).toArray();
	}

	//Optimized
	public double[] tribonacciOptiomized(double[] s, int n) {
		double[] tritab = Arrays.copyOf(s, n);
		for (int i = 3; i < n; i++) {
			tritab[i] = tritab[i - 1] + tritab[i - 2] + tritab[i - 3];
		}
		return tritab;
	}
}