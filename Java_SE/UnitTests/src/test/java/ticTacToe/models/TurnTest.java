package test.java.ticTacToe.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class TurnTest {

	@Test
	public void testTurn() {
		// arrange
		Turn OUTTurn;
		// act
		OUTTurn = new Turn();
		Color resultColor = OUTTurn.take();
		// assertions
		Color expectedColor = Color.XS;
		assertEquals(expectedColor, resultColor);
	}

	@Test
	public void testOneChange() {
		// arrange
		Turn OUTTurn = new Turn();
		// act
		OUTTurn.change();
		Color resultColor = OUTTurn.take();
		// assertions
		Color expectedColor = Color.OS;
		assertEquals(expectedColor, resultColor);
	}

	@Test
	public void testTwoChange() {
		// arrange
		Turn OUTTurn = new Turn();
		// act
		OUTTurn.change();
		OUTTurn.change();
		Color resultColor = OUTTurn.take();
		// assertions
		Color expectedColor = Color.XS;
		assertEquals(expectedColor, resultColor);
	}

	@Test
	public void testThreeChange() {
		// arrange
		Turn OUTTurn = new Turn();
		// act
		OUTTurn.change();
		OUTTurn.change();
		OUTTurn.change();
		Color resultColor = OUTTurn.take();
		// assertions
		Color expectedColor = Color.OS;
		assertEquals(expectedColor, resultColor);
	}

}
