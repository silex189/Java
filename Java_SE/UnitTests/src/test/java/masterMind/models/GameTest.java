package test.java.masterMind.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	@Test
	public void testGame() {
		Limits limits = new Limits();
		Game game = new Game(limits);
		limits.setCombinationLength(4);
		limits.setCombinationColors(6);
		game.reset();
		Color[] colors = game.getSecretCombinationColors();
		for (int i = 0; i < colors.length; i++) {
			assertNotNull(colors[i]);
			assertTrue(colors[i].ordinal() < 6);
			for (int j = i+1; j < colors.length; j++) {
				assertFalse(colors[i] == colors[j]);
			}
		}
		Color[][] proposalColors = game.getProposalCombinationColors();
		assertEquals(0, proposalColors.length);
	}
	
	

}
