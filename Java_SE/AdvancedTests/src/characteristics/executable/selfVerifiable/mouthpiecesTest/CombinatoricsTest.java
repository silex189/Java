package characteristics.executable.selfVerifiable.mouthpiecesTest;

import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Ignore;
import org.junit.Test;

public class CombinatoricsTest {

	@Test(expected = AssertionError.class)
	public void testFactorialWithNegativeValueExceptionrror() {
		Combinatorics.factorial(-5);
	}

	@Test(expected = AssertionError.class)
	public void testFactorialWithMaxValueExceptionrror() {
		Combinatorics.factorial(Combinatorics.FACTORIAL_MAX_VALUE + 1);
	}

	@Test
	public void testFactorial() {
		testFactoria(0, 1);
		testFactoria(1, 1);
		testFactoria(1, 20);
	}

	public void testFactoria(long value, long expected) {
		System.out.println("REQUIREMENTS: " + value + "!=" + expected);
		System.out.println("SYSTEM: " + value + "!=" + Combinatorics.factorial(value));
		assertThat(Combinatorics.factorial(value), is(expected));
	}

	@Test
	@Ignore
	public void calulateFactorialMaxValue() {
		long max = Long.MAX_VALUE;
		long min = 0;
		long average = average(max, min);
		boolean isStable;
		do {
			isStable = isStable(average, max, min);
			try {
				System.out.print(average + " entre [" + min + ", " + max + "] con ... ");
				System.out.print(Combinatorics.factorial(average));
				if (!isStable) {
					System.out.println(" A por más");
					min = average;
				}
			} catch (AssertionError ex) {
				if (!isStable) {
					System.out.println("Un poco menos");
					max = average;
				}
			} finally {
				average = average(max, min);
			}
		} while (!isStable);
	}

	private static long average(long max, long min) {
		return min + (max - min) / 2;
	}

	private static boolean isStable(long average, long max, long min) {
		return (average == min || average == max);
	}

}
