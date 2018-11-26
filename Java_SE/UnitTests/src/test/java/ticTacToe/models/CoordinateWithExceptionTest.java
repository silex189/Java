package test.java.ticTacToe.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import main.java.ticTacToe.models.Coordinate;
import main.java.ticTacToe.utils.Direction;

public class CoordinateWithExceptionTest {

	private Coordinate OUTCoordinate;

	@Test
	public void testCoordinate() {
		OUTCoordinate = new Coordinate();
		assertEquals(0, OUTCoordinate.getRow());
		assertEquals(0, OUTCoordinate.getColumn());
	}

	@Test
	public void testCoordinateIntInt() {
		OUTCoordinate = new Coordinate(1, 2);
		assertEquals(1, OUTCoordinate.getRow());
		assertEquals(2, OUTCoordinate.getColumn());
		OUTCoordinate = new Coordinate(0, 2);
		assertEquals(0, OUTCoordinate.getRow());
		assertEquals(2, OUTCoordinate.getColumn());
	}

	@Test
	public void testCoordinateIntIntWithException() {
		try {
			OUTCoordinate = new Coordinate(-1, 3);
			throw new Exception();
		} catch (AssertionError e) {
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	public void testCoordinateCoordinate() {
		OUTCoordinate = new Coordinate(new Coordinate(1, 2));
		assertEquals(1, OUTCoordinate.getRow());
		assertEquals(2, OUTCoordinate.getColumn());
		OUTCoordinate = new Coordinate(new Coordinate(0, 0));
		assertEquals(0, OUTCoordinate.getRow());
		assertEquals(0, OUTCoordinate.getColumn());
	}

	@Test
	public void testSetRow() {
		OUTCoordinate = new Coordinate(1, 2);
		OUTCoordinate.setRow(2);
		assertEquals(2, OUTCoordinate.getRow());
		assertEquals(2, OUTCoordinate.getColumn());
		OUTCoordinate = new Coordinate(2, 2);
		OUTCoordinate.setRow(0);
		assertEquals(0, OUTCoordinate.getRow());
		assertEquals(2, OUTCoordinate.getColumn());
	}

	@Test
	public void testSetRowWithExceptions() {
		try {
			OUTCoordinate = new Coordinate(1, 2);
			OUTCoordinate.setRow(-1);
			throw new Exception();
		} catch (AssertionError e) {
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	public void testSetColumn() {
		OUTCoordinate = new Coordinate(1, 2);
		OUTCoordinate.setColumn(0);
		assertEquals(1, OUTCoordinate.getRow());
		assertEquals(0, OUTCoordinate.getColumn());
		OUTCoordinate = new Coordinate(2, 2);
		OUTCoordinate.setColumn(1);
		assertEquals(2, OUTCoordinate.getRow());
		assertEquals(1, OUTCoordinate.getColumn());
	}

	@Test
	public void testSetColumnWithException() {
		try {
			OUTCoordinate = new Coordinate(1, 2);
			OUTCoordinate.setColumn(3);
			throw new Exception();
		} catch (AssertionError e) {
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	public void testDirection() {
		assertEquals(Direction.INVERSE_DIAGONAL,
				new Coordinate(1, 1).direction(new Coordinate(2, 0)));
		assertEquals(Direction.HORIZONTAL,
				new Coordinate(1, 2).direction(new Coordinate(1, 1)));
		assertEquals(Direction.INVERSE_DIAGONAL,
				new Coordinate(2, 0).direction(new Coordinate(0, 2)));
		assertEquals(Direction.VERTICAL,
				new Coordinate(2, 2).direction(new Coordinate(0, 2)));
		assertEquals(Direction.VERTICAL,
				new Coordinate(1, 2).direction(new Coordinate(2, 2)));
		assertEquals(Direction.HORIZONTAL,
				new Coordinate(0, 1).direction(new Coordinate(0, 2)));
		assertEquals(Direction.MAIN_DIAGONAL,
				new Coordinate(0, 0).direction(new Coordinate(2, 2)));
	}

}
