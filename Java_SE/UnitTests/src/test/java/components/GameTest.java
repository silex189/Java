package test.java.components;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.ticTacToe.models.Game;
import main.java.ticTacToe.models.Color;
import main.java.ticTacToe.models.Coordinate;
import main.java.ticTacToe.models.State;

public class GameTest {

	private Game OUTGame;

	@Before
	public void before() {
		OUTGame = new Game();
	}

	@Test
	public void testGame() {
		for (int i = 0; i < Color.values().length - 1; i++) {
			for (int j = 0; j < Color.values().length - 1; j++) {
				assertEquals(Color.NONE,
						OUTGame.getColor(new Coordinate(i, j)));
			}
		}
		assertEquals(State.INITIAL, OUTGame.getState());
	}

	@Test
	public void testGetColor() {
		for (int i = 0; i < Color.values().length - 1; i++) {
			for (int j = 0; j < Color.values().length - 1; j++) {
				assertEquals(Color.NONE,
						OUTGame.getColor(new Coordinate(i, j)));
			}
		}
		OUTGame.put(new Coordinate(0, 0));
		assertEquals(Color.XS, OUTGame.getColor(new Coordinate(0, 0)));
		OUTGame.change();
		OUTGame.put(new Coordinate(0, 1));
		assertEquals(Color.OS, OUTGame.getColor(new Coordinate(0, 1)));
		OUTGame.change();
		OUTGame.put(new Coordinate(0, 2));
		assertEquals(Color.XS, OUTGame.getColor(new Coordinate(0, 2)));
		OUTGame.change();
		OUTGame.put(new Coordinate(1, 0));
		assertEquals(Color.OS, OUTGame.getColor(new Coordinate(1, 0)));
		OUTGame.change();
		OUTGame.put(new Coordinate(1, 1));
		assertEquals(Color.XS, OUTGame.getColor(new Coordinate(1, 1)));
		OUTGame.change();
		OUTGame.put(new Coordinate(1, 2));
		assertEquals(Color.OS, OUTGame.getColor(new Coordinate(1, 2)));
		OUTGame.change();
		OUTGame.remove(new Coordinate(0, 0));
		OUTGame.change();
		OUTGame.remove(new Coordinate(0, 1));
		OUTGame.change();
		OUTGame.remove(new Coordinate(0, 2));
		OUTGame.change();
		OUTGame.remove(new Coordinate(1, 0));
		OUTGame.change();
		OUTGame.remove(new Coordinate(1, 1));
		OUTGame.change();
		OUTGame.remove(new Coordinate(1, 2));
		for (int i = 0; i < Color.values().length - 1; i++) {
			for (int j = 0; j < Color.values().length - 1; j++) {
				assertEquals(Color.NONE,
						OUTGame.getColor(new Coordinate(i, j)));
			}
		}
	}

	@Test
	public void testComplete() {
		assertFalse(OUTGame.complete());
		OUTGame.put(new Coordinate(0, 0));
		assertFalse(OUTGame.complete());
		OUTGame.change();
		OUTGame.put(new Coordinate(0, 1));
		assertFalse(OUTGame.complete());
		OUTGame.change();
		OUTGame.put(new Coordinate(0, 2));
		assertFalse(OUTGame.complete());
		OUTGame.change();
		OUTGame.put(new Coordinate(1, 0));
		assertFalse(OUTGame.complete());
		OUTGame.change();
		OUTGame.put(new Coordinate(1, 1));
		assertFalse(OUTGame.complete());
		OUTGame.change();
		OUTGame.put(new Coordinate(1, 2));
		assertTrue(OUTGame.complete());
		OUTGame.change();
		OUTGame.remove(new Coordinate(0, 0));
		assertFalse(OUTGame.complete());
		OUTGame.change();
		OUTGame.remove(new Coordinate(0, 1));
		assertFalse(OUTGame.complete());
		OUTGame.change();
		OUTGame.remove(new Coordinate(0, 2));
		assertFalse(OUTGame.complete());
		OUTGame.change();
		OUTGame.remove(new Coordinate(1, 0));
		assertFalse(OUTGame.complete());
		OUTGame.change();
		OUTGame.remove(new Coordinate(1, 1));
		assertFalse(OUTGame.complete());
		OUTGame.change();
		OUTGame.remove(new Coordinate(1, 2));
		assertFalse(OUTGame.complete());
	}

	@Test
	public void testExistTicTacToe() {
		OUTGame.put(new Coordinate(0, 0));
		OUTGame.change();
		OUTGame.put(new Coordinate(0, 1));
		OUTGame.change();
		OUTGame.put(new Coordinate(0, 2));
		OUTGame.change();
		OUTGame.put(new Coordinate(1, 0));
		OUTGame.change();
		OUTGame.put(new Coordinate(1, 1));
		OUTGame.change();
		OUTGame.put(new Coordinate(1, 2));
		assertFalse(OUTGame.existTicTacToe());
		OUTGame.change();
		OUTGame.remove(new Coordinate(0, 0));
		OUTGame.put(new Coordinate(2, 0));
		assertTrue(OUTGame.existTicTacToe());
		OUTGame.remove(new Coordinate(1, 1));
		OUTGame.put(new Coordinate(2, 2));
	}


