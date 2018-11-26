package characteristics.risk.safetyNet.loweredExpectations.v2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComplexityCalculatorTest {

	private ComplexityCalculator complexity;

	@Test
	public void complexityIsZeroForNonExistentFiles() {
		assertEquals(0.0, complexity.of(new Source("NoSuchFile.java")), 0.0);
	}

	@Test
	public void complexityForSourceFile() {
		assertEquals(2.0, complexity.of(new Source("test/Sample1.java")), 0.0);
		assertEquals(5.0, complexity.of(new Source("test/Sample2.java")), 0.0);
	}
}
