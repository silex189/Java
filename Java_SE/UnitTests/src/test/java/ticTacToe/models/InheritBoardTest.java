package test.java.ticTacToe.models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public abstract class InheritBoardTest {

	protected Board OUTBoard;

	@Before
	public abstract void before();

	@Test
	public void testBoard() {
		for (int i = 0; i < Color.values().length - 1; i++) {
			for (int j = 0; j < Color.values().length - 1; j++) {
				assertEquals(Color.NONE,
						OUTBoard.getColor(new Coordinate(i, j)));
			}
		}
	}

	@Test
	public void testGetColor() {
		for (int i = 0; i < Color.values().length - 1; i++) {
			for (int j = 0; j < Color.values().length - 1; j++) {
				assertEquals(Color.NONE,
						OUTBoard.getColor(new Coordinate(i, j)));
			}
		}
		OUTBoard.put(new Coordinate(0, 0), Color.OS);
		assertEquals(Color.OS, OUTBoard.getColor(new Coordinate(0, 0)));
		OUTBoard.put(new Coordinate(0, 1), Color.XS);
		assertEquals(Color.XS, OUTBoard.getColor(new Coordinate(0, 1)));
		OUTBoard.put(new Coordinate(0, 2), Color.OS);
		assertEquals(Color.OS, OUTBoard.getColor(new Coordinate(0, 2)));
		OUTBoard.put(new Coordinate(1, 0), Color.XS);
		assertEquals(Color.XS, OUTBoard.getColor(new Coordinate(1, 0)));
		OUTBoard.put(new Coordinate(1, 1), Color.OS);
		assertEquals(Color.OS, OUTBoard.getColor(new Coordinate(1, 1)));
		OUTBoard.put(new Coordinate(1, 2), Color.XS);
		assertEquals(Color.XS, OUTBoard.getColor(new Coordinate(1, 2)));
		OUTBoard.remove(new Coordinate(0, 0), Color.OS);
		OUTBoard.remove(new Coordinate(0, 1), Color.XS);
		OUTBoard.remove(new Coordinate(0, 2), Color.OS);
		OUTBoard.remove(new Coordinate(1, 0), Color.XS);
		OUTBoard.remove(new Coordinate(1, 1), Color.OS);
		OUTBoard.remove(new Coordinate(1, 2), Color.XS);
		for (int i = 0; i < Color.values().length - 1; i++) {
			for (int j = 0; j < Color.values().length - 1; j++) {
				assertEquals(Color.NONE,
						OUTBoard.getColor(new Coordinate(i, j)));
			}
		}
	}

	@Test
	public void testComplete() {
		assertFalse(OUTBoard.complete());
		OUTBoard.put(new Coordinate(0, 0), Color.OS);
		assertFalse(OUTBoard.complete());
		OUTBoard.put(new Coordinate(0, 1), Color.XS);
		assertFalse(OUTBoard.complete());
		OUTBoard.put(new Coordinate(0, 2), Color.OS);
		assertFalse(OUTBoard.complete());
		OUTBoard.put(new Coordinate(1, 0), Color.XS);
		assertFalse(OUTBoard.complete());
		OUTBoard.put(new Coordinate(1, 1), Color.OS);
		assertFalse(OUTBoard.complete());
		OUTBoard.put(new Coordinate(1, 2), Color.XS);
		assertTrue(OUTBoard.complete());
		OUTBoard.remove(new Coordinate(0, 0), Color.OS);
		assertFalse(OUTBoard.complete());
		OUTBoard.remove(new Coordinate(0, 1), Color.XS);
		assertFalse(OUTBoard.complete());
		OUTBoard.remove(new Coordinate(0, 2), Color.OS);
		assertFalse(OUTBoard.complete());
		OUTBoard.remove(new Coordinate(1, 0), Color.XS);
		assertFalse(OUTBoard.complete());
		OUTBoard.remove(new Coordinate(1, 1), Color.OS);
		assertFalse(OUTBoard.complete());
		OUTBoard.remove(new Coordinate(1, 2), Color.XS);
		assertFalse(OUTBoard.complete());
	}

	@Test
	public void testExistTicTacToe() {
		OUTBoard.put(new Coordinate(0, 0), Color.OS);
		OUTBoard.put(new Coordinate(0, 1), Color.XS);
		OUTBoard.put(new Coordinate(0, 2), Color.OS);
		OUTBoard.put(new Coordinate(1, 0), Color.XS);
		OUTBoard.put(new Coordinate(1, 1), Color.OS);
		OUTBoard.put(new Coordinate(1, 2), Color.XS);
		assertFalse(OUTBoard.existTicTacToe(Color.OS));
		assertFalse(OUTBoard.existTicTacToe(Color.XS));
		OUTBoard.remove(new Coordinate(0, 0), Color.OS);
		OUTBoard.put(new Coordinate(2, 0), Color.OS);
		assertTrue(OUTBoard.existTicTacToe(Color.OS));
		assertFalse(OUTBoard.existTicTacToe(Color.XS));
		OUTBoard.remove(new Coordinate(1, 1), Color.OS);
		OUTBoard.put(new Coordinate(2, 2), Color.OS);
		OUTBoard.remove(new Coordinate(0, 1), Color.XS);
		OUTBoard.put(new Coordinate(1, 1), Color.XS);
		assertFalse(OUTBoard.existTicTacToe(Color.OS));
		assertTrue(OUTBoard.existTicTacToe(Color.XS));
	}

	@Test
	public void testEmpty() {
		assertTrue(OUTBoard.empty(new Coordinate(0, 0)));
		OUTBoard.put(new Coordinate(0, 0), Color.OS);
		assertFalse(OUTBoard.empty(new Coordinate(0, 0)));
		assertTrue(OUTBoard.empty(new Coordinate(0, 1)));
		OUTBoard.put(new Coordinate(0, 1), Color.XS);
		assertFalse(OUTBoard.empty(new Coordinate(0, 1)));
		assertTrue(OUTBoard.empty(new Coordinate(0, 2)));
		OUTBoard.put(new Coordinate(0, 2), Color.OS);
		assertFalse(OUTBoard.empty(new Coordinate(0, 2)));
		assertTrue(OUTBoard.empty(new Coordinate(1, 0)));
		OUTBoard.put(new Coordinate(1, 0), Color.XS);
		assertFalse(OUTBoard.empty(new Coordinate(1, 0)));
		assertTrue(OUTBoard.empty(new Coordinate(1, 1)));
		OUTBoard.put(new Coordinate(1, 1), Color.OS);
		assertFalse(OUTBoard.empty(new Coordinate(1, 1)));
		assertTrue(OUTBoard.empty(new Coordinate(1, 2)));
		OUTBoard.put(new Coordinate(1, 2), Color.XS);
		assertFalse(OUTBoard.empty(new Coordinate(1, 2)));
		OUTBoard.remove(new Coordinate(1, 2), Color.XS);
		assertTrue(OUTBoard.empty(new Coordinate(1, 2)));
		OUTBoard.remove(new Coordinate(1, 1), Color.OS);
		assertTrue(OUTBoard.empty(new Coordinate(1, 1)));
		OUTBoard.remove(new Coordinate(1, 0), Color.XS);
		assertTrue(OUTBoard.empty(new Coordinate(1, 0)));
		OUTBoard.remove(new Coordinate(0, 2), Color.OS);
		assertTrue(OUTBoard.empty(new Coordinate(0, 2)));
		OUTBoard.remove(new Coordinate(0, 1), Color.XS);
		assertTrue(OUTBoard.empty(new Coordinate(0, 1)));
		OUTBoard.remove(new Coordinate(0, 0), Color.OS);
		assertTrue(OUTBoard.empty(new Coordinate(0, 0)));
	}

	@Test
	public void testFull() {
		assertFalse(OUTBoard.full(new Coordinate(0, 0), Color.OS));
		OUTBoard.put(new Coordinate(0, 0), Color.OS);
		assertTrue(OUTBoard.full(new Coordinate(0, 0), Color.OS));
		assertFalse(OUTBoard.full(new Coordinate(0, 1), Color.XS));
		OUTBoard.put(new Coordinate(0, 1), Color.XS);
		assertTrue(OUTBoard.full(new Coordinate(0, 1), Color.XS));
		assertFalse(OUTBoard.full(new Coordinate(0, 2), Color.OS));
		OUTBoard.put(new Coordinate(0, 2), Color.OS);
		assertTrue(OUTBoard.full(new Coordinate(0, 2), Color.OS));
		assertFalse(OUTBoard.full(new Coordinate(1, 0), Color.XS));
		OUTBoard.put(new Coordinate(1, 0), Color.XS);
		assertTrue(OUTBoard.full(new Coordinate(1, 0), Color.XS));
		assertFalse(OUTBoard.full(new Coordinate(1, 1), Color.OS));
		OUTBoard.put(new Coordinate(1, 1), Color.OS);
		assertTrue(OUTBoard.full(new Coordinate(1, 1), Color.OS));
		assertFalse(OUTBoard.full(new Coordinate(1, 2), Color.XS));
		OUTBoard.put(new Coordinate(1, 2), Color.XS);
		assertTrue(OUTBoard.full(new Coordinate(1, 2), Color.XS));
		OUTBoard.remove(new Coordinate(1, 2), Color.XS);
		assertFalse(OUTBoard.full(new Coordinate(1, 2), Color.XS));
		OUTBoard.remove(new Coordinate(1, 1), Color.OS);
		assertFalse(OUTBoard.full(new Coordinate(1, 1), Color.OS));
		OUTBoard.remove(new Coordinate(1, 0), Color.XS);
		assertFalse(OUTBoard.full(new Coordinate(1, 0), Color.XS));
		OUTBoard.remove(new Coordinate(0, 2), Color.OS);
		assertFalse(OUTBoard.full(new Coordinate(0, 2), Color.OS));
		OUTBoard.remove(new Coordinate(0, 1), Color.XS);
		assertFalse(OUTBoard.full(new Coordinate(0, 1), Color.XS));
		OUTBoard.remove(new Coordinate(0, 0), Color.OS);
		assertFalse(OUTBoard.full(new Coordinate(0, 0), Color.OS));
	}

	@Test(expected = AssertionError.class)
	public void testPutSameColorWithException() {
		OUTBoard.put(new Coordinate(0, 0), Color.OS);
		OUTBoard.put(new Coordinate(0, 0), Color.OS);
	}

	@Test(expected = AssertionError.class)
	public void testPutDistinctColorWithException() {
		OUTBoard.put(new Coordinate(0, 0), Color.OS);
		OUTBoard.put(new Coordinate(0, 0), Color.XS);
	}

	@Test(expected = AssertionError.class)
	public void testRemoveEmptyWithException() {
		OUTBoard.remove(new Coordinate(0, 0), Color.OS);
	}

	@Test(expected = AssertionError.class)
	public void testRemoveDistinctColorWithException() {
		OUTBoard.put(new Coordinate(0, 0), Color.OS);
		OUTBoard.remove(new Coordinate(0, 0), Color.XS);
	}

	@Test
	public void testClear() {
		OUTBoard.put(new Coordinate(0, 0), Color.OS);
		OUTBoard.put(new Coordinate(0, 1), Color.XS);
		OUTBoard.put(new Coordinate(0, 2), Color.OS);
		OUTBoard.put(new Coordinate(1, 0), Color.XS);
		OUTBoard.put(new Coordinate(1, 1), Color.OS);
		OUTBoard.put(new Coordinate(1, 2), Color.XS);
		OUTBoard.clear();
		for (int i = 0; i < Color.values().length - 1; i++) {
			for (int j = 0; j < Color.values().length - 1; j++) {
				assertEquals(Color.NONE,
						OUTBoard.getColor(new Coordinate(i, j)));
			}
		}
	}

}
