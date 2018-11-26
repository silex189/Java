package test.java.ticTacToe.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.ticTacToe.utils.ClosedInterval;

public class ClosedIntervalReusabilityTest {

	private ClosedInterval OUTClosedInterval;

	public void setUp(int OUTMin, int OUTMax) {
		OUTClosedInterval = new ClosedInterval(OUTMin, OUTMax);
	}

	@Test
	public void testLength() {
		this.setUp(0, 0);
		int resultLength = OUTClosedInterval.length();
		int expectedLength = 0;
		assertEquals(expectedLength, resultLength);
	}

	@Test
	public void testShift() {
		this.setUp(0, 0);
		int value = 3;
		OUTClosedInterval.shift(value);
		ClosedInterval expectedShiftedClosedInterval = new ClosedInterval(3, 3);
		assertEquals(expectedShiftedClosedInterval, OUTClosedInterval);
	}

	@Test
	public void testIncludesValue() {
		this.setUp(0, 0);
		int value = 3;
		boolean resultIncludedValue = OUTClosedInterval.includes(value);
		boolean expectedIncludedValue = false;
		assertEquals(expectedIncludedValue, resultIncludedValue);
	}

	@Test
	public void testIncludesClosedInterval() {
		this.setUp(2, 6);
		ClosedInterval closedInterval = new ClosedInterval(3, 5);
		boolean resultIncludedClosedInterval = OUTClosedInterval
				.includes(closedInterval);
		boolean expectedIncludedClosedInterval = true;
		assertEquals(expectedIncludedClosedInterval,
				resultIncludedClosedInterval);
	}

	@Test
	public void testIntersected() {
		this.setUp(2, 6);
		ClosedInterval closedInterval = new ClosedInterval(3, 15);
		boolean resultIntersected = OUTClosedInterval
				.intersected(closedInterval);
		boolean expectedIntersected = true;
		assertEquals(expectedIntersected, resultIntersected);
	}

	@Test
	public void testIntersection() {
		this.setUp(2, 6);
		ClosedInterval closedInterval = new ClosedInterval(3, 15);
		ClosedInterval resultIntersection = OUTClosedInterval
				.intersection(closedInterval);
		ClosedInterval expectedIntersection = new ClosedInterval(3, 6);
		assertEquals(expectedIntersection, resultIntersection);
	}

	@Test
	public void testUnion() {
		this.setUp(2, 6);
		ClosedInterval closedInterval = new ClosedInterval(3, 15);
		ClosedInterval resultUnion = OUTClosedInterval.union(closedInterval);
		ClosedInterval expectedUnion = new ClosedInterval(2, 15);
		assertEquals(expectedUnion, resultUnion);
	}

}
