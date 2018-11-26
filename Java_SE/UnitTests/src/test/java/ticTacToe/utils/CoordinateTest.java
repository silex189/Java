package test.java.ticTacToe.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.ticTacToe.utils.Coordinate;
import main.java.ticTacToe.utils.Direction;

public class CoordinateTest {

	@Test
	public void testInRow() {
		assertFalse(new Coordinate(1,1).inRow(new Coordinate(2,3)));
		assertTrue(new Coordinate(1,2).inRow(new Coordinate(1,1)));
		assertFalse(new Coordinate(3,1).inRow(new Coordinate(1,3)));
		assertFalse(new Coordinate(2,2).inRow(new Coordinate(1,3)));
		assertFalse(new Coordinate(2,3).inRow(new Coordinate(3,3)));
		assertTrue(new Coordinate(1,2).inRow(new Coordinate(1,3)));
		assertFalse(new Coordinate(1,1).inRow(new Coordinate(3,3)));
	}
	
	@Test
	public void testInColumn() {
		assertFalse(new Coordinate(1,1).inColumn(new Coordinate(2,3)));
		assertFalse(new Coordinate(1,2).inColumn(new Coordinate(1,1)));
		assertFalse(new Coordinate(3,1).inColumn(new Coordinate(1,3)));
		assertFalse(new Coordinate(2,2).inColumn(new Coordinate(1,3)));
		assertTrue(new Coordinate(2,3).inColumn(new Coordinate(3,3)));
		assertFalse(new Coordinate(1,2).inColumn(new Coordinate(1,3)));
		assertFalse(new Coordinate(1,1).inColumn(new Coordinate(3,3)));
	}
	
	@Test
	public void testInMainDiagonal() {
		assertTrue(new Coordinate(1,1).inMainDiagonal());
		assertFalse(new Coordinate(1,2).inMainDiagonal());
		assertFalse(new Coordinate(3,1).inMainDiagonal());
		assertTrue(new Coordinate(2,2).inMainDiagonal());
		assertFalse(new Coordinate(2,3).inMainDiagonal());
		assertFalse(new Coordinate(1,2).inMainDiagonal());
		assertTrue(new Coordinate(1,1).inMainDiagonal());
	}
	
	@Test
	public void testDirection() {	
		assertEquals(Direction.NON_EXISTENT, new Coordinate(1,1).direction(new Coordinate(2,3)));
		assertEquals(Direction.HORIZONTAL, new Coordinate(1,2).direction(new Coordinate(1,1)));
		assertEquals(Direction.NON_EXISTENT, new Coordinate(3,1).direction(new Coordinate(1,3)));
		assertEquals(Direction.NON_EXISTENT, new Coordinate(2,2).direction(new Coordinate(1,3)));
		assertEquals(Direction.VERTICAL, new Coordinate(2,3).direction(new Coordinate(3,3)));
		assertEquals(Direction.HORIZONTAL, new Coordinate(1,2).direction(new Coordinate(1,3)));
		assertEquals(Direction.MAIN_DIAGONAL, new Coordinate(1,1).direction(new Coordinate(3,3)));
	}

}
