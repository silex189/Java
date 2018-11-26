package test.java.ticTacToe.utils;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.java.ticTacToe.utils.Coordinate;
import main.java.ticTacToe.utils.Direction;

@RunWith(Parameterized.class)
public class CoordinateParametrizedTest {

	private int OUTRow;
	private int OUTColumn;

	private Coordinate coordinate;

	private boolean expectedInRow;
	private boolean expectedInColumn;
	private boolean expectedInMainDiagonal;
	private Direction expectedDirection;
	
	@Parameters(name="({0}, {1}) con {2}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{ 2, 8, new Coordinate(2, 5), true, false, false,
						Direction.HORIZONTAL },
				{ 2, 8, new Coordinate(2, 5), true, false, false,
						Direction.HORIZONTAL },
				{ 2, 8, new Coordinate(2, 5), true, false, false,
						Direction.HORIZONTAL },
				{ 1, 6, new Coordinate(6, 6), false, true, false,
						Direction.VERTICAL },});
	}
	
	public CoordinateParametrizedTest(
			int OUTRow, int OUTColumn, // OUT
			Coordinate coordinate, // arguments
			boolean expectedInRow, 
			boolean expectedInColumn,
			boolean expectedInMainDiagonal, 
			Direction expectedDirection) {
		this.OUTRow = OUTRow;
		this.OUTColumn = OUTColumn;

		this.coordinate = coordinate;

		this.expectedInRow = expectedInRow;
		this.expectedInColumn = expectedInColumn;
		this.expectedInMainDiagonal = expectedInMainDiagonal;
		this.expectedDirection = expectedDirection;
	}
	
	private Coordinate OUTCoordinate;
	
	@Before
	public void before() {
		OUTCoordinate = new Coordinate(OUTRow, OUTColumn);
	}

	@Test
	public void testInRow() {
		assertEquals(expectedInRow, OUTCoordinate.inRow(coordinate));
	}

	@Test
	public void testInColumn() {
		assertEquals(expectedInColumn, OUTCoordinate.inColumn(coordinate));
	}
	
	@Test
	public void testInMainDiagonal() {
		assertEquals(expectedInMainDiagonal, OUTCoordinate.inMainDiagonal());
	}
	
	@Test
	public void testDirection() {
		assertEquals(expectedDirection, OUTCoordinate.direction(coordinate));
	}

}
