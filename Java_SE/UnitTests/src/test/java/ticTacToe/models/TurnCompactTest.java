package test.java.ticTacToe.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class TurnCompactTest {

	@Test
	public void testTurn() {
		Turn OUTTurn = new Turn();
		assertEquals(Color.XS, OUTTurn.take());
	}

	@Test
	public void testChange() {
		Turn OUTTurn = new Turn();
		OUTTurn.change();
		assertEquals(Color.OS, OUTTurn.take());
		OUTTurn.change();
		assertEquals(Color.XS, OUTTurn.take());
		OUTTurn.change();
		assertEquals(Color.OS, OUTTurn.take());
	}

}
