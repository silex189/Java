package test.java.masterMind.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class SecretCombinationTest {

	private SecretCombination secretCombination;

	@Test
	public void testSecretCombination() {
		Limits limits = new Limits();
		limits.setCombinationLength(4);
		limits.setCombinationColors(6);
		secretCombination = new SecretCombination(limits);
		Color[] colors = secretCombination.getColors();
		for (int i = 0; i < colors.length; i++) {
			assertNotNull(colors[i]);
			assertTrue(colors[i].ordinal() < 6);
			for (int j = i+1; j < colors.length; j++) {
				assertFalse(colors[i] == colors[j]);
			}
		}
	}

	@Test
	public void testGetResponse() {
		Limits limits = new Limits();
		limits.setCombinationLength(4);
		limits.setCombinationColors(6);
		secretCombination = new SecretCombination(limits);
		int combinationLength = secretCombination.getColors().length;
		ProposalCombination proposalCombination = new ProposalCombination(
				secretCombination.getColors(), secretCombination);
		Result result = proposalCombination.getResult();
		assertEquals(combinationLength, result.getBulls());
	}

}
