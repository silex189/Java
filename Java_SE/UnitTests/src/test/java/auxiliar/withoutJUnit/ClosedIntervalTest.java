package test.java.auxiliar.withoutJUnit;

import main.java.ticTacToe.utils.ClosedInterval;

public class ClosedIntervalTest {

	public void testLength() throws Exception {
		ClosedInterval closedInterval = new ClosedInterval(3, 10);
		int resultLength = closedInterval.length();
		int expectedLength = 7;
		if (expectedLength != resultLength) {
			throw new Exception("Con " + closedInterval + " esperaba " + expectedLength
					+ " pero fue " + resultLength);
		}
	}

	public void testShift() throws Exception {
		ClosedInterval closedInterval = new ClosedInterval(3, 10);
		int value = 5;
		ClosedInterval resultClosedInterval = new ClosedInterval(3, 10);
		resultClosedInterval.shift(value);
		ClosedInterval expectedClosedInterval = new ClosedInterval(8, 15);
		if (!resultClosedInterval.equals(expectedClosedInterval)) {
			throw new Exception("Con " + closedInterval + " y " + value
					+ " esperaba " + expectedClosedInterval + " pero fue "
					+ resultClosedInterval);
		}
	}
	
	public void testIncludesValue() throws Exception {
		ClosedInterval closedInterval = new ClosedInterval(3, 10);
		int value = 5;
		boolean resultIncludedValue = closedInterval.includes(value);
		boolean expectedIncludedValue = true;
		if (expectedIncludedValue != resultIncludedValue) {
			throw new Exception("Con " + closedInterval + " y " + value
					+ " esperaba " + expectedIncludedValue + " pero fue "
					+ resultIncludedValue);
		}
	}
	
	public static void main(String[] args) {
		ClosedIntervalTest closedIntervalTest = new ClosedIntervalTest();
		try {
			closedIntervalTest.testLength();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			closedIntervalTest.testShift();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			closedIntervalTest.testIncludesValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