	public void testEmpty() {
		assertTrue(OUTGame.empty(new Coordinate(0, 0)));
		OUTGame.put(new Coordinate(0, 0));
		assertFalse(OUTGame.empty(new Coordinate(0, 0)));
		assertTrue(OUTGame.empty(new Coordinate(0, 1)));
		OUTGame.put(new Coordinate(0, 1));
		assertFalse(OUTGame.empty(new Coordinate(0, 1)));
		assertTrue(OUTGame.empty(new Coordinate(0, 2)));
		OUTGame.put(new Coordinate(0, 2));
		assertFalse(OUTGame.empty(new Coordinate(0, 2)));
		assertTrue(OUTGame.empty(new Coordinate(1, 0)));
		OUTGame.put(new Coordinate(1, 0));
		assertFalse(OUTGame.empty(new Coordinate(1, 0)));
		assertTrue(OUTGame.empty(new Coordinate(1, 1)));
		OUTGame.put(new Coordinate(1, 1));
		assertFalse(OUTGame.empty(new Coordinate(1, 1)));
		assertTrue(OUTGame.empty(new Coordinate(1, 2)));
		OUTGame.put(new Coordinate(1, 2));
		assertFalse(OUTGame.empty(new Coordinate(1, 2)));
		OUTGame.remove(new Coordinate(1, 2));
		assertTrue(OUTGame.empty(new Coordinate(1, 2)));
		OUTGame.remove(new Coordinate(1, 1));
		assertTrue(OUTGame.empty(new Coordinate(1, 1)));
		OUTGame.remove(new Coordinate(1, 0));
		assertTrue(OUTGame.empty(new Coordinate(1, 0)));
		OUTGame.remove(new Coordinate(0, 2));
		assertTrue(OUTGame.empty(new Coordinate(0, 2)));
		OUTGame.remove(new Coordinate(0, 1));
		assertTrue(OUTGame.empty(new Coordinate(0, 1)));
		OUTGame.remove(new Coordinate(0, 0));
		assertTrue(OUTGame.empty(new Coordinate(0, 0)));
	}


	public void testFull() {
		assertFalse(OUTGame.full(new Coordinate(0, 0)));
		OUTGame.put(new Coordinate(0, 0));
		assertTrue(OUTGame.full(new Coordinate(0, 0)));
		assertFalse(OUTGame.full(new Coordinate(0, 1)));
		OUTGame.put(new Coordinate(0, 1));
		assertTrue(OUTGame.full(new Coordinate(0, 1)));
		assertFalse(OUTGame.full(new Coordinate(0, 2)));
		OUTGame.put(new Coordinate(0, 2));
		assertTrue(OUTGame.full(new Coordinate(0, 2)));
		assertFalse(OUTGame.full(new Coordinate(1, 0)));
		OUTGame.put(new Coordinate(1, 0));
		assertTrue(OUTGame.full(new Coordinate(1, 0)));
		assertFalse(OUTGame.full(new Coordinate(1, 1)));
		OUTGame.put(new Coordinate(1, 1));
		assertTrue(OUTGame.full(new Coordinate(1, 1)));
		assertFalse(OUTGame.full(new Coordinate(1, 2)));
		OUTGame.put(new Coordinate(1, 2));
		assertTrue(OUTGame.full(new Coordinate(1, 2)));
		OUTGame.remove(new Coordinate(1, 2));
		assertFalse(OUTGame.full(new Coordinate(1, 2)));
		OUTGame.remove(new Coordinate(1, 1));
		assertFalse(OUTGame.full(new Coordinate(1, 1)));
		OUTGame.remove(new Coordinate(1, 0));
		assertFalse(OUTGame.full(new Coordinate(1, 0)));
		OUTGame.remove(new Coordinate(0, 2));
		assertFalse(OUTGame.full(new Coordinate(0, 2)));
		OUTGame.remove(new Coordinate(0, 1));
		assertFalse(OUTGame.full(new Coordinate(0, 1)));
		OUTGame.remove(new Coordinate(0, 0));
		assertFalse(OUTGame.full(new Coordinate(0, 0)));
	}


	public void testPutSameColorWithException() {
		OUTGame.put(new Coordinate(0, 0));
		OUTGame.put(new Coordinate(0, 0));
	}


	public void testPutDistinctColorWithException() {
		OUTGame.put(new Coordinate(0, 0));
		OUTGame.put(new Coordinate(0, 0));
	}


	public void testRemoveEmptyWithException() {
		OUTGame.remove(new Coordinate(0, 0));
	}


	public void testRemoveDistinctColorWithException() {
		OUTGame.put(new Coordinate(0, 0));
		OUTGame.remove(new Coordinate(0, 0));
	}


	public void testClear() {
		OUTGame.put(new Coordinate(0, 0));
		OUTGame.put(new Coordinate(0, 1));
		OUTGame.put(new Coordinate(0, 2));
		OUTGame.put(new Coordinate(1, 0));
		OUTGame.put(new Coordinate(1, 1));
		OUTGame.put(new Coordinate(1, 2));
		OUTGame.clear();
		for (int i = 0; i < Color.values().length - 1; i++) {
			for (int j = 0; j < Color.values().length - 1; j++) {
				assertEquals(Color.NONE,
						OUTGame.getColor(new Coordinate(i, j)));
			}
		}
	}

}
