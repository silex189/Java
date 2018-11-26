package test.java.ticTacToe.models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TurnWithBeforeTest {

	private Turn OUTTurn;
	
	@Before
	public void before(){
		OUTTurn = new Turn();
	}
	
	@Test
	public void testTurn() {
		assertEquals(Color.XS, OUTTurn.take());
	}

	@Test
	public void testChange() {
		OUTTurn.change();
		assertEquals(Color.OS, OUTTurn.take());
		OUTTurn.change();
		assertEquals(Color.XS, OUTTurn.take());
		OUTTurn.change();
		assertEquals(Color.OS, OUTTurn.take());
	}

}
