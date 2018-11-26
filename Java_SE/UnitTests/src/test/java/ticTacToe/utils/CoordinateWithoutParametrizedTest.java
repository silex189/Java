package test.java.ticTacToe.utils;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import main.java.ticTacToe.utils.Coordinate;
import main.java.ticTacToe.utils.Direction;

public class CoordinateWithoutParametrizedTest {

	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				// private int OUTRow;
				// private int OUTColumn;
				//
				// private Coordinate coordinate;
				//
				// private boolean expectedInRow;
				// private boolean expectedInColumn;
				// private boolean expectedInMainDiagonal;
				// private Direction expectedDirection;
				{ 2, 8, new Coordinate(2, 5), true, false, false,
						Direction.HORIZONTAL },
				{ 1, 6, new Coordinate(3, 0), false, false, false,
						Direction.NON_EXISTENT },
				{ 2, 8, new Coordinate(2, 5), true, false, false,
						Direction.HORIZONTAL }, });
	}

	@Test
	public void test() {
		for (Object[] objects : CoordinateWithoutParametrizedTest.data()) {
			CoordinateObjectTest coordinateObjectTest = new CoordinateObjectTest(
					(int) objects[0], (int) objects[1], // OUT
					(Coordinate) objects[2], // arguments
					(boolean) objects[3],
					(boolean) objects[4],
					(boolean) objects[5],
					(Direction) objects[6]);
			
			coordinateObjectTest.testInRow();
			coordinateObjectTest.testInColumn();
			coordinateObjectTest.testInMainDiagonal();
			coordinateObjectTest.testDirection();
		}
	}
}