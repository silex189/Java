package test.java.ticTacToe.utils;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import main.java.ticTacToe.utils.ClosedInterval;

@RunWith(Parameterized.class)
public class ClosedIntervalParametrizedWithoutConstructorTest {

	@Parameter(0) public int OUTMin;
	@Parameter(1) public int OUTMax;

	@Parameter(2) public int value;
	@Parameter(3) public ClosedInterval closedInterval;

	@Parameter(4) public int expectedLength;
	@Parameter(5) public ClosedInterval expectedShiftedClosedInterval;
	@Parameter(6) public boolean expectedIncludedValue;
	@Parameter(7) public boolean expectedIncludedClosedInterval;
	@Parameter(8) public boolean expectedIntersected;
	@Parameter(9) public ClosedInterval expectedIntersection;
	@Parameter(10) public ClosedInterval expectedUnion;
	
	@Parameters(name="{index}: [{0}, {1}], {2} y {3}")
	public static Collection<Object[]> data() {
		return Arrays
				.asList(new Object[][] {
						{ 2, 34, 16, new ClosedInterval(16, 30), 22,
								new ClosedInterval(28, 50), true, true, true,
								new ClosedInterval(16, 30),
								new ClosedInterval(12, 34) },
						{ -8, -4, 6, new ClosedInterval(-7, -5), 4,
								new ClosedInterval(-2, 2), false, true, true,
								new ClosedInterval(-7, -5),
								new ClosedInterval(-8, -4) },
						{ -8, 4, -2, new ClosedInterval(-7, -5), 12,
								new ClosedInterval(-10, 2), true, true, true,
								new ClosedInterval(-7, -5),
								new ClosedInterval(-8, 4) },
						{ -8, 4, 10, new ClosedInterval(-7, -5), 12,
								new ClosedInterval(2, 14), false, true, true,
								new ClosedInterval(-7, -5),
								new ClosedInterval(-8, 4) },
						{ -8, 4, 6, new ClosedInterval(2, 9), 12,
								new ClosedInterval(-2, 10), false, false, true,
								new ClosedInterval(2, 4),
								new ClosedInterval(-8, 9) }, });
	}

	private ClosedInterval OUTClosedInterval;
	
	@Before
	public void before() {
		OUTClosedInterval = new ClosedInterval(OUTMin, OUTMax);
	}

	@Test
	public void testLength() {
		int resultLength = OUTClosedInterval.length();
		assertEquals(expectedLength, resultLength);
	}

	@Test
	public void testShift() {
		OUTClosedInterval.shift(value);
		assertEquals(expectedShiftedClosedInterval, OUTClosedInterval);
	}

	@Test
	public void testIncludesValue() {
		boolean resultIncludedValue = OUTClosedInterval.includes(value);
		assertEquals(expectedIncludedValue, resultIncludedValue);
	}

	@Test
	public void testIncludesClosedInterval() {
		boolean resultIncludedClosedInterval = OUTClosedInterval.includes(closedInterval);
		assertEquals(expectedIncludedClosedInterval, resultIncludedClosedInterval);
	}

	@Test
	public void testIntersected() {
		boolean resultIntersected = OUTClosedInterval.intersected(closedInterval);
		assertEquals(expectedIntersected, resultIntersected);
	}

	@Test
	public void testIntersection() {
		ClosedInterval resultIntersection = OUTClosedInterval.intersection(closedInterval);
		assertEquals(expectedIntersection, resultIntersection);
	}

	@Test
	public void testUnion() {
		ClosedInterval resultUnion = OUTClosedInterval.union(closedInterval);
		assertEquals(expectedUnion, resultUnion);
	}

}