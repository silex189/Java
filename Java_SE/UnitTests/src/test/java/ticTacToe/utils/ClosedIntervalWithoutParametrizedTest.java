package test.java.ticTacToe.utils;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import main.java.ticTacToe.utils.ClosedInterval;

public class ClosedIntervalWithoutParametrizedTest {

	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
//				private int SUTMin;
//				private int SUTMax;
//				
//				private int value;
//				private ClosedInterval closedInterval;
//				
//				private int expectedLength;
//				private ClosedInterval expectedShiftedClosedInterval;
//				private boolean expectedIncludedValue;
//				private boolean expectedIncludedClosedInterval;
//				private boolean expectedIntersected;
//				private ClosedInterval expectedIntersection;
//				private ClosedInterval expectedUnion;
				{ 12, 34, 
					16, new ClosedInterval(16, 30), 
					22, new ClosedInterval(28, 50), true, true, true,
						new ClosedInterval(16, 30), 
						new ClosedInterval(12, 34)},
				{ -8, -4, 
					6, new ClosedInterval(-7, -5), 
					4, new ClosedInterval(-2, 2), false, true, true,
					new ClosedInterval(-7, -5), 
					new ClosedInterval(-8, -4)},
				{ -8, 4, 
					-2, new ClosedInterval(-7, -5), 
					12,	new ClosedInterval(-10, 2), true, true, true,
					new ClosedInterval(-7, -5), 
					new ClosedInterval(-8, 4)},
				{ -8, 4, 
					10, new ClosedInterval(-7, -5), 
					12, new ClosedInterval(2, 14), false, true, true,
					new ClosedInterval(-7, -5), 
					new ClosedInterval(-8, 4)},
				{ -8, 4, 
					6, new ClosedInterval(2, 9),
					12, new ClosedInterval(-2, 10), false, false, true,
					new ClosedInterval(2, 4), 
					new ClosedInterval(-8, 9)}, });
	}

	@Test
	public void test() {
		for (Object[] objects : ClosedIntervalWithoutParametrizedTest.data()) {
			ClosedIntervalObjectTest closedIntervalObjectTest = new ClosedIntervalObjectTest(
				(int) objects[0], (int) objects[1], // OUT
				(int) objects[2], (ClosedInterval) objects[3], // arguments
				(int) objects[4],
				(ClosedInterval) objects[5],
				(boolean) objects[6],
				(boolean) objects[7],
				(boolean) objects[8],
				(ClosedInterval) objects[9],
				(ClosedInterval) objects[10]);

			closedIntervalObjectTest.testLength();
			closedIntervalObjectTest.testShift();
			closedIntervalObjectTest.testIncludesValue();
			closedIntervalObjectTest.testIncludesClosedInterval();
			closedIntervalObjectTest.testIntersected();
			closedIntervalObjectTest.testIntersection();
			closedIntervalObjectTest.testUnion();
		}
	}

}