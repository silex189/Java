package test.java.ticTacToe.models;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TurnParametrizedTest {

	@Parameter(0) public Turn OUTTurn;

	@Parameter(1) public Color expectedTake;
	@Parameter(2) public Color expectedChange;

	@Parameters(name = "{index}: Con {0}")
	public static Collection<Object[]> data() {
		Turn turn = new Turn();
		Turn changedTurn = new Turn();
		changedTurn.change();
		return Arrays.asList(new Object[][] {
				{turn, Color.XS, Color.OS},
				{changedTurn, Color.OS, Color.XS},
		});
	}

	@Test
	public void testTake() {
		assertEquals(expectedTake, OUTTurn.take());
	}

	@Test
	public void testChange() {
		OUTTurn.change();
		assertEquals(expectedChange, OUTTurn.take());
	}

}
