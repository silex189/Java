package test.java.ticTacToe.utils;

import static org.junit.Assert.*;

import main.java.ticTacToe.utils.ClosedInterval;

public class ClosedIntervalObjectTest {

	private int OUTMin;
  
	private int OUTMax;

	private int value;
	
	private ClosedInterval closedInterval;

	private int expectedLength;

	private ClosedInterval expectedShiftedClosedInterval;

	private boolean expectedIncludedValue;

	private boolean expectedIncludedClosedInterval;

	private boolean expectedIntersected;

	private ClosedInterval expectedIntersection;

	private ClosedInterval expectedUnion;
	
	private ClosedInterval OUTClosedInterval;

	public ClosedIntervalObjectTest(
			int OUTMin, int OUTMax, // OUT
			int value, ClosedInterval closedInterval, // arguments
			int expectedLength, 
			ClosedInterval expectedShiftedClosedInterval,
			boolean expectedIncludedValue,
			boolean expectedIncludedClosedInterval,
			boolean expectedIntersected, 
			ClosedInterval expectedIntersection,
			ClosedInterval expectedUnion) {
		this.OUTMin = OUTMin;
		this.OUTMax = OUTMax;

		this.value = value;
		this.closedInterval = closedInterval;

		this.expectedLength = expectedLength;
		this.expectedShiftedClosedInterval = expectedShiftedClosedInterval;
		this.expectedIncludedValue = expectedIncludedValue;
		this.expectedIncludedClosedInterval = expectedIncludedClosedInterval;
		this.expectedIntersected = expectedIntersected;
		this.expectedIntersection = expectedIntersection;
		this.expectedUnion = expectedUnion;
	}

	private void before() {
		OUTClosedInterval = new ClosedInterval(OUTMin, OUTMax);
	}

	public void testLength() {
		this.before();
		int resultLength = OUTClosedInterval.length();
		assertEquals("For OUTClosedInterval " + OUTClosedInterval,
				expectedLength, resultLength);
	}

	public void testShift() {
		this.before();
		OUTClosedInterval.shift(value);
		assertEquals("For OUTClosedInterval " + OUTClosedInterval + " and value " + value,
				expectedShiftedClosedInterval, OUTClosedInterval);
	}

	public void testIncludesValue() {
		this.before();
		boolean resultIncludedValue = OUTClosedInterval.includes(value);
		assertEquals("For OUTClosedInterval " + OUTClosedInterval + " and value " + value, 
				expectedIncludedValue, resultIncludedValue);
	}

	public void testIncludesClosedInterval() {
		this.before();
		boolean resultIncludedClosedInterval = OUTClosedInterval
				.includes(closedInterval);
		assertEquals("For OUTClosedInterval " + OUTClosedInterval + " and closedInterval " + closedInterval,
				expectedIncludedClosedInterval, resultIncludedClosedInterval);
	}

	public void testIntersected() {
		this.before();
		boolean resultIntersected = OUTClosedInterval
				.intersected(closedInterval);
		assertEquals("For OUTClosedInterval " + OUTClosedInterval + " and closedInterval " + closedInterval,
				expectedIntersected, resultIntersected);
	}

	public void testIntersection() {
		this.before();
		ClosedInterval resultIntersection = OUTClosedInterval
				.intersection(closedInterval);
		assertEquals("For OUTClosedInterval " + OUTClosedInterval + " and closedInterval " + closedInterval,
				expectedIntersection, resultIntersection);
	}

	public void testUnion() {
		this.before();
		ClosedInterval resultUnion = OUTClosedInterval.union(closedInterval);
		assertEquals("For OUTClosedInterval " + OUTClosedInterval + " and closedInterval " + closedInterval,
				expectedUnion, resultUnion);
	}

}
