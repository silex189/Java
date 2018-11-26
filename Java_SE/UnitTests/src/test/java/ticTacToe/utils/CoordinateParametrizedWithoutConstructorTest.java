package test.java.ticTacToe.utils;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import main.java.ticTacToe.utils.Coordinate;
import main.java.ticTacToe.utils.Direction;

@RunWith(Parameterized.class)
public class CoordinateParametrizedWithoutConstructorTest {

	@Parameter(0) public int OUTRow;
	@Parameter(1) public int OUTColumn;

	@Parameter(2) public Coordinate coordinate;

	@Parameter(3) public boolean expectedInRow;
	@Parameter(4) public boolean expectedInColumn;
	@Parameter(5) public boolean expectedInMainDiagonal;
	@Parameter(6) public Direction expectedDirection;
	
	@Parameters(name="({0}, {1}) y {2}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{ 2, 8, new Coordinate(2, 5), true, false, false,
						Direction.HORIZONTAL },
				{ 2, 8, new Coordinate(2, 5), true, false, false,
						Direction.HORIZONTAL },
				{ 2, 8, new Coordinate(2, 5), true, false, false,
						Direction.HORIZONTAL }, });
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
		boolean resultInColumn = OUTCoordinate.inColumn(coordinate);
		assertEquals("For OUTCoordinate " + OUTCoordinate + " and "
				+ coordinate, expectedInColumn, resultInColumn);
	}
	
	@Test
	public void testInMainDiagonal() {
		boolean resultInMainDiagonal = OUTCoordinate.inMainDiagonal();
		assertEquals("For OUTCoordinate " + OUTCoordinate, expectedInMainDiagonal, resultInMainDiagonal);
	}
	
	@Test
	public void testDirection() {
		Direction resultDirection = OUTCoordinate.direction(coordinate);
		assertEquals("For OUTCoordinate " + OUTCoordinate + " and "
				+ coordinate, expectedDirection, resultDirection);
	}

}
